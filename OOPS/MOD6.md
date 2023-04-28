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
BufferedReader in = new BufferedReader(new FileReader("foo.in"));
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

- `BufferedReader` can only read Strings while `Scanner` can read both Strings and primitive types like int, float, etc.

- `BufferedReader` is faster than `Scanner`, because `Scanner` does parsing of input data and BufferedReader simply reads sequence of characters.

## Methods of Scanner class

- `public String nextLine()`: For getting String input from the user.

- `public int nextInt()`: For getting integer input from the user.

- `public float nextFloat()`: For getting float input from the user.

- `public double nextDouble()`: For getting double input from the user.

- `public long nextLong()`: For getting long input from the user.

- `public boolean nextBoolean()`: For getting boolean input from the user.

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

## Process of constructor calling in inheritance

Whenever an object is created, its constructor is invoked. The constructor is called in the same order in which the inheritance is defined. This is known as constructor chaining.

## Example

```java

class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        C c = new C();
    }
}

// Output

// Class A Constructor
// Class B Constructor
// Class C Constructor

```

In the above example, the constructor of class C is called first, then the constructor of class B is called, and finally, the constructor of class A is called.

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



