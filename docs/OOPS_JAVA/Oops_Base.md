<!-- TOC -->

- [PolyMorphism in Java](#polymorphism-in-java)
  - [Compile Time Polymorphism](#compile-time-polymorphism)
  - [Run Time Polymorphism](#run-time-polymorphism)
  - [Why method overriding is called runtime polymorphism in Java ?](#why-method-overriding-is-called-runtime-polymorphism-in-java-)
- [Inheritance in Java](#inheritance-in-java)
- [Interfaces in Java](#interfaces-in-java)
  - [Multiple Inheritance using interfaces](#multiple-inheritance-using-interfaces)
  - [What are the differences between abstract class and interface?](#what-are-the-differences-between-abstract-class-and-interface)
- [Encapsulation](#encapsulation)
  - [What are the advantages of Encapsulation in Java?](#what-are-the-advantages-of-encapsulation-in-java)
- [Abstraction](#abstraction)
  - [What is Abstract class in Java?](#what-is-abstract-class-in-java)
  - [What is the difference between abstraction and encapsulation?](#what-is-the-difference-between-abstraction-and-encapsulation)
  - [Can there be an abstract method without an abstract class?](#can-there-be-an-abstract-method-without-an-abstract-class)
  - [Is the following program written correctly? If yes then what will be the output of the program?](#is-the-following-program-written-correctly-if-yes-then-what-will-be-the-output-of-the-program)
  - [Can you use abstract and final both with a method?](#can-you-use-abstract-and-final-both-with-a-method)

<!-- /TOC -->

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
interface hello{
    void sayHello();
}

class Tamal implements hello{
    public void sayHello(){
        System.out.println("Hello");
    }
}

class Main{
    public static void main(String[] args){
        Tamal tamaldas = new Tamal();
        tamaldas.sayHello();
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

## What are the differences between abstract class and interface?

| Abstract Class                                                                | Interface                                                                                               |
| ----------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| An abstract class can have abstract and non-abstract methods.                 | An interface can have only abstract methods. Since Java 8, it can have default and static methods also. |
| An abstract class doesn't support multiple inheritance.                       | An interface supports multiple inheritance.                                                             |
| An abstract class can have final, non-final, static and non-static variables. | An interface has only static and final variables.                                                       |
| An abstract class can provide the implementation of interface.                | An interface can't provide the implementation of abstract class.                                        |
| An abstract class can be extended using keyword "extends".                    | An interface can be implemented using keyword "implements".                                             |
| A Java abstract class can have class members like private, protected, etc.    | Members of a Java interface are public by default.                                                      |

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

## What are the advantages of Encapsulation in Java?

There are the following advantages of Encapsulation in Java?

- By providing only the setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.
- It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.
- It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
- The encapsulate class is easy to test. So, it is better for unit testing.
- The standard IDE's are providing the facility to generate the getters and setters. So, it is easy and fast to create an encapsulated class in Java.

# Abstraction

Abstraction is a process of hiding the implementation details and showing only functionality to the user. It displays just the essential things to the user and hides the internal information, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery. Abstraction enables you to focus on what the object does instead of how it does it. Abstraction lets you focus on what the object does instead of how it does it.

In Java, there are two ways to achieve the abstraction.

- Abstract Class
- Interface

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
- There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final or in simpler terms final method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”
- We can define static methods in an abstract class
- We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
- If a class contains at least one abstract method then compulsory should declare a class as abstract
- If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method

Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.

Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of a car or applying brakes will stop the car, but he does not know how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of the accelerator, brakes, etc in the car. This is what abstraction is.

## What is the difference between abstraction and encapsulation?

Abstraction hides the implementation details whereas encapsulation wraps code and data into a single unit.

## Can there be an abstract method without an abstract class?

No, if a method is declared as abstract, the class containing it must be abstract.

## Is the following program written correctly? If yes then what will be the output of the program?

```java

abstract class Calculate
{
    abstract int multiply(int a, int b);
}

public class Main
{
    public static void main(String[] args)
    {
        int result = new Calculate()
        {
            @Override
            int multiply(int a, int b)
            {
                return a*b;
            }
        }.multiply(12,32);
        System.out.println("result = "+result);
    }
}

```

Yes, the program is written correctly. The Main class provides the definition of abstract method multiply declared in abstract class Calculation. The output of the program will be: **384**

## Can you use abstract and final both with a method?

No, because the abstract method needs to be overridden whereas you can not override a final method.
