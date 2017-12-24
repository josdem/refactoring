Introduce Parameter Object
-----------------------------

You have a group of parameters that naturally go together, replace them with an object.

Often you see a particular group of parameters that tend to be passed together. Several methods may use this group, either on one class or in several classes. Such a group of classes is a data clump and can be replaced with an object that carries all of this data. This refactoring is useful because it reduces the size of parameter list, and long parameter lists are hard to understand.