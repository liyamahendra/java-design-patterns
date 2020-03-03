# Creational Design Patterns

Creational design patterns are all about class instantiation or object creation. These patterns can be further categorized into Class-creational patterns and Object-creational patterns. Creational design patterns are:

-   Factory
-   Abstract Factory
-   Singleton
-   Builder
-   Prototype
-   Object Pool

**Factory Pattern:** In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

**Abstract Factory Pattern:** Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

**Singleton Pattern:** Singleton Pattern involves a single class which is responsible to create an object and making sure that one and only one object gets created. The Constructor of the Singleton class is always Private, which prevents calling the new operator on the call to create a new instance.

**Builder Pattern:** Builder pattern builds a complex object using simple objects and using a step by step approach. To visualize this, we can create a Builder pattern for a meal which contains two food items: Burger and Coke.

**Prototype Pattern:** Prototype pattern refers to creating duplicate object while keeping performance in mind. This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.
