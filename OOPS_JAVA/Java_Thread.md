<!-- TOC -->

- [Introduction to process](#introduction-to-process)
- [Threads in Java](#threads-in-java)
  - [Difference between process and thread](#difference-between-process-and-thread)
- [Scheduling in Java](#scheduling-in-java)
- [Context Switching in Java](#context-switching-in-java)
- [Multihreading in Java](#multihreading-in-java)
  - [What is Multithreading?](#what-is-multithreading)
  - [Advantages of Multithreading](#advantages-of-multithreading)
  - [Main thread](#main-thread)
  - [Multithreading vs Multiprocessing](#multithreading-vs-multiprocessing)
  - [How does Java Support Multithreading?](#how-does-java-support-multithreading)
- [What are the different types of threads?](#what-are-the-different-types-of-threads)
- [What is Thread Priority?](#what-is-thread-priority)
- [Life Cycle of a Thread](#life-cycle-of-a-thread)
- [Thread Creation](#thread-creation)
  - [1. Thread class](#1-thread-class)
  - [2. Runnable interface](#2-runnable-interface)
- [Important methods in Java thread](#important-methods-in-java-thread)
  - [`start()`](#start)
  - [`run()`](#run)
    - [Diff between `start()` and `run()` ?](#diff-between-start-and-run-)
  - [`yield()`](#yield)
  - [`sleep(long milliseconds)`](#sleeplong-milliseconds)
  - [`join()`](#join)
  - [`suspend()` and `resume()`](#suspend-and-resume)
  - [`wait()`, `notify()` and `notifyAll()`](#wait-notify-and-notifyall)
- [Synchronization in Java Multithreading](#synchronization-in-java-multithreading)
- [Thread Deadlock](#thread-deadlock)

<!-- /TOC -->


# Introduction to process

In simple words, a process in Java is a program or application that is running on a computer. When a Java program is executed, it creates a process that is managed by the operating system. This process has its own memory space, resources, and thread of execution.

Overall, processes in Java are a fundamental concept that allows you to create and manage applications that run independently and interact with other applications or processes.

# Threads in Java

In Java, a thread is a way of running multiple parts of a program at the same time. Each thread represents a separate flow of control within the program.

Threads are important because they allow programs to take advantage of multiple CPUs or cores, which can make the program run faster and more efficiently. To create a thread, you create a new instance of the Thread class, and then either extend the class or implement the Runnable interface.

Once the thread is created, you can start it running using the ` start()` method. Java provides several mechanisms for coordinating the execution of threads, such as synchronization and joining.

Overall, threads are a key concept in Java programming that allows for efficient execution of concurrent tasks.

## Difference between process and thread

| Process                                                                                          | Thread                                                                                                                                            |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| A process is an instance of a program that runs independently with its own memory and resources. | A thread is a lightweight unit of execution within a process that shares the same memory space and resources as other threads within the process. |
| Processes are best for tasks that need complete isolation.                                       | Threads are better for tasks that need to share data or resources within a single process.                                                        |
| Processes incur more overhead than threads.                                                      | Communication between processes is slower than communication between threads.                                                                     |

> **Note**
> Threads are part of a process, meaning that a process can have multiple threads running concurrently within it.

# Scheduling in Java

Scheduling refers to the process of assigning resources (such as CPUs, memory, or I/O devices) to tasks or processes in a computer system. The main goal of scheduling is to optimize the utilization of resources and to ensure that tasks are completed as efficiently as possible.

The scheduler is responsible for determining which tasks should be executed next, and for allocating resources to those tasks. The scheduler may use a variety of algorithms to make these decisions, such as round-robin scheduling, priority scheduling, or shortest job first scheduling.

Overall, scheduling is an important concept in computer systems that plays a critical role in ensuring efficient resource utilization and optimal system performance.

# Context Switching in Java

Context switching is the process by which a computer system switches from executing one process or thread to another. In Java, context switching occurs when the JVM (Java Virtual Machine) switches from executing one thread to another thread.

When a thread is executing, it has its own set of registers, program counter, and stack. The JVM stores this information in a data structure known as a thread context, which is used to manage the execution of the thread. When the JVM switches from executing one thread to another, it must save the current thread's context and restore the context of the thread that is about to be executed.

Context switching in Java can occur for a variety of reasons, such as when a thread blocks on I/O or waits for a lock to be released. The JVM uses a scheduling algorithm to determine which thread should be executed next, based on factors such as thread priority and time-slicing.

Context switching can have a significant impact on the performance of a Java application. Switching between threads incurs overhead, as the JVM must save and restore thread contexts. Additionally, if there are many threads running concurrently, context switching can lead to contention for system resources, which can cause delays and reduce overall throughput.

Overall, context switching is an important concept in Java threading that plays a critical role in managing the execution of concurrent threads in a Java application.

# Multihreading in Java

When we run a real-world application, we use good processors for faster execution. But, only processor speed can’t make your application run fast. One of the great ways to create a performance efficient application is use utilize multithreading.

## What is Multithreading?

When a program (At execution time program is called process) is sub divided into two or more subprograms, which can be parallelly executed at the same time, then each subprogram is called thread and each thread defines a separate path of execution

## Advantages of Multithreading

- It doesn’t block the user because threads are independent and you can perform multiple operations at same time.
- You can perform many operations together, so it saves time.

## Main thread

When a Java program execution starts, one thread begins running up to end of execution.
This thread is called main thread. Child threads are generated from main thread.

## Multithreading vs Multiprocessing

When we talk about multithreading, we don’t care if the machine has a 2-core processor or a 16-core processor. Our work is to create a multithreaded application and let the OS handle the allocation and execution part. In short, multithreading has nothing to do with multiprocessing.

## How does Java Support Multithreading?

Java has great support for multithreaded applications. Java supports multithreading through Thread class. Java Thread allows us to create a lightweight process that executes some tasks. We can create multiple threads in our program and start them. Java runtime will take care of creating machine-level instructions and work with OS to execute them in parallel.

# What are the different types of threads?

There are two types of threads in an application - user thread and daemon thread. When we start an application, **the main is the first user thread created.** We can create multiple user threads as well as daemon threads. When all the user threads are executed, JVM terminates the program.

# What is Thread Priority?

Every Java thread has a priority that helps the operating system determine the order in which threads are scheduled.

Java thread priorities are in the range between MIN_PRIORITY (a constant of 1) and MAX_PRIORITY (a constant of 10). By default, every thread is given priority NORM_PRIORITY (a constant of 5).

Threads with higher priority are more important to a program and should be allocated processor time before lower-priority threads. However, thread priorities cannot guarantee the order in which threads execute and are very much platform dependent

```java

class MyThread extends Thread
{
  public void run()
  {
    System.out.println("Priority is : " + Thread.currentThread().getPriority());
  }

  public static void main(String[] args)
  {
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    MyThread t3 = new MyThread();

    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    t3.setPriority(Thread.NORM_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
  }
}

```

Output:

```bash
Priority is : 1
Priority is : 10
Priority is : 5
```


# Life Cycle of a Thread

A thread goes through various stages in its life cycle. For example, a thread is born, started, runs, and then dies. The following diagram shows the complete life cycle of a thread

- **New** − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.

- **Ready** - The thread is in ready state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
- **Running** − The thread is in running state if the thread scheduler has selected it. It keeps running until it becomes blocked, or its run() method exits.
- **Waiting/Asleep/Blocked** − This state is for the threads waiting for others to perform a certain action. For example, if one thread has called join() method on the another thread, then the first thread is in waiting state until the second thread completes its task.
- **Dead** − A thread is considered dead when its run() method completes its execution or the stop() method is called on the thread.

# Thread Creation

There are two ways to create a thread in Java:

- By extending Thread class
- By implementing Runnable interface.

## 1. Thread class

Java provides Thread class to create and use threads. Here is how we can create threads in Java by extending Thread class:

```java
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```

## 2. Runnable interface

Java provides Runnable interface that should be implemented by any class whose instances are intended to be executed by a thread.

```java
class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
       MyThread obj = new MyThread();
       Thread t1 = new Thread(obj);
       t1.start();
    }
}
```

# Important methods in Java thread

## `start()`

Starts the thread in a separate path of execution, then invokes the run() method on this Thread object.

## `run()`

If this Thread object was instantiated using a separate Runnable target, the run() method is invoked on that Runnable object.

### Diff between `start()` and `run()` ? 

`thread.start()` is used to start a new thread of execution. It creates a new thread and runs the code in that thread concurrently with the main thread. The actual execution of the thread's code happens independently and concurrently.

`thread.run()` simply calls the code in the thread's run() method in the current thread. It does not create a new thread but executes the code sequentially in the same thread that made the call. The code runs in a regular method invocation manner, without any concurrent execution.

## `yield()`

Causes the currently executing thread object to temporarily pause and allow other threads to execute.

Example :

```java
class TestThreadYield extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            if(i==3)
                Thread.yield();
        }
    }
    public static void main(String args[]){
        TestThreadYield t1=new TestThreadYield();
        TestThreadYield t2=new TestThreadYield();
        t1.start();
        t2.start();
    }
}
```

Output:

```bash
Thread-0 : 1
Thread-0 : 2
Thread-0 : 3
Thread-1 : 1
Thread-1 : 2
Thread-1 : 3
Thread-1 : 4
Thread-1 : 5
Thread-0 : 4
Thread-0 : 5
```

In the above example, when i==3, the thread t1 yields the processor, and the thread t2 gets the chance for execution. After completion of the current iteration of the thread t2, the thread t1 again gets the chance for execution.

## `sleep(long milliseconds)`

Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers.

Example:

```java
public class HelloTamal extends Thread {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                if (i == 5) {
                    try {
                        Thread.sleep(5000);
                        System.out.println(Thread.currentThread().getName() + " is sleeping ");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
```

## `join()`

Waits for a thread to die.

Example:

```java

class MyThread extends Thread
{
  public void run()
  {
    for(int i = 0; i<5; i++)
    {
      try
      {
        Thread.sleep(500);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
      System.out.println(i);
    }
  }

  public static void main(String[] args)
  {
    MyThread t1 = new MyThread();

    t1.start();
    try
    {
      for(int i = 0; i<5; i++)
    {
      Thread.sleep(500);
      System.out.println(i);
    }
      t1.join();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}

```

In the above example, the `t1.join` method causes the main thread to wait until the completion of thread t1. After completing t1, main thread are executed.


## `suspend()` and `resume()`

suspend() method is used to suspend the thread execution and resume() method is used to resume the thread execution.

## `wait()`, `notify()` and `notifyAll()`

The wait() method tells the calling thread to give up the monitor and go to sleep until some other thread enters the same monitor and calls notify( ).

The notify() method wakes up the first thread that called wait() on the same object.

The notifyAll() method wakes up all the threads that called wait() on the same object. The highest priority thread will run first.


Example:

```java
class TestWaitNotify{
    public static void main(String args[]){
        final Customer c=new Customer();
        new Thread(){
            public void run(){c.withdraw(15000);}
        }.start();
        new Thread(){
            public void run(){c.deposit(10000);}
        }.start();
    }
}

class Customer{
    int amount=10000;

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");
        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposit...");
            try{wait();}catch(Exception e){}
        }
        this.amount-=amount;
        System.out.println("withdraw completed...the remaining balance is "+this.amount);
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("deposit completed... "+this.amount);
        notify();
    }
}
``` 


# Synchronization in Java Multithreading

When two or more threads want to access to a shared resource, they need some way to ensure that the resource will be used by only one thread at a time. The process by which this synchronization is achieved is called thread synchronization.

```java

public class ThreadSynchronizationExample {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        ThreadSynchronizationExample example = new ThreadSynchronizationExample();

        // Create multiple threads
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + example.count);
    }
}
```

Output:

```bash
Count: 2000
```

In this example, we have a `ThreadSynchronizationExample` class with a count variable that we want to increment using two separate threads. By marking the `increment()` method with the `synchronized` keyword, we ensure that only one thread can execute that method at a time, preventing any race conditions.

We create two threads, thread1 and thread2, where each thread calls the increment() method 1000 times. The synchronized keyword ensures that the count variable is properly synchronized between the threads.

After starting the threads and waiting for them to finish using join(), we print the final value of count, which should be 2000 if the synchronization is working correctly.

**What would have happened if i didnot use `synchronized` ?**

```bash
Count: 1998
```

Without synchronization, race conditions can occur when multiple threads try to update the count variable simultaneously. In this case, each thread is performing 1000 increments, but the increments are not atomic operations.


# Thread Deadlock

A deadlock is a situation where two or more threads are blocked forever, waiting for each other. Deadlock occurs when multiple threads need the same locks but obtain them in different order.

```java
public class ThreadDeadlockExample {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 acquired lock1");
                
                Thread.sleep(1000);
                synchronized (lock2) {
                    System.out.println("Thread 1 acquired lock2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 acquired lock2");
                
                Thread.sleep(1000);
                synchronized (lock1) {
                    System.out.println("Thread 2 acquired lock1");
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
```

In this example, we have two threads, thread1 and thread2, and two locks, lock1 and lock2. Each thread attempts to acquire the locks in a different order, leading to a potential deadlock situation.

thread1 acquires lock1 and then attempts to acquire lock2, while thread2 acquires lock2 and then attempts to acquire lock1. If both threads start concurrently, there is a chance that thread1 acquires lock1 and thread2 acquires lock2 simultaneously. Then, both threads will be waiting for the other lock to be released, resulting in a deadlock where neither thread can proceed.