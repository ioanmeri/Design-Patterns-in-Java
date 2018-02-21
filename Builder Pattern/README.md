-------------------
| Builder Pattern |
-------------------

**Used for creating object instances**

* Especially useful when dealing with classes which have a large number of constructor arguments

* Simplifies the construction of an object by introducing
handy methods rather than having multiple constructors

* Users don't have to worry about the order of the constructor arguments

### Procedure

1. In the User class add private constructor.
	
	(clients of this class can no longer use the new keyword to instantiate an instance)

2. Add a nested class called Builder inside the User class.
	
	(It has the build method, which invokes the User's object constructor and passes itself to it, to return an instance of User)
	This creates the User object, is an immutable object(no setters are used

3. From the App create a User in this format:
```
	User websiteUser = new User.Builder("bobMax","bobMax@gmail.com")
				.firstName("bob")
				.lastName("Max")
				.phoneNumber(1234567)
				.address("Some Place 1111")
				.build();
```	

#### This design provides a solution to the:
* Telescoping Constructor Anti pattern
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  *when there are multiple overload versions of constructor classes*
* use of the default constructor 
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *where multiple getters and setters must be used which is a bad practice because it's* **not thread safe**  -

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *the state of the object changes from one line to another*
