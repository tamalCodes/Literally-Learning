<!-- TOC -->

- [The `this` keyword in Java](#the-this-keyword-in-java)
  - [Can this keyword be used to refer static members??](#can-this-keyword-be-used-to-refer-static-members)
  - [How can constructor chaining be done using this keyword?](#how-can-constructor-chaining-be-done-using-this-keyword)
- [Use of `super` keyword](#use-of-super-keyword)
  - [How can constructor chaining be done by using the super keyword?](#how-can-constructor-chaining-be-done-by-using-the-super-keyword)
- [`super` VS `this`](#super-vs-this)
  - [Example of super keyword](#example-of-super-keyword)
  - [Example of this keyword](#example-of-this-keyword)
  - [Implementation of `this` keyword](#implementation-of-this-keyword)
    - [To invoke current class method](#to-invoke-current-class-method)
    - [To invoke current class constructor:](#to-invoke-current-class-constructor)
    - [Pass as an argument in the method](#pass-as-an-argument-in-the-method)
    - [Pass as argument in the constructor call](#pass-as-argument-in-the-constructor-call)
- [The `final` keyword](#the-final-keyword)
  - [Final variable](#final-variable)
  - [Final method](#final-method)
  - [Can you declare the main method as final?](#can-you-declare-the-main-method-as-final)
  - [Can we declare a constructor as final?](#can-we-declare-a-constructor-as-final)
  - [What is the difference between the final method and abstract method?](#what-is-the-difference-between-the-final-method-and-abstract-method)
  - [Final class](#final-class)
  - [What happens if we try to inherit from a final Class?](#what-happens-if-we-try-to-inherit-from-a-final-class)
  - [Advantage of the Final Class](#advantage-of-the-final-class)
- [The `import` statement](#the-import-statement)
- [The `static` keyword](#the-static-keyword)
  - [What are the restrictions that are applied to the Java static methods?](#what-are-the-restrictions-that-are-applied-to-the-java-static-methods)
  - [Why is the main method static?](#why-is-the-main-method-static)
  - [What if the static modifier is removed from the signature of the main method?](#what-if-the-static-modifier-is-removed-from-the-signature-of-the-main-method)

<!-- /TOC -->

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


## Can this keyword be used to refer static members??

Yes, It is possible to use this keyword to refer static members because this is just a reference variable which refers to the current class object. However, as we know that, it is unnecessary to access static variables through objects, therefore, it is not the best practice to use this to refer static members. Consider the following example.

```java

public class Test   
{  
    static int i = 10;   
    public Test ()  
    {  
        System.out.println(this.i);      
    }  
    public static void main (String args[])  
    {  
        Test t = new Test();  
    }  
} 

```

This has an output of 10. The reason is that this is a reference variable that refers to the current class object. Since static members belong to a class rather than an object, therefore, this can be used to refer static members. However, it is not a good practice to use this to refer static members.

## How can constructor chaining be done using this keyword?

Constructor chaining enables us to call one constructor from another constructor of the class with respect to the current class object. We can use this keyword to perform constructor chaining within the same class. Consider the following example which illustrates how can we use this keyword to achieve constructor chaining.

```java
public class Employee  
{  
    int id,age;   
    String name, address;  
    public Employee (int age)  
    {  
        this.age = age;  
    }  
    public Employee(int id, int age)  
    {  
        this(age);  
        this.id = id;  
    }  
    public Employee(int id, int age, String name, String address)  
    {  
        this(id, age);  
        this.name = name;   
        this.address = address;   
    }  
    public static void main (String args[])  
    {  
        Employee emp = new Employee(105, 22, "Vikas", "Delhi");  
        System.out.println("ID: "+emp.id+" Name:"+emp.name+" age:"+emp.age+" address: "+emp.address);  
    }  
      
}


```
```bash

ID: 105 Name:Vikas age:22 address: Delhi

```


# Use of `super` keyword

The super keyword in Java is a reference variable that is used to refer to the immediate parent class object. It is used to invoke the constructor of the parent class and also to refer to the parent class instance variables and methods.

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

## How can constructor chaining be done by using the super keyword?

```java
class Person  
{  
    String name,address;   
    int age;  
    public Person(int age, String name, String address)  
    {  
        this.age = age;  
        this.name = name;  
        this.address = address;  
    }  
}  
class Employee extends Person   
{  
    float salary;  
    public Employee(int age, String name, String address, float salary)  
    {  
        super(age,name,address);  
        this.salary = salary;  
    }  
}  
public class Test   
{  
    public static void main (String args[])  
    {  
        Employee e = new Employee(22, "Mukesh", "Delhi", 90000);  
        System.out.println("Name: "+e.name+" Salary: "+e.salary+" Age: "+e.age+" Address: "+e.address);  
    }  
}  

```

```bash


Name: Mukesh Salary: 90000.0 Age: 22 Address: Delhi

```

# `super` VS `this`


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



# The `final` keyword

The final keyword in Java is used to restrict the user. The java final keyword can be used in many contexts. Final can be:

- variable
- method
- class

## Final variable

If you make any variable as final, you cannot change the value of final variable(It will be constant).

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

## Final method

If you make any method as final, you cannot override it. The purpose of final method is that the content of the method can't be changed & it remains the same in the subclass.

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

##  Can you declare the main method as final?

Yes, we can declare the main method as final. The compiler does not throw any error. But, the main method will not be executed if you declare the main method as final.

## Can we declare a constructor as final?

The constructor can never be declared as final because it is never inherited. Constructors are not ordinary methods; therefore, there is no sense to declare constructors as final. However, if you try to do so, The compiler will throw an error.


## What is the difference between the final method and abstract method?

The main difference between the final method and abstract method is that the abstract method cannot be final as we need to override them in the subclass to give its definition.


## Final class

The final class is a class that is declared with the final keyword. Subclasses can't inherit a final class or a final class cannot be inherited by any subclass. So, we can restrict class inheritance by making use of a final class.

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

## What happens if we try to inherit from a final Class?

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

## Advantage of the Final Class

- Final class provides security as it cannot be extended or inherited by any other class, classes that can be extended can leak sensitive data of potential users but final classes make data elements safe and secure.

- Final class is a complete and immutable class, so data elements do not change by external access.

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

## What are the restrictions that are applied to the Java static methods?

Two main restrictions are applied to the static methods.

 - The static method can not use non-static data member or call the non-static method directly.
 - `this` and `super` cannot be used in static context as they are non-static.

## Why is the main method static?

Because the object is not required to call the static method. If we make the main method non-static, JVM will have to create its object first and then call main() method which will lead to the extra memory allocation.

## What if the static modifier is removed from the signature of the main method?

Program compiles. However, at runtime, It throws an error "NoSuchMethodError."