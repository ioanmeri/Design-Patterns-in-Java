-----------------------------------
| Single Responsibility Principle |
-----------------------------------

A class should have just a single reason to change.

A single class should have one primary responsibility
, otherwise, it creates a GOD anti-pattern

Example:
--------
A Journal class with:
- addEntry()
- removeEntry()

if save and load methods are added to the Journal class, it's a violation of the SRP
because they add persistence. These methods should be in a separate class.

Separation of concerns: 

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; the single responsibility principle basically tries to force a single responsibility
to every single class
