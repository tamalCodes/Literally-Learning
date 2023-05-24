<!-- TOC -->

- [File handling in Java](#file-handling-in-java)
  - [What is a stream ?](#what-is-a-stream-)
- [Types of streams](#types-of-streams)
  - [Binary Stream](#binary-stream)
    - [InputStream class subclasses](#inputstream-class-subclasses)
  - [Character Stream](#character-stream)
- [Introduction to BufferedReader class](#introduction-to-bufferedreader-class)
  - [Example](#example)
- [Introduction to Scanner class](#introduction-to-scanner-class)
  - [Example](#example-1)
  - [Difference between BufferedReader and Scanner class](#difference-between-bufferedreader-and-scanner-class)
  - [Methods of Scanner class](#methods-of-scanner-class)
  - [Methods of BufferedReader class](#methods-of-bufferedreader-class)
- [Subclasses, Superclasses, and Inheritance](#subclasses-superclasses-and-inheritance)
  - [Superclasses and Subclasses](#superclasses-and-subclasses)
  - [Example](#example-2)
  - [Multi level hierarchy](#multi-level-hierarchy)
  - [Constructor Chaining](#constructor-chaining)
- [Use of super and final keywords](#use-of-super-and-final-keywords)
  - [Use of super keyword](#use-of-super-keyword)
  - [Example](#example-3)
  - [Use of final keyword](#use-of-final-keyword)
    - [Final variable](#final-variable)
    - [Example](#example-4)
    - [Final method](#final-method)
    - [Example](#example-5)
    - [Final class](#final-class)
      - [Example](#example-6)
      - [What happens if we try to inherit from a final Class?](#what-happens-if-we-try-to-inherit-from-a-final-class)
      - [Advantage of the Final Class](#advantage-of-the-final-class)
- [Comparison between super and this keyword](#comparison-between-super-and-this-keyword)
  - [Example of super keyword](#example-of-super-keyword)
  - [Example of this keyword](#example-of-this-keyword)
  - [Implementation of `this` keyword](#implementation-of-this-keyword)
    - [To invoke current class method](#to-invoke-current-class-method)
    - [To invoke current class constructor:](#to-invoke-current-class-constructor)
    - [Pass as an argument in the method](#pass-as-an-argument-in-the-method)
    - [Pass as argument in the constructor call](#pass-as-argument-in-the-constructor-call)
- [Dynamic method dispatch](#dynamic-method-dispatch)
    - [Example](#example-7)
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

<!-- /TOC -->

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

# Use of super and final keywords

## Use of super keyword

The super keyword in Java is a reference variable that is used to refer to the immediate parent class object. It is used to invoke the constructor of the parent class and also to refer to the parent class instance variables and methods.

## Example

```java

class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    public void display() {
        System.out.println(a);
        System.out.println(super.a);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

// Output

// 20
// 10

```

In the above example, the super keyword is used to refer to the instance variable of the parent class. In this case, `a` is the instance variable of the parent class.


## Use of final keyword

The final keyword in Java is used to restrict the user. The java final keyword can be used in many contexts. Final can be:

- variable
- method
- class

### Final variable

If you make any variable as final, you cannot change the value of final variable(It will be constant).

### Example

```java

class A {
    final int a = 10;

    public void display() {
        a = 20;
        System.out.println(a);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        A a = new A();
        a.display();
    }
}

// Output

// 20

```

### Final method

If you make any method as final, you cannot override it. The purpose of final method is that the content of the method can't be changed & it remains the same in the subclass.

### Example

```java

class A {
    public final void display() {
        System.out.println("Hello");
    }
}

class B extends A {
    public void display() {
        System.out.println("Hi");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

// Output

// Hi

```

In the above example, the display() method of class A is final. So, it cannot be overridden in the subclass B.

### Final class

The final class is a class that is declared with the final keyword. Subclasses can't inherit a final class or a final class cannot be inherited by any subclass. So, we can restrict class inheritance by making use of a final class.

#### Example

```java
final class myFinalClass 
{
    void myFinalMethod() 
    {
        System.out.println("We are in the final class we just created");
    }
}

class MainClass
{
    public static void main(String arg[])
    {
        myFinalClass fc = new myFinalClass();
        fc.myFinalMethod();
    }
}
```

In the above example, the myFinalClass is a final class. So, it cannot be inherited by any subclass.

#### What happens if we try to inherit from a final Class?

In the below code, we are using the extend keyword to inherit the final class to the subClass but the final class cannot be inherited by any other subclass so it will throw an error saying 

```bash
cannot inherit from final myFinalClass
```

```java

final class myFinalClass 
{
    void myMethod() 
    {
        System.out.println("We are in the final class we just created");
    }
}

class subClass extends myFinalClass
{
    void myMethod() 
    {
        System.out.println("We are in the subclass");
    }
}
class MainClass
{
    public static void main(String arg[])
    {
        myFinalClass fc = new subClass();
        fc.myMethod();
    }
}


```

The error we will get : 

```bash
prog.java:9: error: cannot inherit from final myFinalClass
class subClass extends myFinalClass
```

#### Advantage of the Final Class

- Final class provides security as it cannot be extended or inherited by any other class, classes that can be extended can leak sensitive data of potential users but final classes make data elements safe and secure.

- Final class is a complete and immutable class, so data elements do not change by external access.

# Comparison between super and this keyword


The `super` keyword in Java is a reference variable that is used to refer to the immediate parent class object. It is used to invoke the constructor of the parent class and also to refer to the parent class instance variables and methods.

The `this` keyword in Java is a reference variable that refers to the current object. It can be used to refer to any member of the current object from within an instance method or a constructor.

| super keyword | this keyword |
| --- | --- |
| The super keyword is used to refer to the immediate parent class object. | The this keyword is used to refer to the current object. |
| The super keyword can be used to invoke the immediate parent class method. | The this keyword can be used to invoke the current class method (implicitly). |

## Example of super keyword

```java

class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    public void display() {
        System.out.println(a);
        System.out.println(super.a);
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

// Output

// 20
// 10

```

In the above example, the super keyword is used to refer to the instance variable of the parent class. In this case, `a` is the instance variable of the parent class.

## Example of this keyword

```java

class A {
    int a = 10;

    public void display() {
        int a = 20;
        System.out.println(a);
        System.out.println(this.a);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        A a = new A();
        a.display();
    }
}

// Output

// 20
// 10

```

In the above example, the this keyword is used to refer to the instance variable of the current class. In this case, `a` is the instance variable of the current class.

## Implementation of `this` keyword 


### To invoke current class method

```java
public class MyClass {
    private int x;

    public void setValue(int x) {
        this.x = x;
    }

    public void printValue() {
        System.out.println("The value of x is: " + this.x);
    }
}
```

### To invoke current class constructor:

```java
public class MyClass {
    private int x;
    private int y;

    public MyClass() {
        this(0, 0); // calling the other constructor with default values
    }

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
```

### Pass as an argument in the method

```java
public class MyClass {
    private int x;

    public void setValue(int x) {
        this.x = x;
    }

    public void printValue(MyClass obj) {
        System.out.println("The value of x is: " + obj.x);
    }
}
```

### Pass as argument in the constructor call

```java
public class MyClass {
    private int x;
    private int y;

    public MyClass() {
        this(0); // calling the other constructor with default values
    }

    public MyClass(int x) {
        this(x, 0);
    }

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
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
