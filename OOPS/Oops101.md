<!-- TOC -->

- [What is Object Oriented Programming ?](#what-is-object-oriented-programming-)
  - [Thinking differnce between OOP and other conventional programming](#thinking-differnce-between-oop-and-other-conventional-programming)
  - [Advantages of OOP](#advantages-of-oop)
  - [Disadvantages of OOP](#disadvantages-of-oop)
- [What is a class in java ?](#what-is-a-class-in-java-)
  - [Example](#example)
  - [Understanding Objects](#understanding-objects)
  - [How to use this class using object ?](#how-to-use-this-class-using-object-)
  - [Understanding the `new` keyword](#understanding-the-new-keyword)
  - [How to manipulate the state of an object ?](#how-to-manipulate-the-state-of-an-object-)
- [Java constructor](#java-constructor)
  - [Explain the usage of constructor in Java ?](#explain-the-usage-of-constructor-in-java-)
  - [Basic syntax of a constructor](#basic-syntax-of-a-constructor)
  - [Default constructor](#default-constructor)
  - [Constructor overloading](#constructor-overloading)
  - [Does a class inherit the constructor of its superclass ?](#does-a-class-inherit-the-constructor-of-its-superclass-)
- [Pass by value, and Pass by reference in java](#pass-by-value-and-pass-by-reference-in-java)
  - [Pass by Value (int, float, char, etc.)](#pass-by-value-int-float-char-etc)
  - [Pass by Reference (objects)](#pass-by-reference-objects)
- [Wrapper Classes](#wrapper-classes)
- [Access Modifiers](#access-modifiers)
    - [Public Modifier](#public-modifier)
    - [Protected Modifier](#protected-modifier)
    - [Default Modifier](#default-modifier)
  - [MidSem1 : how to control the level of reusability of inheritance in Java](#midsem1--how-to-control-the-level-of-reusability-of-inheritance-in-java)
- [Relationship in Classes Java](#relationship-in-classes-java)
  - [Advantages of relationship in classes](#advantages-of-relationship-in-classes)
  - [Inheritance (IS-A relationship)](#inheritance-is-a-relationship)
  - [Association (HAS-A relationship)](#association-has-a-relationship)
  - [Dependencies (Use, call)](#dependencies-use-call)
- [Relationship between objects in Java](#relationship-between-objects-in-java)
- [Single Responsibility Principle (SRP) for Java](#single-responsibility-principle-srp-for-java)
- [Don’t Repeat Yourself (DRY) Principle in java](#dont-repeat-yourself-dry-principle-in-java)
- [Tight coupling and Loose coupling in java](#tight-coupling-and-loose-coupling-in-java)
  - [Tightly Coupled Classes](#tightly-coupled-classes)
  - [Loosely Coupled Classes](#loosely-coupled-classes)
- [Advantages of Java](#advantages-of-java)
- [JDK, JRE, JVM](#jdk-jre-jvm)
- [Java bytecode](#java-bytecode)
  - [Java bytecode advantages](#java-bytecode-advantages)
- [Data types in Java](#data-types-in-java)
- [Garbage collection](#garbage-collection)
  - [Methods in Java Garbage Collection](#methods-in-java-garbage-collection)
    - [Finalize() method](#finalize-method)
    - [System.gc() method](#systemgc-method)
- [Use of objects as a Parameter in Java](#use-of-objects-as-a-parameter-in-java)
- [What is String Class in Java ?](#what-is-string-class-in-java-)
  - [Disadvantages of String Class](#disadvantages-of-string-class)
  - [Concept of immutable string](#concept-of-immutable-string)
  - [String methods](#string-methods)
- [StringBuffer Class](#stringbuffer-class)
  - [Concept of mutable string](#concept-of-mutable-string)
  - [StringBuffer methods](#stringbuffer-methods)
- [StringBuilder Class](#stringbuilder-class)
  - [Difference between StringBuffer and StringBuilder](#difference-between-stringbuffer-and-stringbuilder)
- [File handling in Java](#file-handling-in-java)
  - [What is a stream ?](#what-is-a-stream-)
- [Types of streams](#types-of-streams)
  - [Binary Stream](#binary-stream)
    - [InputStream class subclasses](#inputstream-class-subclasses)
  - [Character Stream](#character-stream)
- [Introduction to BufferedReader class](#introduction-to-bufferedreader-class)
  - [Example](#example-1)
- [Introduction to Scanner class](#introduction-to-scanner-class)
  - [Example](#example-2)
  - [Difference between BufferedReader and Scanner class](#difference-between-bufferedreader-and-scanner-class)
  - [Methods of Scanner class](#methods-of-scanner-class)
  - [Methods of BufferedReader class](#methods-of-bufferedreader-class)
- [Subclasses, Superclasses, and Inheritance](#subclasses-superclasses-and-inheritance)
  - [Superclasses and Subclasses](#superclasses-and-subclasses)
  - [Example](#example-3)
  - [Multi level hierarchy](#multi-level-hierarchy)
  - [Constructor Chaining](#constructor-chaining)
- [Dynamic method dispatch](#dynamic-method-dispatch)
    - [Example](#example-4)
- [Method Hiding](#method-hiding)
  - [What is method overriding?](#what-is-method-overriding)
  - [What is method hiding?](#what-is-method-hiding)
  - [Summary](#summary)
- [Implicit, Explicit casting](#implicit-explicit-casting)
- [Object typecasting](#object-typecasting)
  - [How to Typecast Objects with a dynamically loaded Class ?](#how-to-typecast-objects-with-a-dynamically-loaded-class-)
    - [Upcasting](#upcasting)
    - [Downcasting](#downcasting)
- [Packages](#packages)
  - [Advantages of using packages](#advantages-of-using-packages)
  - [Buit-in packages](#buit-in-packages)
  - [Member access for packages in Java](#member-access-for-packages-in-java)
  - [Creating a package](#creating-a-package)
- [What is Errors in Java ?](#what-is-errors-in-java-)
- [What is Exception in Java ?](#what-is-exception-in-java-)
  - [Types of Exception in Java](#types-of-exception-in-java)
    - [1. Checked Exception](#1-checked-exception)
    - [2. Unchecked Exception](#2-unchecked-exception)
    - [3. Error](#3-error)
  - [Diff b/w Error and Exception in Java ?](#diff-bw-error-and-exception-in-java-)
- [What is Exception Handling in Java ?](#what-is-exception-handling-in-java-)
  - [Advantage of Exception Handling](#advantage-of-exception-handling)
  - [Problem without exception handling](#problem-without-exception-handling)
  - [Solution by exception handling](#solution-by-exception-handling)
  - [Java Exception Keywords](#java-exception-keywords)
  - [Example of `throw` and `throws` keywords](#example-of-throw-and-throws-keywords)
  - [Java Exception Handling Example](#java-exception-handling-example)
  - [Common Scenarios of Java Exceptions](#common-scenarios-of-java-exceptions)
    - [ArithmeticException occurs](#arithmeticexception-occurs)
    - [NullPointerException occurs](#nullpointerexception-occurs)
    - [NumberFormatException occurs](#numberformatexception-occurs)
    - [ArrayIndexOutOfBoundsException occurs](#arrayindexoutofboundsexception-occurs)
- [Java try-catch block](#java-try-catch-block)
  - [Java try block](#java-try-block)
  - [Java catch block](#java-catch-block)
  - [Internal working of Java try-catch block](#internal-working-of-java-try-catch-block)
- [Threading in Java](#threading-in-java)
  - [Introduction to process](#introduction-to-process)
  - [Threads in Java](#threads-in-java)
  - [Difference between process and thread](#difference-between-process-and-thread)
  - [Scheduling in Java](#scheduling-in-java)
  - [Context Switching in Java](#context-switching-in-java)
  - [Multihreading in Java](#multihreading-in-java)
    - [What is Multithreading?](#what-is-multithreading)
    - [Advantages of Multithreading](#advantages-of-multithreading)
    - [Main thread](#main-thread)
    - [Multithreading vs Multiprocessing](#multithreading-vs-multiprocessing)
    - [How does Java Support Multithreading?](#how-does-java-support-multithreading)
    - [What are the different types of threads?](#what-are-the-different-types-of-threads)
    - [What is Thread Priority?](#what-is-thread-priority)
    - [Life Cycle of a Thread](#life-cycle-of-a-thread)
- [Thread Creation](#thread-creation)
  - [1. Thread class](#1-thread-class)
  - [2. Runnable interface](#2-runnable-interface)
- [Important methods in Java thread](#important-methods-in-java-thread)
  - [`start()`](#start)
  - [`run()`](#run)
    - [Diff between `start()` and `run()` ?](#diff-between-start-and-run-)
  - [`yield()`](#yield)
  - [`sleep(long milliseconds)`](#sleeplong-milliseconds)
  - [`join()`](#join)
  - [`suspend()` and `resume()`](#suspend-and-resume)
  - [`wait()`, `notify()` and `notifyAll()`](#wait-notify-and-notifyall)
- [Synchronization in Java Multithreading](#synchronization-in-java-multithreading)
- [Thread Deadlock](#thread-deadlock)

<!-- /TOC -->
# What is Object Oriented Programming ?

Object-oriented programming (OOP) is a programming paradigm that organizes code into reusable, self-contained units called objects It is based on several principles, including encapsulation, inheritance, polymorphism, and abstraction.

In Java, everything is an object. This means that you can create objects to represent real-world entities, such as cars, houses, and people. You can also create objects to represent abstract concepts, such as numbers, colors, and shapes.

## Thinking differnce between OOP and other conventional programming

In conventional programming, you write code that performs a series of steps to solve a problem. In object-oriented programming, you write code that creates objects and then uses those objects to solve the problem.

For example, let's say you want to write a program that calculates the area of a circle. In conventional programming, you might write code that performs the following steps:

- Get the radius of the circle from the user
- Calculate the area of the circle using the formula A = πr2
- Display the result to the user
  
In object-oriented programming, you might write code that creates a Circle object and then uses that object to calculate the area of the circle. The Circle object would have a method called `getArea()` that returns the area of the circle. The code would look something like this:

```java
Circle circle = new Circle();
double area = circle.getArea();
System.out.println("Area of circle: " + area);
```

In summary, object-oriented programming is a programming paradigm that uses objects and their interactions to design applications and computer programs. It is based on several principles, including encapsulation, inheritance, polymorphism, and abstraction.

## Advantages of OOP

- **Modularity**: The ability to break a program into smaller, more manageable pieces.
- **Reusability**: The ability to reuse code that has already been written.
- **Extensibility**: The ability to add new features to a program without breaking the existing code.
- **Encapsulation**: The ability to hide the internal details of a class from other classes.
- **Inheritance**: The ability to create new classes that inherit the attributes and methods of existing classes.
- **Polymorphism**: The ability to use an object in different ways depending on the context.
- **Abstraction**: The ability to represent the essential features of an object without including the background details.
- **Composition**: The ability to combine simple objects to create more complex objects.
- **Delegation**: The ability to pass responsibility for a task to another object.
- **Interfaces**: The ability to define a common set of methods that can be implemented by multiple classes.

## Disadvantages of OOP

- **Complexity**: Object-oriented programming is more complex than procedural programming because it requires you to think about the relationships between objects and how they interact with each other.
- **Performance**: Object-oriented programming is slower than procedural programming because it requires more memory and processing power.
- **Learning Curve**: Object-oriented programming is more difficult to learn than procedural programming because it requires you to think about the relationships between objects and how they interact with each other.
- **Debugging**: Object-oriented programming is more difficult to debug than procedural programming because it requires you to think about the relationships between objects and how they interact with each other.
# What is a class in java ?

A **class is a logical blueprint/template** from which individual objects are created. It is a collection of variables and methods. It is a user defined data type.

It always starts with the keyword `class` followed by the name of the class. The name of the class should always start with a capital letter.


The `display()` method is used to display the details of the student. It is a member function of the class.

## Example

```java
public class StudentType {
    String name;
    int rollNo;
    String address;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Address: " + address);
    }
}
```

## Understanding Objects

An object is an instance of a class. It is a physical entity. It is a real world entity. Here are the properties of an object:

- It has a **state**. It is represented by the attributes of the class. For example, the name, roll no and address of the student are the attributes of the student object.
- It has a **behavior**. It is represented by the methods of the class. For example, the `display()` method is used to display the details of the student.
- It has an **identity**. It is represented by an address. It is a `unique` identifier.

## How to use this class using object ?

We can create an object of the class and access the variables and methods of the class using the object. The `student` object is created using the `new` keyword.

The `new` keyword is used to create an object of a class. It allocates memory for the object and returns a reference to the object.

```java
public class Main {
    public static void main(String[] args) {
        StudentType student1 = new StudentType();
        student1.name = "John";
        student1.rollNo = 1;
        student1.address = "New York";

        student.display();
    }
}
```

## Understanding the `new` keyword

```java
StudentType student1
```

This runs at **compile** time. It allocates memory for the object and returns a reference to the object. The reference is stored in the `student1` variable. Compile time is the time when the code is compiled.

```java
new StudentType();
```

This runs at **runtime**. It allocates memory for the object and returns a reference to the object. The reference is stored in the `student1` variable. Runtime is the time when the code is executed.

## How to manipulate the state of an object ?

We can manipulate the state of an object by using the methods of the class. The `display()` method is used to display the details of the student. It is a member function of the class.

```java
public class StudentType {
    String name;
    int rollNo;
    String address;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Address: " + address);
    }
}
```

# Java constructor

In Java, a constructor is a special method that is used to initialize an object of a class. When an object is created using the new keyword, the constructor is automatically called to initialize the object's state. 

> It has the same name as the class and is syntactically similar to a method. However, constructors have no explicit return type.

## Explain the usage of constructor in Java ?

In Java, a constructor is a special method that is used to initialize objects of a class. It is called automatically when an object is created using the new keyword. The constructor has the same name as the class and does not have a return type, not even void.

Constructors are primarily used to set initial values for the instance variables (also known as member variables or fields) of an object. They ensure that the object is in a valid and usable state when it is created. Constructors can also perform other initialization tasks or set up resources needed by the object.

```java
public class Car {
    private String model;
    private String color;
    private int year;

    // Constructor
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Other methods and members of the Car class...
}
```

In the above example, the Car class has a constructor that takes three parameters: model, color, and year. Inside the constructor, the values of these parameters are assigned to the corresponding instance variables using the this keyword. The this keyword refers to the current object instance.

When creating a new Car object, the constructor is invoked and the provided values are used to initialize the object's state:

```java
Car myCar = new Car("Toyota Camry", "Blue", 2023);
```

In this case, the constructor is called with the arguments "Toyota Camry", "Blue", and 2023, and the myCar object is created with those initial values.

It's important to note that if a class does not explicitly define any constructors, Java provides a default constructor with no arguments. However, if you define your own constructor(s), the default constructor is not automatically created unless you explicitly define it.

## Basic syntax of a constructor

```java
public class MyClass {
    public MyClass() {
        // Constructor code
    }
}
```



```java
public class Car {
    private String make;
    private String model;
    private int year;
    
    // Constructor with parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Getter methods for private fields
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public static void main(String[] args) {
        // Create a new Car object using the constructor
        Car myCar = new Car("Honda", "Civic", 2022);
        
        // Call the getter methods to access the object's state
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
    }
}

```

In the above example the `Car` class has 3 private fields : `make`, `model` and `year`. 

## Default constructor

```java
public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        // Initialize instance variables
        name = "John Doe";
        age = 0;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

In the above example, the Person class has a default constructor. It initializes the name attribute with the default value "John Doe" and the age attribute with the default value 0. This default constructor will be automatically called when an instance of the Person class is created without any arguments.

```java
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Person using the default constructor
        Person person = new Person();

        // Accessing instance variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying instance variables
        person.setName("Jane Smith");
        person.setAge(25);

        // Accessing modified instance variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
```

## Constructor overloading

Constructor overloading is a feature in Java that allows a class to have multiple constructors with different parameter lists. This means that a class can be instantiated in different ways, depending on the arguments passed to the constructor.

When a constructor is overloaded, it means that there are multiple constructors with the same name but different parameter lists. **Each constructor can have a different number or type of parameters.**

```java

public class Rectangle {
    private int width;
    private int height;
    
    // Constructor with no parameters
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }
    
    // Constructor with one parameter
    public Rectangle(int size) {
        this.width = size;
        this.height = size;
    }
    
    // Constructor with two parameters
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    // Getter methods for private fields
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public static void main(String[] args) {
        // Create Rectangle objects using different constructors
        Rectangle rect1 = new Rectangle(); // no arguments
        Rectangle rect2 = new Rectangle(5); // one argument
        Rectangle rect3 = new Rectangle(3, 4); // two arguments
        
        // Print the dimensions of each Rectangle object
        System.out.println("Rectangle 1: " + rect1.getWidth() + " x " + rect1.getHeight());
        System.out.println("Rectangle 2: " + rect2.getWidth() + " x " + rect2.getHeight());
        System.out.println("Rectangle 3: " + rect3.getWidth() + " x " + rect3.getHeight());
    }
}


```

In this example, the `Rectangle` class has three constructors that are overloaded based on the number of parameters. 

- The first constructor has no parameters and initializes the width and height to 0.

- The second constructor has one parameter and initializes both the width and height to the value of the parameter.

- The third constructor has two parameters and initializes the width and height to the values of the parameters.

## Does a class inherit the constructor of its superclass ?

No, a class does not inherit the constructor of its superclass. A class can have multiple constructors, but it does not inherit the constructors of its superclass.


# Pass by value, and Pass by reference in java

## Pass by Value (int, float, char, etc.)

In Java, primitive data types such as **int, float, char, etc., are passed by value**. When a primitive value is passed to a method, a copy of the value is made and passed to the method. 

- Any changes made to the parameter inside the method **have no effect on the original value** outside the method.

  ```java

  public static void main(String[] args) {
    int num = 10;
    increment(num);
    System.out.println(num); // Output: 10
  }
  public static void increment(int num) {
    num++;
    }
  ```

In the above example, the increment() method receives a copy of the num variable. Any changes made to the num variable inside the method are not reflected outside the method.

## Pass by Reference (objects)

In Java, objects are passed by reference. When an object is passed to a method, a copy of the reference to the object is passed to the method, not a copy of the object itself. This means that any changes made to the object inside the method **are also reflected outside the method.**

```java
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    appendString(sb);
    System.out.println(sb); // Output: Hello, World!
}

public static void appendString(StringBuilder sb) {
    sb.append(", World!");
}

```

In the above example, the `appendString()` method receives a copy of the reference to the `sb` StringBuilder object. Any changes made to the `sb` object inside the method are also reflected outside the method.

It's important to note that in Java, although objects are passed by reference, the reference itself is passed by value. This means that if you assign a new value to the reference inside the method, it does not affect the original reference outside the method.


# Wrapper Classes

In Java, a wrapper class is a class that allows you to **use primitive data types as objects.** 

For example, you can use an `Integer` object to represent an `integer` value instead of using the primitive `int` data type. Wrapper classes are used when you need to work with **objects instead of primitives**, for example, when you want to store integer values in a collection.

Java provides the following eight wrapper classes:

- Byte - represents a byte value
- Short - represents a short value
- Integer - represents an int value
- Long - represents a long value
- Float - represents a float value
- Double - represents a double value
- Character - represents a char value
- Boolean - represents a boolean value



```java
import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
       Integer a = 10;
       Integer b = 20;

       swap(a, b);
    }
}
```

If we tried swapping with `int a` and `int b`, it would not work. Because `int` is a primitive data type and it is passed by value. So, the values of `a` and `b` will not be swapped. 

But, if we use `Integer` instead of `int`, it will work. Because `Integer` is a wrapper class and it is passed by reference. So, the values of `a` and `b` will be swapped.














# Access Modifiers

In Java, access modifiers are keywords that set the accessibility or scope of a field, method, constructor, or class. There are four types of access modifiers in Java:


### Public Modifier

The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

The `main` class is always public because it is the entry point of the program. The compiler looks for the `main` method in the `main` class. So, the `main` class must be public.

```java
package p1;
public class A
{
public void display()
	{
		System.out.println("GeeksforGeeks");
	}
}

```

```java
package p2;
import p1.*;
class B {
	public static void main(String args[])
	{
		A obj = new A();
		obj.display();
	}
}
```



### Protected Modifier

The protected access modifier is specified using the keyword **protected**.

The methods or data members declared as protected are accessible **within the same package or subclasses in different packages**.

In this example, we will create two packages p1 and p2. Class A in p1 is made public, to access it in p2. The method display in class A is protected and class B is inherited from class A and this protected method is then accessed by creating an object of class B.


```java
package p1;

// Class A
public class A
{
protected void display()
	{
		System.out.println("GeeksforGeeks");
	}
}
``` 

```java
package p2;
import p1.*; // importing all classes in package p1

// Class B is subclass of A
class B extends A
{
    public static void main(String args[])
    {
	    B obj = new B();
	    obj.display();
    }
}
```

### Default Modifier

The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

```java
package p1;

// Class Geek is having Default access modifier
class Geek
{
	void display()
	{
		System.out.println("Hello World!");
	}
}

```

```java
// Java program to illustrate error while
// using class from different package with
// default modifier
package p2;
import p1.*;

// This class is having default access modifier
class GeekNew
{
	public static void main(String args[])
	{
		// Accessing class Geek from package p1
		Geek obj = new Geek();

		obj.display();
	}
}
```
## MidSem1 : how to control the level of reusability of inheritance in Java

In Java, the access modifiers public, protected, and private can be used to control the level of reusability of inheritance.

- Choose the appropriate access modifier: Use access modifiers such as public, protected, private, or no modifier to specify the visibility of classes and members.
    - public: Allows unrestricted access from any class.
    - protected: Allows access within the same package or by subclasses even in different packages.
    - private: Restricts access to only within the same class.

By choosing the appropriate access modifier, you can control the visibility of inherited members and prevent them from being accessed or overridden in certain contexts.

- Use the final keyword: Marking a class or method with the final keyword prevents it from being extended or overridden, respectively. This restricts the reusability of inheritance and ensures that the class or method behaves consistently across subclasses.

- Favor composition over inheritance: In some cases, using composition (creating objects of other classes as members) instead of inheritance can provide better flexibility and reusability. This approach allows you to reuse behavior by delegating to other objects rather than relying solely on inheritance.




# Relationship in Classes Java


If there are 2 different classes in java then there can be some relationship between them. 

![](https://i.ibb.co/xYNjRFV/2023-04-12-11-22.png)


## Advantages of relationship in classes

- Code reusability. If class B extends class A, then class B can use all the methods and variables of class A. So, there is no need to write the same code again and again.
- Cost cutting. 
- Reduced redundancy.


## Inheritance (IS-A relationship)

Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object except the constructors and private members.

```java 

    class Vehicle{
        void run(){
            System.out.println("Vehicle is running");
        }
    }

    class Bike extends Vehicle{
        public static void main(String args[]){
            Bike obj = new Bike();
            obj.run();
        }
    }

```

**Therefore the bike `IS-A` vehicle.**

## Association (HAS-A relationship)

Association is another fundamental relationship between classes that is informally known as “Has-A” relationship.

When an object of one class is created as data member inside another class, it is called association relationship in java or simply Has-A relationship.

```java

class Student
{
    String name;
    int roll;
}
```

The Student `HAS-A` name and roll.

```java

class Engine{
    int cc;
    String type;
}

class Car{
    String name;
    Engine c = new Engine();
}

```

The 2 classes are not tightly coupled, but associated with each other. The Car `HAS-A` Engine.

If 2 classes have a weak bonding we can call it as **Aggregation** else we can call it as **Composition**.

![](https://i.ibb.co/Xs7gRTn/2023-04-12-11-55.png)

![](https://i.ibb.co/NmgV09V/2023-04-12-11-51.png)


## Dependencies (Use, call)

In Java, a class can depend on another class in order to use its functionality or to call its methods. This relationship between classes is known as a dependency.

There are two types of dependencies that can occur between classes:

- Use dependency: This occurs when one class uses another class as a parameter or return type of a method. For example, if a method in class A takes an object of class B as a parameter, then class A has a use dependency on class B.

- Call dependency: This occurs when one class directly invokes a method of another class. For example, if a method in class A calls a method of class B, then class A has a call dependency on class B.

Dependencies between classes are important to consider when designing and organizing a Java program. Too many dependencies can lead to tight coupling between classes, making it difficult to modify or maintain the code. 

In general, it's a good practice to minimize dependencies between classes and to use interfaces to decouple classes from each other as much as possible. This helps to make the code more modular and easier to maintain in the long run.

```java
// Class A depends on class B
public class A {
    public void doSomething(B b) { // use dependency on class B
        b.someMethod(); // call dependency on class B
    }
}

// Class B
public class B {
    public void someMethod() {
        // do something
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        B b = new B(); // create an instance of class B
        A a = new A(); // create an instance of class A
        a.doSomething(b); // use class B in class A
    }
}
```
**Explanation**

In this example, we have two classes: class A and class B. Class A has a use dependency on class B because it uses an object of class B as a parameter in the `doSomething()` method. Class A also has a call dependency on class B because it calls the `someMethod()` method of class B.

In the `main()` method of the Main class, we create instances of class A and class B, and then use class B in class A by calling the `doSomething()` method with the object of class B as a parameter. This illustrates how one class can depend on another class in Java.


# Relationship between objects in Java

In Java, relationships among objects are established through instantiation and links.

Instantiation is the process of creating an object from a class. When an object is instantiated, memory is allocated for it and the object is initialized with the default values of its instance variables.

```java
// Class definition
public class MyClass {
    private int myNumber;
    private String myString;
    
    public MyClass(int number, String string) {
        myNumber = number;
        myString = string;
    }
}

// Instantiation
MyClass obj = new MyClass(10, "Hello");
```

In this example, we define a class **MyClass** with two instance variables **myNumber** and **myString**. 

We then create an instance of **MyClass** using the new keyword and passing arguments **10** and **"Hello"** to the constructor. The resulting object obj is an instance of **MyClass** with myNumber set to 10 and **myString** set to **"Hello"**.

Once objects are instantiated, they can be linked to each other to establish relationships among them. There are several ways to link objects in Java, including:

- Method calls: Objects can call methods on each other to exchange information or perform actions.

- Composition: One object can contain another object as an instance variable, creating a "has-a" relationship between the two.

- Inheritance: One object can be a subclass of another object, inheriting its properties and behaviors and forming an "is-a" relationship.

- Association: Objects can have a reference to each other, allowing them to interact with each other as needed.

Understanding these relationships among objects is important for creating effective and efficient object-oriented programs in Java. By carefully designing these relationships, you can create code that is easy to read, understand, and maintain.

# Single Responsibility Principle (SRP) for Java

The Single Responsibility Principle (SRP) is a principle of object-oriented design that states that a class should have only one reason to change. In other words, a class should have only one responsibility or job. This makes the class easier to understand, maintain, and test, as well as making the code more modular and reusable.

In Java, you can apply the SRP by creating classes that have a clear and well-defined responsibility. Here are some guidelines to help you apply the SRP in Java:

- Identify the responsibilities of a class
- Keep classes small and focused
- Use composition and delegation
- Refactor as needed

# Don’t Repeat Yourself (DRY) Principle in java

The Don't Repeat Yourself (DRY) principle is a software development principle that aims to reduce duplication and increase code reuse. In Java, the DRY principle can be applied in several ways:

-   Create reusable code: Instead of duplicating code in multiple places, create reusable code that can be used throughout your application. This can include creating utility classes, common methods, and abstract classes.

-   Use inheritance and polymorphism: Use inheritance and polymorphism to create common code that can be shared among classes. This can help to reduce duplication and make the code more modular.

-   Use templates: Use templates to create code that can be reused in different contexts. For example, you can use the Java Collections framework to create templates for common data structures like lists, maps, and sets.

-   Use configuration files: Use configuration files to store common settings and parameters that are used throughout your application. This can help to reduce duplication and make it easier to manage your code.

-   Refactor duplicate code: If you find that you have duplicate code in your application, refactor it into a common method or class that can be reused. This can help to reduce code duplication and make the code easier to maintain.

By applying the DRY principle in Java, you can create code that is more modular, reusable, and easier to maintain. This can help to reduce development time, improve code quality, and make it easier to make changes and updates to your application over time.



# Tight coupling and Loose coupling in java

In Java, tight coupling occurs when two classes are highly dependent on each other. This makes it difficult to modify one class without making changes to the other class. 

In contrast, loose coupling occurs when two classes are loosely coupled. This makes it easier to modify one class without making changes to the other class.

## Tightly Coupled Classes

```java
public class Journey{
    Car car = new Car();
    public void startJourney(){
        car.start();
    }
}

public class Car{
    public void start(){
        System.out.println("Car started");
    }
}
```

In the above example, the Journey class is tightly coupled to the Car class. If you make any changes to the car class , you'll have to make changes to the Journey class as well. This makes the code difficult to maintain and modify.


## Loosely Coupled Classes

```java
public interface Vehicle{
    void start();
}

public class Car implements Vehicle{
    @Override

    public void start(){
        System.out.println("Traveling by car");
    }
}

public class Bike implements Vehicle{
    @Override

    public void start(){
        System.out.println("Traveling by bike");
    }
}

public class Journey{
    public static void main(String[] args){
        Vehicle v = new Car();
        v.start();
    }
}
```

In the above exmaple the Journey class is loosely coupled to the Car and Bike classes. This makes it easier to modify the Car and Bike classes without making changes to the Journey class. This makes the code easier to maintain and modify.

Vehicle is an interface and we can use it to create loosely coupled classes. We can also use dependency injection to create loosely coupled classes.

# Advantages of Java

- **Simple**: Java is easy to learn and use. It has a concise, cohesive set of features that makes it easy to write programs that are easy to understand and maintain.
- **Object-Oriented**: Java is an object-oriented programming language. This means that it models real-world objects as software objects. For example, a car can be modeled as a software object. This makes it easier to write programs that are organized around data, rather than around actions.
- **Platform-Independent**: Java is platform-independent. This means that you can write a Java program once, and run it on any operating system. This makes it easier to develop software for multiple platforms.
# JDK, JRE, JVM

JDK, JRE, and JVM are all related to the Java programming language. Here's a simple explanation of what each of these terms means:

- **JDK (Java Development Kit)**: JDK is a software development kit used to develop Java applications. It includes tools that allow developers to write, compile, and debug their code. In other words, if you want to create Java applications, you need to install the JDK on your computer.
- **JVM (Java Virtual Machine)**: JVM is a virtual machine that interprets Java bytecode and executes it on your computer. It is a part of both the JDK and the JRE. When you run a Java program, the JVM converts the bytecode into machine code that can be executed by your computer's CPU.
- **JRE (Java Runtime Environment)**: JRE is a software environment that allows you to run Java applications on your computer. It includes the Java Virtual Machine (JVM) and other libraries that are necessary to run Java programs. So, if you want to run a Java application, you need to install the JRE on your computer.


In summary, JDK is used to develop Java applications, JRE is used to run Java applications, and JVM is the virtual machine that executes Java code


# Java bytecode

Java bytecode is a binary format that represents the instructions of a Java program. When you write Java code, you use a programming language that is easy for humans to read and write. However, a computer cannot directly understand this code. **Instead, the Java compiler takes your code and translates it into Java bytecode.**

Java bytecode is a **low-level** representation of your program that can be executed by the Java Virtual Machine (JVM). This means that your Java code can run on any computer that has a JVM installed, regardless of the operating system or hardware architecture.

## Java bytecode advantages
**One advantage of using Java bytecode is that it is platform-independent.** This means that you can write a Java program once and run it on any computer that has a JVM installed, without having to worry about the specific details of that computer's operating system or hardware.

**Another advantage of Java bytecode is that it can be optimized by the JVM at runtime.** This means that the JVM can analyze the bytecode and make optimizations based on the specific environment in which the code is running, such as the available memory or the number of processors.

In summary, Java bytecode is a low-level binary format that represents the instructions of a Java program. It can be executed by the Java Virtual Machine and is platform-independent, making it a powerful tool for writing portable and efficient Java code.

# Data types in Java

Java supports several data types that can be used to store different kinds of data in a Java program. Here is a brief summary of the main data types in Java:

- **Primitive Data** Types: Java has eight primitive data types - byte, short, int, long, float, double, char, and boolean. These data types are used to store simple values such as numbers, characters, or true/false values.

- **Non-Primitive** Data Types: Java also has non-primitive data types such as String, Arrays, and Classes. Non-primitive data types are created by the programmer and are not part of the Java language itself.

- **Wrapper Classes**: In addition to primitive data types, Java has wrapper classes that allow primitive data types to be treated as objects. Wrapper classes provide methods for converting primitive data types to and from strings, and for performing various operations on them.

- **Type Casting**: Java supports type casting, which allows you to convert one data type to another. For example, you can convert an int to a double, or a char to an int.

- **Default Values**: Java assigns default values to variables depending on their data type. For example, the default value of an int is 0, the default value of a boolean is false, and the default value of an object reference is null.

In summary, Java has several data types that can be used to store different kinds of data in a program. These data types include primitive data types, non-primitive data types, wrapper classes, and support for type casting. Understanding data types is an important part of writing correct and efficient Java programs.


# Garbage collection

In Java, garbage means unreferenced objects. Garbage collection is the process of removing unreferenced objects from memory. When an object is no longer referenced, it becomes eligible for garbage collection. The garbage collector is responsible for removing these objects from memory.

We use `free()` in C language and `delete()` in C++ to free the memory allocated to a variable. But in Java, we don't have to do this manually. 

When Java programs run on the JVM , objects are created in the heap space, which is a part of the memory allocated to the JVM. When an object is no longer referenced, it becomes eligible for garbage collection. The garbage collector is responsible for removing these objects from memory.


## Methods in Java Garbage Collection

### Finalize() method

The `finalize()` method is called by the garbage collector when it determines that there are no more references to the object. It is used to perform cleanup actions before the object is garbage collected. For example, you can use the `finalize()` method to close open files or release other system resources.

Example:

```java
public class MyClass {
    public void finalize() {
        // cleanup code here
    }
}
```

### System.gc() method

The `System.gc()` method is used to request garbage collection. It is not guaranteed that the garbage collector will run, but it is guaranteed that the garbage collector will not run if it is not requested. This method is useful for testing purposes, but should not be used in production code.

Example:

```java
public class MyClass {
    public static void main(String[] args) {
        // create objects here
        System.gc(); // request garbage collection
    }
}
```



# Use of objects as a Parameter in Java

In Java, objects can be used as parameters in methods. This allows you to pass an object to a method and have the method modify the object. For example, if you have a method called `setName()` that takes a `Person` object as a parameter, you can use the `setName()` method to change the name of the `Person` object.

Example:

```java
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
```

In this example, the `setName()` method takes a `Person` object as a parameter and changes the name of the `Person` object. This allows you to write code that is more concise and readable.

# What is String Class in Java ? 

In Java, the String class is a built-in class that represents a sequence of characters. It is used to store and manipulate strings of text.

The String class is part of the `java.lang` package, which is automatically imported into all Java programs, so you don't need to import it explicitly. This means you can use String objects directly in your code.

## Disadvantages of String Class

- String objects are immutable, which means that they cannot be changed after they are created. This means that if you want to change a string, you must create a new string object.
  
- Memory is wasted because String objects are immutable. For example, if you want to change the value of a string, you must create a new string object. This means that the old string object is no longer used and is therefore wasted memory.


## Concept of immutable string

**Let's understand how it works under the hood.**

When you create a string object, the string is stored in the memory. The string object contains a reference to the string in the memory. This means that the string object does not contain the string itself, but only a reference to the string in the memory.

**What happens when we want to change the value of a string?**

Let's say we have a string `s1` called `Tamal` which is located at `100`.

So if we now say that `s1 = s1 + "Das"` then the string `Tamal` will be copied to a new location in the memory and the new string will be `TamalDas` which will be located at `200`.

**So what happened to the old value ?**

The old value is still there at `100` and is not used anymore. This means that the old value is wasted memory.


## String methods

The String class has many useful methods that can be used to manipulate strings. Here are some of the most commonly used methods:

- `charAt()` - Returns the character at the specified index (position)
  
- `length()` - Returns the length of a string
  
- `substring()` - Extracts the characters from a string, beginning at a specified start position, and through the specified number of character

- `toLowerCase()` - Converts a string to lower case letters

- `toUpperCase()` - Converts a string to upper case letters

- `trim()` - Removes whitespace from both ends of a string

- `replace()` - Searches a string for a specified value, and returns a new string where the specified values are replaced

- `concat()` - Concatenates a specified string to the end of another string

- `equals()` - Compares two strings. Returns true if the strings are equal, and false if not

- `equalsIgnoreCase()` - Compares two strings, ignoring case considerations

- `compareTo()` - Compares two strings. Returns 0 if the strings are equal, less than 0 if the first string is less than the second string, and greater than 0 if the first string is greater than the second string

- `compareToIgnoreCase()` - Compares two strings, ignoring case considerations. Returns 0 if the strings are equal, less than 0 if the first string is less than the second string, and greater than 0 if the first string is greater than the second string

- `startsWith()` - Checks whether a string starts with specified characters

- `endsWith()` - Checks whether a string ends with specified characters

- `contains()` - Checks whether a string contains a specified sequence of characters

- `indexOf()` - Returns the position of the first found occurrence of specified characters in a string

- `lastIndexOf()` - Returns the position of the last found occurrence of specified characters in a string

- `split()` - Splits a string into an array of substrings

- `valueOf()` - Returns the string representation of a specified type


# StringBuffer Class

The StringBuffer class is used to create mutable (modifiable) strings. The StringBuffer class is part of the `java.lang` package, which is automatically imported into all Java programs, so you don't need to import it explicitly. This means you can use StringBuffer objects directly in your code.

```java
StringBuffer sb = new StringBuffer();
```

String buffer gives you a buffer which will be of 16 characters. If you want to increase the size of the buffer, you can use the `ensureCapacity()` method.

```java
sb.ensureCapacity(32);
```

## Concept of mutable string

```java

StringBuffer sb = new StringBuffer("Tamal");
sb.append("Das");
System.out.println(sb);

```

**So let's understand how it works under the hood**

When you create a string buffer object, the string is stored in the memory. The string buffer object contains a reference to the string in the memory. This means that the string buffer object does not contain the string itself, but only a reference to the string in the memory.

**What happens when we want to change the value of a string?**

Let's say we have a string buffer `sb` called `Tamal` which is located at `100`.

So if we now say that `sb.append("Das")` then the string `Tamal` will be changed to `TamalDas` which will be located at `100`.

**How is it better than String ?**

In String class,  old value is still there at `100` and is not used anymore. This means that the old value is wasted memory. 

But in the case of string buffer, the old value is still there at `100` and is used. This means that the old value is not wasted memory.

## StringBuffer methods

The StringBuffer class has many useful methods that can be used to manipulate strings. Here are some of the most commonly used methods:

- `append()` - Appends the specified string to the end of this buffer

```java
StringBuffer sb = new StringBuffer("Tamal");
sb.append("Das");
System.out.println(sb);
```

- `insert()` - Inserts the specified string into this buffer at the specified position

```java
StringBuffer sb = new StringBuffer("Tamal");
sb.insert(5, "Das");
System.out.println(sb); // TamalDas
```

- `replace()` - Replaces the characters in a substring of this buffer with characters in the specified String

```java
StringBuffer sb = new StringBuffer("Tamal");
sb.replace(0, 5, "Das");
System.out.println(sb); // Das
```


- `delete()` - Removes the characters in a substring of this buffer

```java
StringBuffer sb = new StringBuffer("Tamal");
sb.delete(0, 5);
System.out.println(sb); // ""
```


- `reverse()` - Causes this character sequence to be replaced by the reverse of the sequence

```java
StringBuffer sb = new StringBuffer("Tamal");
sb.reverse();
System.out.println(sb); // lamaT
```

# StringBuilder Class

The StringBuilder class is used to create mutable (modifiable) strings. The StringBuilder class is part of the `java.lang` package, which is automatically imported into all Java programs, so you don't need to import it explicitly. This means you can use StringBuilder objects directly in your code.

## Difference between StringBuffer and StringBuilder

StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously. StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.

# File handling in Java

File handling is an important part of any application. Java provides several classes and methods to handle files. We can perform read, write and other operations on files using these classes.

## What is a stream ?

It is a logical connection between the program and the file. It is a sequence of data. In other words, a stream is a sequence of bytes. We can't use the same stream for both reading and writing. We have to use different streams for reading and writing.

# Types of streams

There are two types of streams in Java:

## Binary Stream

It contains all types of data. It is used for reading and writing byte data. It is used for reading and writing byte data such as images, audio, video etc.
It is represented by the following classes:

- **InputStream** : It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc. You can also read character-stream data. But, for reading streams of characters, it is recommended to use FileReader class.

- **OutputStream** : It is used for writing byte-oriented data (streams of raw bytes) such as image data, audio, video etc. You can also write character-stream data. But, for writing streams of characters, it is recommended to use FileWriter class.

### InputStream class subclasses

- **FileInputStream** : It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc. You can also read character-stream data. But, for reading streams of characters, it is recommended to use FileReader class.

- **ByteArrayInputStream** : It is used to read byte array as a stream. It internally creates buffer array.

- **ObjectInputStream** : It is used to read Java objects serialized by ObjectOutputStream.


## Character Stream

It is used for reading and writing character data. It is represented by the following classes:

- **FileReader** : It is used for reading character streams such as text data (streams of characters). You can also read byte-stream data. But, for reading streams of raw bytes, it is recommended to use FileInputStream class.

- **FileWriter** : It is used for writing character streams such as text data (streams of characters). You can also write byte-stream data. But, for writing streams of raw bytes, it is recommended to use FileOutputStream class.


# Introduction to BufferedReader class

The `BufferedReader` class reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.

The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.

In general, each read request made of a Reader causes a corresponding read request to be made of the underlying character or byte stream. It is therefore advisable to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. 

For example,

```java
import java.io.BufferedReader;

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

```

will buffer the input from the specified file. Without buffering, each invocation of read() or readLine() could cause bytes to be read from the file, converted into characters, and then returned, which can be very inefficient.

We can use BufferedReader class to take input from the user.

## Example

```java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");
        String name = reader.readLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Enter your salary: ");
        double salary = Double.parseDouble(reader.readLine());

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your salary is: " + salary);
    }
}

// Input

// Enter your name:
// John
// Enter your age:
// 24
// Enter your salary:
// 25000

// Output

// Your name is: John
// Your age is: 24
// Your salary is: 25000.0

```

# Introduction to Scanner class

The `Scanner` class is used to get user input, and it is found in the `java.util` package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:

## Example

```java

import java.util.Scanner;  // Import the Scanner class

class ScannerExample {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}

// Input

// Enter username
// John

// Output

// Username is: John

```

## Difference between BufferedReader and Scanner class

Both BufferedReader and Scanner are classes in Java that are used for reading input from various sources, such as files, standard input (keyboard), or network connections. While they serve similar purposes, there are some differences between the two:

- **Input sources**: **BufferedReader** is primarily used for reading text from input sources like files or network connections. It provides efficient reading of characters or lines of text. On the other hand, **Scanner** is a more versatile class that can read not only text but also other data types like integers, floating-point numbers, etc. It can parse and extract formatted input using delimiters, making it suitable for interactive parsing.

- **Parsing abilities**: **BufferedReader** reads characters or lines of text as is, without any parsing or interpretation. It provides low-level operations for reading characters and lines. **Scanner**, on the other hand, can parse and extract formatted input. It has methods like nextInt(), nextDouble(), etc., which can directly read and parse input into specific data types. It can also use delimiters to separate tokens in the input.

- **Performance**: **BufferedReader** is generally faster and more efficient than Scanner when reading large amounts of text or when performance is a concern. BufferedReader is designed for efficient reading by buffering the input, which reduces the number of I/O operations. **Scanner**, with its additional parsing capabilities, may be slower and may consume more system resources.

- **Error handling**: **BufferedReader** throws checked exceptions like IOException, which need to be handled explicitly using try-catch blocks. On the other hand, **Scanner** does not throw checked exceptions, but it provides methods like hasNextInt(), hasNextDouble(), etc., which can be used to check if the input is of the expected type, allowing for more controlled error handling.

- **Usability**: **BufferedReader** provides basic input operations like read(), readLine(), etc., which can be useful for reading text line by line. It requires manual conversion from string to other data types if parsing is required. **Scanner**, on the other hand, provides higher-level methods for reading different data types directly, which makes it easier to use in certain scenarios. However, the additional parsing functionality of Scanner may not be necessary or desired in all cases.

In summary, BufferedReader is suitable for efficient reading of large amounts of text, while Scanner provides more versatile input parsing capabilities, making it convenient for interactive and formatted input. The choice between the two depends on the specific requirements and characteristics of the input being read.
## Methods of Scanner class

- `public String nextLine()`: For getting String input from the user.

- `public int nextInt()`: For getting integer input from the user.

- `public float nextFloat()`: For getting float input from the user.

- `public double nextDouble()`: For getting double input from the user.

- `public long nextLong()`: For getting long input from the user.

- `public boolean nextBoolean()`: For getting boolean input from the user.

## Methods of BufferedReader class

- `public String readLine()`: For getting String input from the user.
- `public int read()`: For getting integer input from the user.
- `public char readChar()`: For getting char input from the user.

# Subclasses, Superclasses, and Inheritance

Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

Inheritance represents the IS-A relationship, also known as a parent-child relationship.

## Superclasses and Subclasses

A class that is inherited is called a superclass. The class that does the inheriting is called a subclass. A subclass extends the superclass.

## Example

```java

import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int rollNo;
    private int marks;

    public Student(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter roll no: ");
        int rollNo = sc.nextInt();

        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        Student s = new Student(name, age, rollNo, marks);
        s.display();
    }
}

```

In the above example, the Person class is the superclass and the Student class is the subclass. The Student class inherits the Person class.

## Multi level hierarchy

In Java, a class can be derived from another class, and there can be derived classes from the derived classes and so on. This is known as multi-level inheritance. In this way, a multi-level hierarchy of classes can be built.

## Constructor Chaining 

Constructor chaining is the process of calling one constructor from another constructor with respect to current object.

``` java
class A{
    public A()
    {
        System.out.println("Hello A");
    }
}

class B extends A{
    public B()
    {
        System.out.println("Hello B");
    }
}

public static void main()
{
    B obj = new B();

    // Output
    // Hello A
    // Hello B
}


```





# Dynamic method dispatch

Dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at runtime, rather than compile-time. Dynamic method dispatch is an important feature of polymorphism.

When an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses) of that method is to be executed based upon the type of the object being referred to at the time the call occurs. Thus, this determination is made at run time.

### Example

```java

class A {
    public void display() {
        System.out.println("Hello");
    }
}

class B extends A {
    public void display() {
        System.out.println("Hi");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new B();
        a.display();
    }
}

// Output

// Hi

```

In the above example, the display() method of class A is overridden in the subclass B. So, the display() method of class B is invoked at runtime.




# Method Hiding

In this section, we will discuss what is method hiding in Java, method hiding factors (MHF), and the differences between method hiding and method overriding. Also, implement the method hiding concept in a Java program.

To understand the method hiding concept in Java, first, **we will understand the method overriding**. Because the method hiding concept is very similar to the method overriding.
## What is method overriding?

Method overriding is a concept in which a subclass provides a new implementation of a method that is already defined in its superclass. In this case, the subclass method "overrides" the superclass method. To implement method overriding, you define a method in the subclass with the same name, return type, and parameters as the method in the superclass that you want to override. Here's an example:

```java

class SuperClass {
  public void myMethod() {
    System.out.println("SuperClass.myMethod");
  }
}

class SubClass extends SuperClass {
  public void myMethod() {
    System.out.println("SubClass.myMethod");
  }
}

public class Main {
  public static void main(String[] args) {
    SubClass mySubClass = new SubClass();
    mySubClass.myMethod(); // Output: "SubClass.myMethod"
  }
}

```

In the above example, the `SubClass` overrides the `myMethod()` method of its superclass, `SuperClass`. In this case, the subclass method "overrides" the superclass method.

## What is method hiding?

Method hiding is a concept in which a subclass defines a static method with the same name and signature as a static method in its superclass. In this case, the subclass method "hides" the superclass method. To implement method hiding, you simply define a static method in the subclass with the same name and signature as the static method in the superclass. Here's an example:


```java

class SuperClass {
  public static void myMethod() {
    System.out.println("SuperClass.myMethod");
  }
}

class SubClass extends SuperClass {
  public static void myMethod() {
    System.out.println("SubClass.myMethod");
  }
}

```

In this example the `SubClass` defines a static method with the same name and signature as the static method in its superclass, `SuperClass`. In this case, the subclass method "hides" the superclass method.

## Summary
To summarize, the main difference between method hiding and method overriding is that method hiding involves **defining a static method** with the same name and signature as a static method in the superclass, while method overriding involves providing a new implementation of a **non-static method** that is already defined in the superclass.

# Implicit, Explicit casting
Implicit casting, also known as automatic or widening casting, occurs when the conversion between two data types happens automatically by the compiler without the need for any explicit instructions from the programmer. Implicit casting is possible when there is no possibility of data loss or precision reduction during the conversion.

``` java
int_num = 10
float_num = int_num  # Implicit casting from int to float

print(float_num)
```

Explicit casting, also known as type casting or narrowing casting, is a manual conversion process where the programmer explicitly specifies the desired data type for the conversion. Explicit casting is used when there is a possibility of data loss or precision reduction during the conversion.

```java
float_num = 3.14
int_num = int(float_num)  # Explicit casting from float to int

print(int_num) 
```

# Object typecasting

In java object typecasting one object reference can be type cast into another object reference. The cast can be to its own class type or to one of its subclass or superclass types or interfaces. There are compile-time rules and runtime rules for casting in java.

## How to Typecast Objects with a dynamically loaded Class ?

The casting of object references depends on the relationship of the classes involved in the same hierarchy. Any object reference can be assigned to a reference variable of the type Object, because the Object class is a superclass of every Java class.

### Upcasting

Upcasting is the process of converting an object of a subclass type to its superclass type. In Java, upcasting happens implicitly, and you don't need to write any code to perform the conversion. Here's an example:

```java

class Animal {
  public void makeSound() {
    System.out.println("Animal is making a sound");
  }
}

class Dog extends Animal {
  public void makeSound() {
    System.out.println("Dog is barking");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Dog(); // Upcasting
    myAnimal.makeSound(); // Output: "Dog is barking"
  }
}


```

In the above example, the `Dog` class is a subclass of the `Animal` class. We create an object of the `Dog` class and assign it to a variable of the `Animal` class. This is called upcasting. In this case, the `Dog` object is implicitly upcasted to an `Animal` object.


### Downcasting

Downcasting is the process of converting an object of a superclass type to its subclass type. In Java, downcasting must be done explicitly, and the syntax for downcasting is (Subclass) superclassObject. Here's an example:

```java

class Animal {
  public void makeSound() {
    System.out.println("Animal is making a sound");
  }
}

class Dog extends Animal {
  public void makeSound() {
    System.out.println("Dog is barking");
  }
  
  public void playFetch() {
    System.out.println("Dog is playing fetch");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Dog(); // Upcasting
    myAnimal.makeSound(); // Output: "Dog is barking"
    
    Dog myDog = (Dog) myAnimal; // Downcasting
    myDog.playFetch(); // Output: "Dog is playing fetch"
  }
}
```

In this example, we first upcast a Dog object to an Animal object and assign it to a variable of type Animal. We can call the `makeSound()` method on the Animal object, and it outputs "Dog is barking" because we have overridden this method in the Dog class.

Next, we downcast the Animal object back to a Dog object using (Dog) myAnimal. We can then call the `playFetch()` method on the Dog object, which outputs "Dog is playing fetch". This is an example of downcasting because we are converting an Animal object to a Dog object.

It's important to note that downcasting can cause a ClassCastException at runtime if the object being downcasted is not actually an instance of the subclass. To avoid this, you can use the instanceof operator to check if an object is an instance of a particular class before downcasting.


# Packages

In Java, a package is a way to organize related classes, interfaces, and sub-packages into a single namespace. This makes it easier to manage and reuse code, as well as avoid naming conflicts with classes from other packages.

The `java.util` package is a built-in package in Java that provides a collection of useful utility classes and interfaces. 

This package contains classes for data structures such as arrays, lists, sets, maps, and iterators, as well as classes for working with dates, times, and other common utility classes.

```java

import java.util.ArrayList;

public class MyArrayListExample {
    public static void main(String[] args) {
        // create a new ArrayList of strings
        ArrayList<String> list = new ArrayList<>();

        // add some elements to the list
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // print the list
        System.out.println(list);
    }
}
```

`import java.util.*` imports all the classes in the `java.util` package. This is called a wildcard import.

## Advantages of using packages

- Java package is used to categorize the classes and interfaces so that they can be easily maintained.

- Java package provides access protection.

- Java package removes naming collision.

## Buit-in packages

Packages that come with JDK or JRD you download are known as built-in packages. The built-in packages have come in the form of JAR files and when we unzip the JAR files we can easily see the packages in JAR files, for example, lang, io, util, SQL, etc. Java provides various built-in packages for example java.awt

- java.sql: Provides the classes for accessing and processing data stored in a database. Classes like Connection, DriverManager, PreparedStatement, ResultSet, Statement, etc. are part of this package.

- java.lang: Contains classes and interfaces that are fundamental to the design of the Java programming language. Classes like String, StringBuffer, System, Math, Integer, etc. are part of this package.

- java.util: Contains the collections framework, some internationalization support classes, properties, random number generation classes. Classes like ArrayList, LinkedList, HashMap, Calendar, Date, Time Zone, etc. are part of this package.

## Member access for packages in Java

By default, classes and interfaces in a package have package-level access, which means they can be accessed by other classes and interfaces within the same package, but not by classes and interfaces in other packages. 

However, you can also specify public or private access for classes and interfaces in a package. so that they can be accessed by classes and interfaces in other packages.   

- `public` - accessible from any other class or interface in any package. 
- `private` - accessible only from within the same class or interface.
- `protected` - accessible from within the same class or interface, or from a subclass of the same package, or from a subclass of a different package.

## Creating a package
Design a package containing details of a Person class, Student class and Teacher class. Use inheritance and interface.

```java
// Package: com.example.school

// Person interface
public interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}

// Student class implementing Person interface
public class Student implements Person {
    private String name;
    private int age;
    private String studentId;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}

// Teacher class implementing Person interface
public class Teacher implements Person {
    private String name;
    private int age;
    private String teacherId;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getTeacherId() {
        return teacherId;
    }
    
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(18);
        student.setStudentId("S123456");
        
        Teacher teacher = new Teacher();
        teacher.setName("Ms. Smith");
        teacher.setAge(35);
        teacher.setTeacherId("T987654");
        
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
        
        System.out.println("Teacher name: " + teacher.getName());
        System.out.println("Teacher age: " + teacher.getAge());
        System.out.println("Teacher ID: " + teacher.getTeacherId());
    }
}
```



# What is Errors in Java ?

Errors are the problems in a program due to which the program will stop the execution.
Example: StackOverflowError, OutOfMemoryError, etc.

# What is Exception in Java ?

In Java, an exception is an event that occurs during the execution of a program and disrupts its normal flow. When an exception occurs, Java creates an object of the corresponding exception class and throws it. The program then terminates abnormally, i.e. it crashes.

## Types of Exception in Java

There are mainly two types of exceptions: checked and unchecked. Here, an error is considered as the unchecked exception. According to Oracle, there are three types of exceptions:

### 1. Checked Exception

If a file is to be opened, but the file cannot be found, an exception
occurs. These exceptions are checked at compile-time and cannot simply be ignored at
the time of compilation. Classes which extend the Throwable class (excluding
RuntimeException and Error) are known as checked exceptions

Example: IOException, SQLException etc.

### 2. Unchecked Exception

This exception is checked during execution of the program and also ignored at the time of compilation. Unchecked Classes which extend the RuntimeException class are known as Unchecked Exceptions.

Example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.

### 3. Error

Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

Example: OutOfMemoryError, VirtualMachineError, AssertionError etc.

## Diff b/w Error and Exception in Java ?

Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc. while Exception is recoverable e.g. IOException, SQLException, ClassNotFoundException etc.

# What is Exception Handling in Java ?

Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

## Advantage of Exception Handling

The core advantage of exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions. Let's consider a scenario:

```java
statement 1;
statement 2;
statement 3;
statement 4;
statement 5; //exception occurs
statement 6;
statement 7;
statement 8;
statement 9;
statement 10;
```

Suppose there are 10 statements in a Java program and an exception occurs at statement 5; the rest of the code will not be executed, i.e., statements 6 to 10 will not be executed. However, when we perform exception handling, the **rest of the statements will be executed**. That is why we use exception handling in Java.

## Problem without exception handling

Let's try to understand the problem if we don't use a try-catch block.

```java
public class TryCatchExample1 {

    public static void main(String[] args) {

        int data=50/0; //may throw exception

        System.out.println("rest of the code");

    }

}
```

Output: `Exception in thread "main" java.lang.ArithmeticException: / by zero`

As displayed in the above example, the rest of the code is not executed (in such case, the rest of the code statement is not printed).

There might be 100 lines of code after the exception. If the exception is not handled, all the code below the exception won't be executed.

## Solution by exception handling

Let's see the solution of the above problem by a java try-catch block.

```java
public class TryCatchExample2 {

    public static void main(String[] args) {
        try
        {
        int data=50/0; //may throw exception
        }
            //handling the exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
```

Output:

```bash
java.lang.ArithmeticException: / by zero
rest of the code
```

As displayed in the above example, the rest of the code is executed, i.e., the rest of the code statement is printed.

## Java Exception Keywords

- **try** : The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.

- **catch** : The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

- **finally** : The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.

- **throw** : The "throw" keyword is used to throw an exception.

- **throws** : The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.

## Example of `throw` and `throws` keywords

```java
public class Testthrows1{
  void m()throws IOException{
    throw new IOException("device error");//checked exception
  }
  void n()throws IOException{
    m();
  }
  void p(){
   try{
    n();
   }catch(Exception e){System.out.println("exception handled");}
  }
  public static void main(String args[]){
   Testthrows1 obj=new Testthrows1();
   obj.p();
   System.out.println("normal flow...");
  }
}
```

Output:

```bash
exception handled
normal flow...
```

In the above example, we have declared the exception using throws keyword, if you use throw keyword, it will throw a compilation error.

## Java Exception Handling Example

```java
public class JavaExceptionExample{
  public static void main(String args[]){
   try{
      //code that may raise exception
      int data=100/0;
   }catch(ArithmeticException e){System.out.println(e);}
   //rest code of the program
   System.out.println("rest of the code...");
  }
}
```

Output:

```bash
Exception in thread main java.lang.ArithmeticException:/ by zero
rest of the code...
```

In the above example, 100/0 raises an ArithmeticException which is handled by a try-catch block.

## Common Scenarios of Java Exceptions

There are given some scenarios where unchecked exceptions may occur. They are as follows:

### ArithmeticException occurs

If we divide any number by zero, there occurs an ArithmeticException.

```java
int a=50/0;//ArithmeticException
```

### NullPointerException occurs

If we have null value in any variable, performing any operation by the variable occurs an NullPointerException.

```java
String s=null;
System.out.println(s.length());//NullPointerException
```

### NumberFormatException occurs

The wrong formatting of any value, may occur NumberFormatException. Suppose I have a string variable that have characters, converting this variable into digit will occur NumberFormatException.

```java
String s="abc";
int i=Integer.parseInt(s);//NumberFormatException
```

### ArrayIndexOutOfBoundsException occurs

If you are inserting any value in the wrong index, it would result ArrayIndexOutOfBoundsException as shown below:

```java
int a[]=new int[5];
a[10]=50; //ArrayIndexOutOfBoundsException
```

# Java try-catch block

## Java try block

Java try block is used to enclose the code that might throw an exception. It must be used within the method.

If an exception occurs at the particular statement in the try block, the rest of the block code will not execute. So, it is recommended not to keep the code in try block that will not throw an exception.

Java try block must be followed by either catch or finally block.

```java

try{
//code that may throw exception
}catch(Exception_class_Name ref){
//code to handle exception
}
```

## Java catch block

Java catch block is used to handle the Exception by declaring the type of exception within the parameter. The declared exception must be the parent class exception ( i.e., Exception) or the generated exception type. However, the good approach is to declare the generated type of exception.

The catch block must be used after the try block only. You can use multiple catch block with a single try block.

## Internal working of Java try-catch block

The JVM firstly checks whether the exception is handled or not. If exception is not handled, JVM provides a default exception handler that performs the following tasks:

- Prints out exception description.
- Prints the stack trace (Hierarchy of methods where the exception occurred).
- Causes the program to terminate.

But if the application programmer handles the exception, the normal flow of the application is maintained, i.e., rest of the code is executed.

# Threading in Java

## Introduction to process

In simple words, a process in Java is a program or application that is running on a computer. When a Java program is executed, it creates a process that is managed by the operating system. This process has its own memory space, resources, and thread of execution.

Overall, processes in Java are a fundamental concept that allows you to create and manage applications that run independently and interact with other applications or processes.

## Threads in Java

In Java, a thread is a way of running multiple parts of a program at the same time. Each thread represents a separate flow of control within the program.

Threads are important because they allow programs to take advantage of multiple CPUs or cores, which can make the program run faster and more efficiently. To create a thread, you create a new instance of the Thread class, and then either extend the class or implement the Runnable interface.

Once the thread is created, you can start it running using the ` start()` method. Java provides several mechanisms for coordinating the execution of threads, such as synchronization and joining.

Overall, threads are a key concept in Java programming that allows for efficient execution of concurrent tasks.

## Difference between process and thread

| Process                                                                                          | Thread                                                                                                                                            |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| A process is an instance of a program that runs independently with its own memory and resources. | A thread is a lightweight unit of execution within a process that shares the same memory space and resources as other threads within the process. |
| Processes are best for tasks that need complete isolation.                                       | Threads are better for tasks that need to share data or resources within a single process.                                                        |
| Processes incur more overhead than threads.                                                      | Communication between processes is slower than communication between threads.                                                                     |

> **Note**
> Threads are part of a process, meaning that a process can have multiple threads running concurrently within it.

## Scheduling in Java

Scheduling refers to the process of assigning resources (such as CPUs, memory, or I/O devices) to tasks or processes in a computer system. The main goal of scheduling is to optimize the utilization of resources and to ensure that tasks are completed as efficiently as possible.

The scheduler is responsible for determining which tasks should be executed next, and for allocating resources to those tasks. The scheduler may use a variety of algorithms to make these decisions, such as round-robin scheduling, priority scheduling, or shortest job first scheduling.

Overall, scheduling is an important concept in computer systems that plays a critical role in ensuring efficient resource utilization and optimal system performance.

## Context Switching in Java

Context switching is the process by which a computer system switches from executing one process or thread to another. In Java, context switching occurs when the JVM (Java Virtual Machine) switches from executing one thread to another thread.

When a thread is executing, it has its own set of registers, program counter, and stack. The JVM stores this information in a data structure known as a thread context, which is used to manage the execution of the thread. When the JVM switches from executing one thread to another, it must save the current thread's context and restore the context of the thread that is about to be executed.

Context switching in Java can occur for a variety of reasons, such as when a thread blocks on I/O or waits for a lock to be released. The JVM uses a scheduling algorithm to determine which thread should be executed next, based on factors such as thread priority and time-slicing.

Context switching can have a significant impact on the performance of a Java application. Switching between threads incurs overhead, as the JVM must save and restore thread contexts. Additionally, if there are many threads running concurrently, context switching can lead to contention for system resources, which can cause delays and reduce overall throughput.

Overall, context switching is an important concept in Java threading that plays a critical role in managing the execution of concurrent threads in a Java application.

## Multihreading in Java

When we run a real-world application, we use good processors for faster execution. But, only processor speed can’t make your application run fast. One of the great ways to create a performance efficient application is use utilize multithreading.

### What is Multithreading?

When a program (At execution time program is called process) is sub divided into two or more subprograms, which can be parallelly executed at the same time, then each subprogram is called thread and each thread defines a separate path of execution

### Advantages of Multithreading

- It doesn’t block the user because threads are independent and you can perform multiple operations at same time.
- You can perform many operations together, so it saves time.

### Main thread

When a Java program execution starts, one thread begins running up to end of execution.
This thread is called main thread. Child threads are generated from main thread.

### Multithreading vs Multiprocessing

When we talk about multithreading, we don’t care if the machine has a 2-core processor or a 16-core processor. Our work is to create a multithreaded application and let the OS handle the allocation and execution part. In short, multithreading has nothing to do with multiprocessing.

### How does Java Support Multithreading?

Java has great support for multithreaded applications. Java supports multithreading through Thread class. Java Thread allows us to create a lightweight process that executes some tasks. We can create multiple threads in our program and start them. Java runtime will take care of creating machine-level instructions and work with OS to execute them in parallel.

### What are the different types of threads?

There are two types of threads in an application - user thread and daemon thread. When we start an application, **the main is the first user thread created.** We can create multiple user threads as well as daemon threads. When all the user threads are executed, JVM terminates the program.

### What is Thread Priority?

Every Java thread has a priority that helps the operating system determine the order in which threads are scheduled.

Java thread priorities are in the range between MIN_PRIORITY (a constant of 1) and MAX_PRIORITY (a constant of 10). By default, every thread is given priority NORM_PRIORITY (a constant of 5).

Threads with higher priority are more important to a program and should be allocated processor time before lower-priority threads. However, thread priorities cannot guarantee the order in which threads execute and are very much platform dependent

```java

class MyThread extends Thread
{
  public void run()
  {
    System.out.println("Priority is : " + Thread.currentThread().getPriority());
  }

  public static void main(String[] args)
  {
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    MyThread t3 = new MyThread();

    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    t3.setPriority(Thread.NORM_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
  }
}

```

Output:

```bash
Priority is : 1
Priority is : 10
Priority is : 5
```


### Life Cycle of a Thread

A thread goes through various stages in its life cycle. For example, a thread is born, started, runs, and then dies. The following diagram shows the complete life cycle of a thread

- **New** − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.

- **Ready** - The thread is in ready state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
- **Running** − The thread is in running state if the thread scheduler has selected it. It keeps running until it becomes blocked, or its run() method exits.
- **Waiting/Asleep/Blocked** − This state is for the threads waiting for others to perform a certain action. For example, if one thread has called join() method on the another thread, then the first thread is in waiting state until the second thread completes its task.
- **Dead** − A thread is considered dead when its run() method completes its execution or the stop() method is called on the thread.

# Thread Creation

There are two ways to create a thread in Java:

- By extending Thread class
- By implementing Runnable interface.

## 1. Thread class

Java provides Thread class to create and use threads. Here is how we can create threads in Java by extending Thread class:

```java
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```

## 2. Runnable interface

Java provides Runnable interface that should be implemented by any class whose instances are intended to be executed by a thread.

```java
class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
       MyThread obj = new MyThread();
       Thread t1 = new Thread(obj);
       t1.start();
    }
}
```

# Important methods in Java thread

## `start()`

Starts the thread in a separate path of execution, then invokes the run() method on this Thread object.

## `run()`

If this Thread object was instantiated using a separate Runnable target, the run() method is invoked on that Runnable object.

### Diff between `start()` and `run()` ? 

`thread.start()` is used to start a new thread of execution. It creates a new thread and runs the code in that thread concurrently with the main thread. The actual execution of the thread's code happens independently and concurrently.

`thread.run()` simply calls the code in the thread's run() method in the current thread. It does not create a new thread but executes the code sequentially in the same thread that made the call. The code runs in a regular method invocation manner, without any concurrent execution.

## `yield()`

Causes the currently executing thread object to temporarily pause and allow other threads to execute.

Example :

```java
class TestThreadYield extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            if(i==3)
                Thread.yield();
        }
    }
    public static void main(String args[]){
        TestThreadYield t1=new TestThreadYield();
        TestThreadYield t2=new TestThreadYield();
        t1.start();
        t2.start();
    }
}
```

Output:

```bash
Thread-0 : 1
Thread-0 : 2
Thread-0 : 3
Thread-1 : 1
Thread-1 : 2
Thread-1 : 3
Thread-1 : 4
Thread-1 : 5
Thread-0 : 4
Thread-0 : 5
```

In the above example, when i==3, the thread t1 yields the processor, and the thread t2 gets the chance for execution. After completion of the current iteration of the thread t2, the thread t1 again gets the chance for execution.

## `sleep(long milliseconds)`

Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers.

Example:

```java
public class HelloTamal extends Thread {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                if (i == 5) {
                    try {
                        Thread.sleep(5000);
                        System.out.println(Thread.currentThread().getName() + " is sleeping ");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
```

## `join()`

Waits for a thread to die.

Example:

```java

class MyThread extends Thread
{
  public void run()
  {
    for(int i = 0; i<5; i++)
    {
      try
      {
        Thread.sleep(500);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
      System.out.println(i);
    }
  }

  public static void main(String[] args)
  {
    MyThread t1 = new MyThread();

    t1.start();
    try
    {
      for(int i = 0; i<5; i++)
    {
      Thread.sleep(500);
      System.out.println(i);
    }
      t1.join();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}

```

In the above example, the `t1.join` method causes the main thread to wait until the completion of thread t1. After completing t1, main thread are executed.


## `suspend()` and `resume()`

suspend() method is used to suspend the thread execution and resume() method is used to resume the thread execution.

## `wait()`, `notify()` and `notifyAll()`

The wait() method tells the calling thread to give up the monitor and go to sleep until some other thread enters the same monitor and calls notify( ).

The notify() method wakes up the first thread that called wait() on the same object.

The notifyAll() method wakes up all the threads that called wait() on the same object. The highest priority thread will run first.


Example:

```java
class TestWaitNotify{
    public static void main(String args[]){
        final Customer c=new Customer();
        new Thread(){
            public void run(){c.withdraw(15000);}
        }.start();
        new Thread(){
            public void run(){c.deposit(10000);}
        }.start();
    }
}

class Customer{
    int amount=10000;

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");
        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposit...");
            try{wait();}catch(Exception e){}
        }
        this.amount-=amount;
        System.out.println("withdraw completed...the remaining balance is "+this.amount);
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("deposit completed... "+this.amount);
        notify();
    }
}
``` 


# Synchronization in Java Multithreading

When two or more threads want to access to a shared resource, they need some way to ensure that the resource will be used by only one thread at a time. The process by which this synchronization is achieved is called thread synchronization.

```java

public class ThreadSynchronizationExample {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        ThreadSynchronizationExample example = new ThreadSynchronizationExample();

        // Create multiple threads
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + example.count);
    }
}
```

Output:

```bash
Count: 2000
```

In this example, we have a `ThreadSynchronizationExample` class with a count variable that we want to increment using two separate threads. By marking the `increment()` method with the `synchronized` keyword, we ensure that only one thread can execute that method at a time, preventing any race conditions.

We create two threads, thread1 and thread2, where each thread calls the increment() method 1000 times. The synchronized keyword ensures that the count variable is properly synchronized between the threads.

After starting the threads and waiting for them to finish using join(), we print the final value of count, which should be 2000 if the synchronization is working correctly.

**What would have happened if i didnot use `synchronized` ?**

```bash
Count: 1998
```

Without synchronization, race conditions can occur when multiple threads try to update the count variable simultaneously. In this case, each thread is performing 1000 increments, but the increments are not atomic operations.


# Thread Deadlock

A deadlock is a situation where two or more threads are blocked forever, waiting for each other. Deadlock occurs when multiple threads need the same locks but obtain them in different order.

```java
public class ThreadDeadlockExample {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 acquired lock1");
                
                Thread.sleep(1000);
                synchronized (lock2) {
                    System.out.println("Thread 1 acquired lock2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 acquired lock2");
                
                Thread.sleep(1000);
                synchronized (lock1) {
                    System.out.println("Thread 2 acquired lock1");
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
```

In this example, we have two threads, thread1 and thread2, and two locks, lock1 and lock2. Each thread attempts to acquire the locks in a different order, leading to a potential deadlock situation.

thread1 acquires lock1 and then attempts to acquire lock2, while thread2 acquires lock2 and then attempts to acquire lock1. If both threads start concurrently, there is a chance that thread1 acquires lock1 and thread2 acquires lock2 simultaneously. Then, both threads will be waiting for the other lock to be released, resulting in a deadlock where neither thread can proceed.