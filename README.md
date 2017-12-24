Replace Temp With Query
------------------------------------

You are using temporary variable to hold the result of an expression. Extract the expression into a method. Replace all the references to the temp with the new method.

The problem with temps is that they are temporary and local. Because they can be seen only in the context of the method in wich they are used, temps tend to encourage longer methods, because that’s the only way you can reach the temp. By replacing the temp with query method, any method in the class can get at the information. That helps a lot in coming up with cleaner code for the class.