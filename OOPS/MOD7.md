<!-- TOC -->

- [What is Errors in Java ?](#what-is-errors-in-java-)
- [What is Exception in Java ?](#what-is-exception-in-java-)
  - [Types of Exception in Java](#types-of-exception-in-java)
    - [1. Checked Exception](#1-checked-exception)
    - [2. Unchecked Exception](#2-unchecked-exception)
    - [3. Error](#3-error)
  - [Diff b/w Error and Exception in Java ?](#diff-bw-error-and-exception-in-java-)
- [What is Exception Handling in Java ?](#what-is-exception-handling-in-java-)
  - [Advantage of Exception Handling](#advantage-of-exception-handling)
  - [Problem without exception handling](#problem-without-exception-handling)
  - [Solution by exception handling](#solution-by-exception-handling)
  - [Java Exception Keywords](#java-exception-keywords)
  - [Java Exception Handling Example](#java-exception-handling-example)
  - [Common Scenarios of Java Exceptions](#common-scenarios-of-java-exceptions)
    - [ArithmeticException occurs](#arithmeticexception-occurs)
    - [NullPointerException occurs](#nullpointerexception-occurs)
    - [NumberFormatException occurs](#numberformatexception-occurs)
    - [ArrayIndexOutOfBoundsException occurs](#arrayindexoutofboundsexception-occurs)
- [Java try-catch block](#java-try-catch-block)
  - [Java try block](#java-try-block)
  - [Java catch block](#java-catch-block)
  - [Internal working of Java try-catch block](#internal-working-of-java-try-catch-block)
- [Threading in Java](#threading-in-java)
  - [Introduction to process](#introduction-to-process)
  - [Threads in Java](#threads-in-java)
  - [Difference between process and thread](#difference-between-process-and-thread)
  - [Scheduling in Java](#scheduling-in-java)
  - [Context Switching in Java](#context-switching-in-java)
  - [Multihreading in Java](#multihreading-in-java)
    - [What is Multithreading?](#what-is-multithreading)
    - [Multithreading vs Multiprocessing](#multithreading-vs-multiprocessing)
    - [How does Java Support Multithreading?](#how-does-java-support-multithreading)
    - [What are the different types of threads?](#what-are-the-different-types-of-threads)
    - [What is Thread Priority?](#what-is-thread-priority)
    - [Life Cycle of a Thread](#life-cycle-of-a-thread)

<!-- /TOC -->

# What is Errors in Java ? 

Errors are the problems in a program due to which the program will stop the execution. 
Example: StackOverflowError, OutOfMemoryError, etc.

# What is Exception in Java ?

In Java, an exception is an event that occurs during the execution of a program and disrupts its normal flow. When an exception occurs, Java creates an object of the corresponding exception class and throws it. The program then terminates abnormally, i.e. it crashes.

## Types of Exception in Java

There are mainly two types of exceptions: checked and unchecked. Here, an error is considered as the unchecked exception. According to Oracle, there are three types of exceptions:

### 1. Checked Exception

The classes that extend Throwable class except RuntimeException and Error are known as checked exceptions e.g.IOException, SQLException etc. Checked exceptions are checked at compile-time.

Example: IOException, SQLException etc.

### 2. Unchecked Exception

The classes that extend RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

Example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.

### 3. Error

Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

Example: OutOfMemoryError, VirtualMachineError, AssertionError etc.

## Diff b/w Error and Exception in Java ?

Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc. while Exception is recoverable e.g. IOException, SQLException, ClassNotFoundException etc.



# What is Exception Handling in Java ?

Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

## Advantage of Exception Handling

The core advantage of exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions. Let's consider a scenario:

```java
statement 1;  
statement 2;  
statement 3;  
statement 4;  
statement 5; //exception occurs  
statement 6;  
statement 7;  
statement 8;  
statement 9;  
statement 10;  
```

Suppose there are 10 statements in a Java program and an exception occurs at statement 5; the rest of the code will not be executed, i.e., statements 6 to 10 will not be executed. However, when we perform exception handling, the **rest of the statements will be executed**. That is why we use exception handling in Java.


## Problem without exception handling

Let's try to understand the problem if we don't use a try-catch block.

```java
public class TryCatchExample1 {  
  
    public static void main(String[] args) {  
          
        int data=50/0; //may throw exception   
          
        System.out.println("rest of the code");  
          
    }  
      
}  
```

Output: `Exception in thread "main" java.lang.ArithmeticException: / by zero`

As displayed in the above example, the rest of the code is not executed (in such case, the rest of the code statement is not printed).

There might be 100 lines of code after the exception. If the exception is not handled, all the code below the exception won't be executed.

## Solution by exception handling

Let's see the solution of the above problem by a java try-catch block.

```java
public class TryCatchExample2 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  
```

Output: 

```bash
java.lang.ArithmeticException: / by zero
rest of the code
```

As displayed in the above example, the rest of the code is executed, i.e., the rest of the code statement is printed.

## Java Exception Keywords

- **try** : The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.

- **catch** : The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

- **finally** : The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.

- **throw** : The "throw" keyword is used to throw an exception.

- **throws** : The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.

## Java Exception Handling Example

```java
public class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      int data=100/0;  
   }catch(ArithmeticException e){System.out.println(e);}  
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
}  
```
Output:

```bash
Exception in thread main java.lang.ArithmeticException:/ by zero
rest of the code...
```

In the above example, 100/0 raises an ArithmeticException which is handled by a try-catch block.

## Common Scenarios of Java Exceptions

There are given some scenarios where unchecked exceptions may occur. They are as follows:

### ArithmeticException occurs

If we divide any number by zero, there occurs an ArithmeticException.
```java
int a=50/0;//ArithmeticException  
```

### NullPointerException occurs

If we have null value in any variable, performing any operation by the variable occurs an NullPointerException.
```java
String s=null;
System.out.println(s.length());//NullPointerException  
```

### NumberFormatException occurs

The wrong formatting of any value, may occur NumberFormatException. Suppose I have a string variable that have characters, converting this variable into digit will occur NumberFormatException.
```java
String s="abc";
int i=Integer.parseInt(s);//NumberFormatException  
```

### ArrayIndexOutOfBoundsException occurs

If you are inserting any value in the wrong index, it would result ArrayIndexOutOfBoundsException as shown below:
```java
int a[]=new int[5];
a[10]=50; //ArrayIndexOutOfBoundsException  
```


# Java try-catch block

## Java try block

Java try block is used to enclose the code that might throw an exception. It must be used within the method.

If an exception occurs at the particular statement in the try block, the rest of the block code will not execute. So, it is recommended not to keep the code in try block that will not throw an exception.

Java try block must be followed by either catch or finally block.

```java

try{
//code that may throw exception
}catch(Exception_class_Name ref){
//code to handle exception
}
```


## Java catch block

Java catch block is used to handle the Exception by declaring the type of exception within the parameter. The declared exception must be the parent class exception ( i.e., Exception) or the generated exception type. However, the good approach is to declare the generated type of exception.

The catch block must be used after the try block only. You can use multiple catch block with a single try block.

## Internal working of Java try-catch block

The JVM firstly checks whether the exception is handled or not. If exception is not handled, JVM provides a default exception handler that performs the following tasks:

- Prints out exception description.
- Prints the stack trace (Hierarchy of methods where the exception occurred).
- Causes the program to terminate.
  

But if the application programmer handles the exception, the normal flow of the application is maintained, i.e., rest of the code is executed.



# Threading in Java

## Introduction to process

In simple words, a process in Java is a program or application that is running on a computer. When a Java program is executed, it creates a process that is managed by the operating system. This process has its own memory space, resources, and thread of execution.

Overall, processes in Java are a fundamental concept that allows you to create and manage applications that run independently and interact with other applications or processes.

## Threads in Java

In Java, a thread is a way of running multiple parts of a program at the same time. Each thread represents a separate flow of control within the program. 

Threads are important because they allow programs to take advantage of multiple CPUs or cores, which can make the program run faster and more efficiently. To create a thread, you create a new instance of the Thread class, and then either extend the class or implement the Runnable interface. 

Once the thread is created, you can start it running using the ` start()` method. Java provides several mechanisms for coordinating the execution of threads, such as synchronization and joining. 

Overall, threads are a key concept in Java programming that allows for efficient execution of concurrent tasks.

## Difference between process and thread

| Process      | Thread       |
| ----------- | ----------- |
| A process is an instance of a program that runs independently with its own memory and resources.      | A thread is a lightweight unit of execution within a process that shares the same memory space and resources as other threads within the process.       |
| Processes are best for tasks that need complete isolation.   | Threads are better for tasks that need to share data or resources within a single process.        |
| Processes incur more overhead than threads.   | Communication between processes is slower than communication between threads.        |

> **Note**
> Threads are part of a process, meaning that a process can have multiple threads running concurrently within it.


## Scheduling in Java

Scheduling refers to the process of assigning resources (such as CPUs, memory, or I/O devices) to tasks or processes in a computer system. The main goal of scheduling is to optimize the utilization of resources and to ensure that tasks are completed as efficiently as possible.

The scheduler is responsible for determining which tasks should be executed next, and for allocating resources to those tasks. The scheduler may use a variety of algorithms to make these decisions, such as round-robin scheduling, priority scheduling, or shortest job first scheduling.

Overall, scheduling is an important concept in computer systems that plays a critical role in ensuring efficient resource utilization and optimal system performance.

## Context Switching in Java

Context switching is the process by which a computer system switches from executing one process or thread to another. In Java, context switching occurs when the JVM (Java Virtual Machine) switches from executing one thread to another thread.

When a thread is executing, it has its own set of registers, program counter, and stack. The JVM stores this information in a data structure known as a thread context, which is used to manage the execution of the thread. When the JVM switches from executing one thread to another, it must save the current thread's context and restore the context of the thread that is about to be executed.

Context switching in Java can occur for a variety of reasons, such as when a thread blocks on I/O or waits for a lock to be released. The JVM uses a scheduling algorithm to determine which thread should be executed next, based on factors such as thread priority and time-slicing.

Context switching can have a significant impact on the performance of a Java application. Switching between threads incurs overhead, as the JVM must save and restore thread contexts. Additionally, if there are many threads running concurrently, context switching can lead to contention for system resources, which can cause delays and reduce overall throughput.

Overall, context switching is an important concept in Java threading that plays a critical role in managing the execution of concurrent threads in a Java application.


## Multihreading in Java

When we run a real-world application, we use good processors for faster execution. But, only processor speed can’t make your application run fast. One of the great ways to create a performance efficient application is use utilize multithreading.

### What is Multithreading?

Multithreading is a programming concept in which the application can create a small unit of tasks to execute in parallel. If you are working on a computer, it runs multiple applications and allocates processing power to them. A simple program runs in sequence and the code statements execute one by one. This is a single-threaded application. 

But, if the programming language supports creating multiple threads and passes them to the operating system to run in parallel, it’s called multithreading.

### Multithreading vs Multiprocessing

When we talk about multithreading, we don’t care if the machine has a 2-core processor or a 16-core processor. Our work is to create a multithreaded application and let the OS handle the allocation and execution part. In short, multithreading has nothing to do with multiprocessing.

### How does Java Support Multithreading?
Java has great support for multithreaded applications. Java supports multithreading through Thread class. Java Thread allows us to create a lightweight process that executes some tasks. We can create multiple threads in our program and start them. Java runtime will take care of creating machine-level instructions and work with OS to execute them in parallel.

### What are the different types of threads?
There are two types of threads in an application - user thread and daemon thread. When we start an application, the main is the first user thread created. We can create multiple user threads as well as daemon threads. When all the user threads are executed, JVM terminates the program.

### What is Thread Priority?

Every Java thread has a priority that helps the operating system determine the order in which threads are scheduled.

Java thread priorities are in the range between MIN_PRIORITY (a constant of 1) and MAX_PRIORITY (a constant of 10). By default, every thread is given priority NORM_PRIORITY (a constant of 5).

Threads with higher priority are more important to a program and should be allocated processor time before lower-priority threads. However, thread priorities cannot guarantee the order in which threads execute and are very much platform dependent

### Life Cycle of a Thread

A thread goes through various stages in its life cycle. For example, a thread is born, started, runs, and then dies. The following diagram shows the complete life cycle of a thread
  
- **New** − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.

- **Runnable** − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task.

- **Waiting** − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing.

- **Timed Waiting** − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs.

- **Terminated (Dead)** − A runnable thread enters the terminated state when it completes its task or otherwise terminates.