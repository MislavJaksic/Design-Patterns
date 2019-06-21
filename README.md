<p align="center">
  <img width="400" src="images/uml.png" alt="UML diagram"></a>
</p>

## Design patterns

Sources:  
* [List of patterns and their UML diagrams](https://java-design-patterns.com/)
* [List of patterns and their simple explainations](https://github.com/kamranahmedse/design-patterns-for-humans)
* [By the book implementations of Head First Design Patterns patterns](https://github.com/bethrobson/Head-First-Design-Patterns)

### Creational patterns

#### Abstract factory

Provides an interface for creating families of related or dependent objects without specifying their concrete classes. 

#### Factory method

Defines an interface for creating a single object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.   

#### Singleton

Ensures a class has only one instance, and provides a global point of access to it.  

### Structural patterns

#### Decorator

Attaches additional responsibilities to an object dynamically keeping the same interface. Decorators provide a flexible alternative to subclassing for extending functionality.  

### Behavioral patterns

#### Observer

Defines a one-to-many dependency between objects where a state change in one object results in all its dependents being notified and updated automatically.  

#### Command

Encapsulates a request as an object, thereby allowing for the parameterization of clients with different requests, and the queuing or logging of requests. It also allows for the support of undoable operations.  

#### Strategy

Defines a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.  
