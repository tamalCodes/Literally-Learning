<!-- TOC -->

- [JDK, JRE, JVM](#jdk-jre-jvm)
- [Java bytecode](#java-bytecode)
- [Data types in Java](#data-types-in-java)
- [Garbage collection](#garbage-collection)
- [How to work Garbage collection ?](#how-to-work-garbage-collection-)

<!-- /TOC -->

# JDK, JRE, JVM

JDK, JRE, and JVM are all related to the Java programming language. Here's a simple explanation of what each of these terms means:

- **JDK (Java Development Kit)**: JDK is a software development kit used to develop Java applications. It includes tools that allow developers to write, compile, and debug their code. In other words, if you want to create Java applications, you need to install the JDK on your computer.

- **JRE (Java Runtime Environment)**: JRE is a software environment that allows you to run Java applications on your computer. It includes the Java Virtual Machine (JVM) and other libraries that are necessary to run Java programs. So, if you want to run a Java application, you need to install the JRE on your computer.

- **JVM (Java Virtual Machine)**: JVM is a virtual machine that interprets Java bytecode and executes it on your computer. It is a part of both the JDK and the JRE. When you run a Java program, the JVM converts the bytecode into machine code that can be executed by your computer's CPU.

In summary, JDK is used to develop Java applications, JRE is used to run Java applications, and JVM is the virtual machine that executes Java code


# Java bytecode

Java bytecode is a binary format that represents the instructions of a Java program. When you write Java code, you use a programming language that is easy for humans to read and write. However, a computer cannot directly understand this code. **Instead, the Java compiler takes your code and translates it into Java bytecode.**

Java bytecode is a **low-level** representation of your program that can be executed by the Java Virtual Machine (JVM). This means that your Java code can run on any computer that has a JVM installed, regardless of the operating system or hardware architecture.

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


# How to work Garbage collection ? 

 The garbage collector of JVM collects only those objects that are created by new keyword. 

 SO if you create an object without new keyword, then you can use the  `finalize() ` method to perform clean up processing.

 ```java
 class GarbageEx{
        public void finalize(){
            System.out.println("Garbage collection");
        }
        public static void main(String[] args){
            GarbageEx g1 = new GarbageEx();
            GarbageEx g2 = new GarbageEx();
            g1 = null;
            g2 = null;
            System.gc();
        }
 }
 ```

 `System.gc()` is used to call the `finalize()` method for both g1 and g2, 2 unused objects. So finalize method will be called twice.