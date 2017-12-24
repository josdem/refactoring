Replace conditional with polymorphism
--------------------------------------

The essence of polymorphism is that it allows you to avoid writing an explicit conditional when you have objects whose behavior varies depending on their types. Polymorphism gives you many advantages. The biggest gain occurs when this same set of conditions appears in many places in the program. if you want to add a new type, you have to find and update all the conditionals, but with subclasses you just create a new subclass and provide the appropriate methods.