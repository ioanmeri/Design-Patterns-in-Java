---------------------
| Singleton Pattern |
---------------------

A singleton is a class that is instantiated exactly once.

* The key point about singletons is that they do not have a public constructor.
Clients cannot use new keyword to create many objects.

* Singletons have a static member variable. It is static because it is an instance independent field.

* The values stored in static variables are the same for all the objects created from this class. All instances share a static copy of this variable

#### Procedure
1. Add an empty private constructor to the singleton class
2. add private static INSTANCE variable = null;
3. add a public method getInstance() which can be used from the client.
	 Only if instance is null, the Singleton class is instantiated (only once)
 
