# Introduction to design patterns: creational & structural patterns

## What is a design pattern?

> A design pattern is a practical proven solution to a recurring design problem.

* 23 design patterns identified in the book `Design Patterns, Elements of Reusable Object-Oriented Software (Gamma, Helm, Johnson, and Vlissides)`.
* Design patterns or not only theoritical solutions, they are well implemented in industrial software.
* Although design patterns are well defined, it is not always obvious which one will be the best fit for the problem at hands.
* Design patterns are at a higher level of details than frameworks for instance.
* In addition to better software, design patterns helps to have a common vocabulary around software design solution.

> Design patters are defined by their purpose or intent, and not the by the exact code

## Types of design patterns: creational, structural, and behavioural patterns

There were 23 design patterns initialy defined in the Gang of Four's book, that can be divided in the following categories:

* Creational patterns: handle how new objects are created.
* Structural patterns: describe how objects are connected to each other (interactions and relationships).
* Behaviroual patterns: describe how objects distribute work, and how independent objects work towards a common goal/

## Creational patterns

### Singleton pattern
[refactoring.guru: Singleton](https://refactoring.guru/design-patterns/singleton)
> Having only one object of a class, usually accessible globally within the programming

**Implementation**

* Make constructor private
* Declare a class variable refering to the single instance
* Add a public method that checks if the instance is already created, and else use the priate constructor.


**Quirks**

* Leads to lazy creation
* Care must be taken with multiple threads


### Factory Method pattern

[refactoring.guru: Factory Method](https://refactoring.guru/design-patterns/factory-method)

> Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

**Implementation**

* Make the products implement a common interface.
* Add a factory method to the creator class
* Make the creator class inheritable with the factory method overridable.

**Quirks**

* The name *creator class* is misleading since this class usually focus on the business logic and not on the actual object instanciation.
* If there are multiple classes in the creator class for which you want to implement this pattern, or even if one class has many subclasses it can lead to long switch statements.
* Different from using a factory object. See [refactoring.guru: Factory Comparison](https://refactoring.guru/design-patterns/factory-comparison)

## Structural patterns

### Facade pattern

> A facade is a wrapper class that encapsulate the subsystem in order to hide the subsystem's complexity

**Implementation**

* Design an interface
* Implement the interface through one or multiple classes
* Create a facade class that wraps the classes that implement the interface
* Use these classees through the facade class

**Quirks**

* Facade does not add functionnalities to the subsystem
* Remove the needs for client to manage the subsystem and reduce the coupling between the two
* Facade can become a *god object* couple to all classes of an application


### Adapter pattern

[refactoring.guru: Adapter pattern](https://refactoring.guru/design-patterns/adapter)

> The adapter design pattern will help facilitate communication between two existing systems by providing a compatible interface

**Implementation**

* Implement the client interface with the adapter class using the target (*adaptee*)


**Quirks**

* The adapter can work both way by implementing both interface (client and target)

### Composite pattern

[refactoring.guru: Composite pattern](https://refactoring.guru/design-patterns/composite)

<!--  todo -->

> The adapter design pattern will help facilitate communication between two existing systems by providing a compatible interface

**Implementation**

* Implement the client interface with the adapter class using the target (*adaptee*)


**Quirks**

* The adapter can work both way by implementing both interface (client and target)


## Behavioural patterns
