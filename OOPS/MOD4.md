<!-- TOC -->

- [Advantages of Java](#advantages-of-java)
- [JDK, JRE, JVM](#jdk-jre-jvm)
- [Java bytecode](#java-bytecode)
  - [Java bytecode advantages](#java-bytecode-advantages)
- [Data types in Java](#data-types-in-java)
- [Garbage collection](#garbage-collection)
  - [Methods in Java Garbage Collection](#methods-in-java-garbage-collection)
    - [Finalize() method](#finalize-method)
    - [System.gc() method](#systemgc-method)
- [The `this` keyword in Java](#the-this-keyword-in-java)
- [Use of objects as a Parameter in Java](#use-of-objects-as-a-parameter-in-java)

<!-- /TOC -->

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

# The `this` keyword in Java

The `this` keyword is used to refer to the current object in Java. It can be used to access instance variables and methods of the current object. For example, if you have a class called `Person` with an instance variable called `name`, you can use the `this` keyword to access the `name` variable of the current object.

Example:

```java
public class Person {
    private String name; // let this be "Tamal"

    public Person(String name) {
        this.name = name; // this.name is "Tamal"
    }

    public String getName() {
        return this.name; 
        // by this.name we mean the name which we defined 
        // in the first line of this class "private String name;"
    }
    
    
}
```

In this example, the `this` keyword is used to access the `name` variable of the current object. This allows you to write code that is more concise and readable.

The `this` keyword can also be used to call methods of the current object. For example, if you have a method called `printName()` in the `Person` class, you can use the `this` keyword to call the `printName()` method of the current object.

Example:

```java
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void printName() {
        System.out.println(this.name);
    }
}
```

In this example, the `this` keyword is used to call the `printName()` method of the current object. This allows you to write code that is more concise and readable.

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

