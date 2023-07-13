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
