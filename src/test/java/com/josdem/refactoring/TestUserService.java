package com.josdem.refactoring;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestUserService {

	@InjectMocks
	private UserService userService = new UserService();
	
	@Mock
	private User user;
	@Mock
	private UserRepository userRepository;

	private String uuid = "uuid";
	private String email = "email";
	private String account = "account";

	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldFindUserByUuid() throws Exception {
		when(userRepository.findByUuid(uuid)).thenReturn(user);
		assertEquals(user, userService.findUserByUuid(uuid));
	}
	
	@Test
	public void shouldFindUserByAccount() throws Exception {
		when(userRepository.findByAccount(account)).thenReturn(user);
		assertEquals(user, userService.findUserByAccount(account));
	}
	
	@Test
	public void shouldFindUserByEmail() throws Exception {
		when(userRepository.findByEmail(email)).thenReturn(user);
		assertEquals(user, userService.findUserByEmail(email));
	}
	
	@Test
	public void shouldSaveUser() throws Exception {
		userService.saveUser(uuid, account, email);
		verify(userRepository).save(uuid, account, email);
	}

}
