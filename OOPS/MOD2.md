<!-- TOC -->

- [Relationship in Classes Java](#relationship-in-classes-java)
  - [Advantages of relationship in classes](#advantages-of-relationship-in-classes)
  - [Inheritance (IS-A relationship)](#inheritance-is-a-relationship)
  - [Association (HAS-A relationship)](#association-has-a-relationship)
  - [Dependencies (Use, call)](#dependencies-use-call)
- [Relationship between objects in Java](#relationship-between-objects-in-java)

<!-- /TOC -->

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