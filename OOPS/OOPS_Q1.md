

# What is the difference between a class and an object?

A class is a blueprint for an object. It tells the computer how to build an object of that type. An object is an instance of a class. It is a concrete 'thing' that is built following the instructions of the class it belongs to.

```java
public class Car {
    // Class
}

Car myCar = new Car();
// Object
```

# What is the purpose of encapsulation in OOP?

Encapsulation is the process of hiding the internal workings of an object from the outside world. It is a way of protecting the data and methods of an object from being accessed by code outside of the object. It is a way of ensuring that the object is only accessed through its public interface.

```java
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
```

# How does inheritance promote code reuse and extensibility?

Inheritance is the process of creating a new class from an existing class. The new class inherits all of the properties and methods of the existing class. This allows us to reuse code that is common to multiple classes. It also allows us to extend the functionality of a class by adding new properties and methods to it.

```java
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {  
        return year;
    }
}
```

# What is polymorphism and how does it contribute to code flexibility?

Polymorphism is the ability of an object to take on many forms. It allows us to treat objects of different types in the same way. This makes our code more flexible and reusable.

```java
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
```

# What is the significance of the "this" keyword in OOP?

The "this" keyword is a reference to the current object. It is used to access the properties and methods of the current object. It is also used to pass the current object as an argument to a method.

```java
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
```

# What is the role of constructors in a class?

Constructors are special methods that are used to create objects of a class. They are called when an object is created using the "new" keyword. They are used to initialize the properties of an object.

```java
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
```

# What are abstract classes and interfaces? How are they different?

Abstract Classes: Abstract classes are classes that cannot be instantiated. They are used to define common behavior for subclasses. They can contain abstract methods that must be implemented by subclasses. They can also contain concrete methods that can be inherited by subclasses.

Interfaces: Interfaces are similar to abstract classes in that they cannot be instantiated. They are used to define common behavior for classes that implement them. They can contain abstract methods that must be implemented by classes that implement them. They can also contain default methods that can be inherited by classes that implement them.

```java
public abstract class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void drive();
}
```

```java
public interface Drivable {
    public void drive();
}
```

# How do you achieve method overloading and method overriding in OOP?

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