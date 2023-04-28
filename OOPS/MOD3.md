<!-- TOC -->

- [Single Responsibility Principle (SRP) for Java](#single-responsibility-principle-srp-for-java)
- [Don’t Repeat Yourself (DRY) Principle in java](#dont-repeat-yourself-dry-principle-in-java)
- [Tight coupling and Loose coupling in java](#tight-coupling-and-loose-coupling-in-java)
  - [Tightly Coupled Classes](#tightly-coupled-classes)
  - [Loosely Coupled Classes](#loosely-coupled-classes)

<!-- /TOC -->

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