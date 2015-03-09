package com.josdem.refactoring;

public class UserService {
	
	UserRepository userRepository;
	
	public User findUserByUuid(String uuid){
		return userRepository.findByUuid(uuid);
	}
	
	public User findUserByAccount(String account){
		return userRepository.findByAccount(account);
	}
	
	public User findUserByEmail(String email){
		return userRepository.findByEmail(email);
	}
	
	public void saveUser(String uuid, String account, String email){
		userRepository.save(uuid, account, email);
	}

}
