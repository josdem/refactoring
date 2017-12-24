Replace Error Code with Exception
------------------------------------

A method returns special code to indicate a wrong path. Throw an exception instead.

In computers, as in life, things go wrong occasionally, when things go wrong, you need to do something about it. In the simplest case, you can stop the program with an error code. When a routine finds an error, it needs to let its caller know, and the caller may pass the error up to the chain.