# Java-OOPS
All java oops related concept and practice

Source is https://chat.openai.com/share/ea2ac6bd-068b-4468-8033-25da3cd35fa7

* OOPS 
Object-oriented programming (OOP) is a programming paradigm that organizes code into reusable, self-contained objects that interact with each other to perform specific tasks. It provides a way of structuring and designing software by representing real-world entities as objects.

In OOP, an object is an instance of a class, which serves as a blueprint or template for creating objects. A class defines the properties (attributes) and behaviors (methods) that an object of that class can have. Attributes represent the data associated with an object, while methods define the actions or operations that the object can perform.


* CLASSES AND OBJECTS
In Java, a class is a blueprint or template that defines the structure and behavior of objects. It specifies the properties (attributes) and actions (methods) that objects of that class can have. An object, on the other hand, is an instance of a class, created using the "new" keyword.



* CONSTRUCTORS
In Java, a constructor is a special method within a class that is used to initialize objects of that class. It is called automatically when an object is created using the "new" keyword. The purpose of a constructor is to ensure that the object is properly initialized and in a valid state.

Key points about constructors:

Constructor name: A constructor has the same name as the class it belongs to. It does not have a return type, not even void.

Initialization: Constructors are responsible for initializing the attributes of an object. They can set default values or accept arguments to initialize the object's state.

Multiple constructors: A class can have multiple constructors, each with a different set of parameters. This is known as constructor overloading. Java determines which constructor to call based on the arguments provided when creating an object.

Default constructor: If a class does not define any constructors, Java automatically provides a default constructor with no parameters. It initializes the object with default values (e.g., zero for numeric types, null for reference types).

Implicit super constructor: If a class extends another class, the subclass constructor implicitly calls the superclass constructor as its first statement. If the superclass has multiple constructors, the subclass constructor must explicitly call one of them using the "super" keyword.


* KEYWORD "this"

Certainly! In Java, the this keyword is a reference to the current object within a class. It is used to refer to the instance variables and methods of the object on which the method is being called. Here are some key points about the this keyword:

Distinguishing Between Instance Variables and Local Variables: When a method or constructor parameter has the same name as an instance variable, the this keyword is used to differentiate between them. 

Constructor Chaining: In a constructor, this can be used to call another constructor within the same class. This is known as constructor chaining. It allows you to reuse code from one constructor in another constructor.



* INHERITANCE 

Inheritance is a fundamental concept in object-oriented programming that allows a new class to be derived from an existing class. The new class, known as the derived class or subclass, inherits the properties and behaviors of the existing class, referred to as the base class or superclass. This mechanism promotes code reuse and facilitates the creation of hierarchical relationships between classes.In Java, inheritance is achieved using the "extends" keyword.


*TYPES OF INHERITANCE

1.Single Inheritance: In single inheritance, a derived class extends only one base class. It forms a one-to-one inheritance relationship.

2.Multiple Inheritance (not supported in Java): Multiple inheritance allows a derived class to inherit from multiple base classes. However, Java does not support multiple inheritance of classes, only interfaces. Multiple inheritance can lead to the "diamond problem" where ambiguity arises if two base classes have a method with the same signature. To avoid this, Java prefers interface implementation over multiple class inheritance.

3.Multilevel Inheritance: Multilevel inheritance involves deriving a class from another derived class. It forms a hierarchy of classes. 

4.Hierarchical Inheritance: Hierarchical inheritance occurs when multiple derived classes inherit from a single base class. It represents a one-to-many inheritance relationship. For example

5.Hybrid Inheritance: Hybrid inheritance is a combination of multiple types of inheritance. It can involve multiple inheritance and multilevel inheritance together. However, as mentioned earlier, Java does not support multiple inheritance of classes, only interfaces


* KEYWORD "super"
In Java, the "super" keyword is used to refer to the imediate superclass (base class) of a derived class (subclass).It provides a way to access and call members (methods, fields, or constructors) of the superclass from within the subclass.
The "super" keyword can be used in the following way:

1.Accessing Superclass Members: The "super" keyword can be used to access methods or fields of the superclass from within the subclass

2.Invoking Superclass Constructor: The "super" keyword can also be used to invoke the constructor of the superclass from within the subclass's constructor.


* OVERRIDING

In object-oriented programming, method overriding is a feature that allows a subclass to provide a different implementation of a method that is already defined in its superclass. It enables a subclass to redefine the behavior of an inherited method according to its specific requirements.

To override a method, the subclass must declare a method with the same name, return type, and parameter list as the method in the superclass. The "override" annotation (or "@Override" in Java) is often used to explicitly indicate that a method is intended to override a superclass method. This helps in ensuring that the method signature in the subclass matches the method being overridden in the superclass.


* ENCAPSULATION
Encapsulation is a fundamental principle in object-oriented programming that combines data (attributes) and the methods (behavior) that operate on that data into a single unit called an object. It is a way of organizing and protecting the internal state of an object by hiding the implementation details and providing a controlled interface to interact with the object

The main goal of encapsulation is to bundle related data and behavior together, ensuring that the object's internal state is accessed and modified only through well-defined methods. These methods, often referred to as getter and setter methods or accessors and mutators, provide controlled access to the object's attributes and enforce data validation and integrity.



* ABSTRACTION
Abstraction is a concept in programming that allows us to focus on the essential features and behavior of an object while hiding unnecessary details. It simplifies complex systems by breaking them down into manageable and understandable parts.

Abstraction is achieved through abstract classes and interfaces. An abstract class is a class that cannot be instantiated and serves as a blueprint for derived classes. It can define abstract methods (methods without implementation) and also provide implementations for common behaviors. Derived classes inherit from the abstract class and provide their own implementations for the abstract methods.

Interfaces, on the other hand, define a contract of methods that a class must implement. They provide a way to achieve abstraction by specifying what an object can do without concerning how it does it. Classes can implement multiple interfaces, enabling them to exhibit different behaviors.
