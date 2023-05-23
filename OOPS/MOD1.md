<!-- what is a class in java ?  -->



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
- [The `final` keyword](#the-final-keyword)
- [The `import` statement](#the-import-statement)
- [The `static` keyword](#the-static-keyword)
- [Methods in Java](#methods-in-java)
  - [Method Overloading](#method-overloading)
  - [Method Overriding](#method-overriding)
- [PolyMorphism in Java](#polymorphism-in-java)
  - [Compile Time Polymorphism](#compile-time-polymorphism)
  - [Run Time Polymorphism](#run-time-polymorphism)
  - [Why method overriding is called runtime polymorphism in Java ?](#why-method-overriding-is-called-runtime-polymorphism-in-java-)
- [Inheritance in Java](#inheritance-in-java)
- [Interfaces in Java](#interfaces-in-java)
  - [Multiple Inheritance using interfaces](#multiple-inheritance-using-interfaces)
- [Access Modifiers](#access-modifiers)
    - [Public Modifier](#public-modifier)
    - [Protected Modifier](#protected-modifier)
    - [Default Modifier](#default-modifier)
  - [MidSem1 : how to control the level of reusability of inheritance in Java](#midsem1--how-to-control-the-level-of-reusability-of-inheritance-in-java)
- [Encapsulation](#encapsulation)
- [Abstraction](#abstraction)
  - [What is Abstract class in Java?](#what-is-abstract-class-in-java)

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



# The `final` keyword

In Java, the `final` keyword is used to declare a variable, method, or class as immutable, which means it cannot be changed or modified after it has been initialized.

For example, if a variable is declared as `final`, its value cannot be altered once it has been assigned a value. Similarly, if a method is declared as `final` it cannot be overridden by any subclass. And if a class is declared as `final` it cannot be subclassed.

```java
public class FinalExample {
    public static void main(String[] args) {
        final int a = 10;
        a = 20; // Error: cannot assign a value to a final variable
    }
}
```

# The `import` statement

In Java, the import statement is used to make classes and interfaces from other packages available in your code. 

The import statement tells the Java compiler which classes or interfaces you want to use in your code and where to find them.

```java
import java.util.ArrayList;
import java.util.List;
```

# The `static` keyword

In Java, the `static` keyword is used to create variables, methods, and inner classes that belong to the class itself rather than to instances of the class. 

- This means that static members are shared by all instances of the class, and you don't need to create an object of the class to access them.

- On the other hand, `non-static` members are specific to each instance of the class. When you create an object of the class, each instance has its own copy of the non-static members.

```java
public class MyClass {
    static int staticVariable = 0;
    int nonStaticVariable = 0;

    static void staticMethod() {
        System.out.println("Static method");
    }

    void nonStaticMethod() {
        System.out.println("Non-static method");
    }
}
```

In this example, `staticVariable` and `staticMethod()` are declared as static, while nonStaticVariable and `nonStaticMethod()` are not. This means that you can access `staticVariable` and `staticMethod()` using the class name MyClass, while you need to create an instance of MyClass to access `nonStaticVariable` and `nonStaticMethod()`:

```java
// Access static members
// we don't need to create an object of MyClass to access static members

MyClass.staticVariable = 1;
MyClass.staticMethod();

// Access non-static members
// we created myObject which is an instance of MyClass

MyClass myObject = new MyClass();
myObject.nonStaticVariable = 2;
myObject.nonStaticMethod();

```

# Methods in Java

In Java, a method is a collection of statements that are grouped together to perform an operation. When you call a method, you pass a value to it called an argument. The method performs its task and returns a value.

## Method Overloading

In Java, method overloading is a feature that allows a class to have multiple methods with the same name but different parameters. This means that you can create multiple methods with the same name but different parameter lists.

```java
public class MyClass {
    public void print(String s) {
        System.out.println(s);
    }

    public void print(int i) {
        System.out.println(i);
    }

    public void print(double d) {
        System.out.println(d);
    }
}
```

In this example, the `MyClass` class has three methods with the same name `print()` but different parameter lists. This means that you can call the `print()` method with a String, int, or double argument, and the compiler will know which method to call based on the type of the argument.

```java
public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.print("Hello"); // Prints "Hello"
        myObject.print(10); // Prints "10"
        myObject.print(3.14); // Prints "3.14"
    }
}
```

In this example, we create an object of the `MyClass` class and call the `print()` method with different arguments. The compiler knows which method to call based on the type of the argument.

## Method Overriding

In Java, method overriding is a feature that allows a subclass to provide a different implementation of a method that is already defined in its superclass. This means that you can create a method in a subclass that has the same name, return type, and parameters as a method in its superclass, but a different implementation.

```java
public class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Prints "Woof!"

        animal = new Cat();
        animal.makeSound(); // Prints "Meow!"
    }
}
```

In this example, the `Animal` class has a method called `makeSound()`. The `Dog` and `Cat` classes override this method to provide a different implementation. When the `makeSound()` method is called, the actual method that is executed is determined at runtime, based on the type of the object that is being used.



# PolyMorphism in Java

In Java, polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in Java is when a parent class reference is used to refer to a child class object.

- Poly means many
- Morph means forms

```java
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    
     public void printInfo(int age){
        System.out.println(age);
    }
}
```

This is called polymorphism because the `printInfo()` method can be used to print the name and age of the student but in different forms.

Now if from somewhere we'd call `s1.printInfo("John")` and `s1.printInfo(20)` then it would print the name and age of the student. So the same method is used to print different things. Run and compile times are kinda like js and ts.


## Compile Time Polymorphism

Basically overloading
Compile-time or static polymorphism refers to the ability of a programming language to choose the appropriate function or operation to execute based on the types of the objects involved. 

It is determined and resolved by the compiler before the program is run. In simpler terms, it's like having a "menu" of functions, and the compiler decides which function to call based on the types of the objects involved at compile time.

- Method overloading is when we have multiple methods with the same name but different parameters.

- Operator overloading is when we use the same operator for different purposes.

Here's an example of Static Polymorphism using method overloading:

```java
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    
     public void printInfo(int age){
        System.out.println(age);
    }
}
```

In this example, we have two methods with the same name `printInfo()` but different parameters. So, we can use the same method to print the name and age of the student. This is called method overloading.

🙊 We can't just have the same ` public void printInfo(String name){` method twice. We need to have different parameters or different number of parameters or different data types of parameters or return types to overload a method.


## Run Time Polymorphism

Dynamic polymorphism is a feature of object-oriented programming languages that allows the same method to be used for different types of objects, even if those objects have different implementations of the method. 

This is done by using virtual methods, which are methods that are declared in a base class but can be overridden by a subclass. When a virtual method is called, the actual method that is executed is determined at runtime, based on the type of the object that is being used.

```java
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Prints "Woof!"

        animal = new Cat();
        animal.makeSound(); // Prints "Meow!"
    }
}
```

In this example, the `makeSound()` method is declared in the Animal class. This method is then overridden in the Dog and Cat classes. When the `makeSound()` method is called, the actual method that is executed is determined at runtime, based on the type of the object that is being used. In this case, the first time the `makeSound()` method is called, the Dog class's implementation of the method is executed. The second time the `makeSound()` method is called, the Cat class's implementation of the method is executed.

Dynamic polymorphism is a powerful feature that can make object-oriented programs more flexible and reusable. It allows programmers to write code that can be used with different types of objects, even if those objects have different implementations of the same methods.

## Why method overriding is called runtime polymorphism in Java ?

Method overriding in Java is referred to as runtime polymorphism because the actual method that gets executed is determined at runtime based on the type of the object being referred to, rather than the type of the reference variable. This allows for dynamic method dispatch, where the appropriate overridden method is invoked based on the specific type of the object at runtime.
# Inheritance in Java

In Java, inheritance is a mechanism in which one class acquires the properties (methods and fields) of another. With the use of inheritance, the information is made manageable in a hierarchical order.

- Inheritance is a way to reuse code. We can reuse the code of an existing class when we create a new class. This is called inheritance.

- The class whose properties are inherited is called the superclass (base class, parent class).
  
- The class that inherits the properties of another class is called the subclass (derived class, child class).


```java
class Animal{
    String name;
    int age;

    public void eat(){
        System.out.println("Eating");
    }
    
    public void sleep(){
        System.out.println("Sleeping");
    }
}
```

In this example, we have a class `Animal` which has two properties `name` and `age` and two methods `eat()` and `sleep()`. Now, we can create a new class `Dog` which inherits the properties of the `Animal` class.

```java
class Dog extends Animal{
    String breed;

    public void bark(){
        System.out.println("Barking");
    }
}
```

In this example, we have a class `Dog` which inherits the properties of the `Animal` class. It has one additional property `breed` and one additional method `bark()`. So, we can create a new object of the `Dog` class and access all the properties and methods of the `Animal` class as well as the `Dog` class.

```java
class Main{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.name = "John";
        d1.age = 5;
        d1.breed = "German Shepherd";
        d1.eat();
        d1.sleep();
        d1.bark();
    }
}
```

In this example, we have created a new object of the `Dog` class and accessed all the properties and methods of the `Animal` class as well as the `Dog` class.

🙊 In Java, we can only inherit from one class. We can't inherit from multiple classes. But we can implement multiple interfaces.


# Interfaces in Java

An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.

```java

class Laptop
{
    public void start()
    {
        System.out.println("Laptop started");
    }
}

class Developer
{
    public void code(Laptop lap)
    {
        lap.start();
        System.out.println("Developer is coding");
    }
}

```

## Multiple Inheritance using interfaces

To achieve multiple inheritance using interfaces, you can create two or more interfaces with different sets of abstract methods, and then create a class that implements all the interfaces. By doing so, the class will inherit the abstract methods from all the interfaces it implements.

```java

interface AnimalEat {
   void eat();
}
interface AnimalTravel {
   void travel();
}
class Animal implements AnimalEat, AnimalTravel {
   public void eat() {
      System.out.println("Animal is eating");
   }
   public void travel() {
      System.out.println("Animal is travelling");
   }
}
public class Demo {
   public static void main(String args[]) {
      Animal a = new Animal();
      a.eat();
      a.travel();
   }
}
```

- The interface AnimalEat and AnimalTravel have one abstract method each i.e. eat() and travel(). The class Animal implements the interfaces AnimalEat and AnimalTravel.

- In the method main() in class Demo, an object a of class Animal is created. Then the methods eat() and travel() are called.

- The class Animal implements both the interfaces AnimalEat and AnimalTravel. So the class Animal inherits the methods eat() and travel() from both the interfaces and that is how multiple inheritance is achieved in Java.

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

# Encapsulation 

In Java, encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

To achieve encapsulation in Java:

- Declare the variables of a class as private.
- Provide public setter and getter methods to modify and view the variables values.

```java
class Student{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
```

In this example, we have a class `Student` which has two properties `name` and `age`. We have declared these properties as private and provided public setter and getter methods to modify and view the variables values.

```java
class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(20);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
```

In this example, we have created a new object of the `Student` class and accessed the properties using the setter and getter methods.

# Abstraction

Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or the non-essential units are not displayed to the user. 

- Ex: A car is viewed as a car rather than its individual components.


## What is Abstract class in Java?

Java abstract class is a class that can not be initiated by itself, it needs to be subclassed by another class to use its properties. An abstract class is declared using the “abstract” keyword in its class definition.

```java

abstract class Shape 
{
    int color;
    // An abstract function
    abstract void draw();
}
```

In Java, the following some important observations about abstract classes are as follows:

- An instance of an abstract class can not be created.
- Constructors are allowed.
- We can have an abstract class without any abstract method.
- There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simpler terms final method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”
- We can define static methods in an abstract class
- We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
- If a class contains at least one abstract method then compulsory should declare a class as abstract 
- If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method

Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.

Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of a car or applying brakes will stop the car, but he does not know how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of the accelerator, brakes, etc in the car. This is what abstraction is. 


