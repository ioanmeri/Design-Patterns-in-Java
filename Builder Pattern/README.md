-------------------
| Builder Pattern |
-------------------

=> Used for creating object instances

Especially useful when dealing with classes which have a large
number of constructor arguments


Simplifies the construction of an object by introducing
handy methods rather than having multiple constructors

Users don't have to worry about the order of the constructor arguments

1. In the User class add private constructor.
	(clients of this class can no longer use the new keyword to instantiate
	an instance)

2. Add a nested class called Builder inside the User class.
	It has the build method, which invokes the User's object constructor
	and passes itself to it, to return an instance of User
	This creates the User object, is an immutable object(no setters )



//Telescoping Constructor Anti pattern
	//when there are multiple overload versions of constructor classes
	//also using the default constructor and having multiple 
	//getters and setters is a bad practice
	//because it's not thread safe(the state of the object changes
	//from one line to another)
	
	