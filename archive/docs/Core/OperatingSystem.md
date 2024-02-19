<!-- TOC -->

- [1. What if there is no OS?](#1-what-if-there-is-no-os)
- [2. What is an OS made up of?](#2-what-is-an-os-made-up-of)
- [3. Functions of OS](#3-functions-of-os)
- [4. What is an Operating System](#4-what-is-an-operating-system)
- [5. Goals of OS](#5-goals-of-os)
- [6. Types of OS](#6-types-of-os)
  - [Issues](#issues)
- [7. Process](#7-process)
- [8. Program](#8-program)
- [9. Thread](#9-thread)
- [10. Difference between Multithreading and Multiprocessing](#10-difference-between-multithreading-and-multiprocessing)
- [11. Thread Scheduling](#11-thread-scheduling)
- [12. Difference between Thread Context Switching and Process Context Switching](#12-difference-between-thread-context-switching-and-process-context-switching)
- [13. Components of Operating System](#13-components-of-operating-system)
- [14. A shell,](#14-a-shell)
- [15. Functions of Kernel:](#15-functions-of-kernel)
- [16. Types of Kernels:](#16-types-of-kernels)
- [17. How will communication happen between user mode and kernel mode?](#17-how-will-communication-happen-between-user-mode-and-kernel-mode)
- [18. How do apps interact with Kernel?](#18-how-do-apps-interact-with-kernel)
- [19. What is System Call ?](#19-what-is-system-call-)
- [20. System Calls are the only way through which a process can go into kernel mode from user mode.](#20-system-calls-are-the-only-way-through-which-a-process-can-go-into-kernel-mode-from-user-mode)
- [21. Types of System Calls:](#21-types-of-system-calls)
- [22. Examples of Windows \& Unix System calls:](#22-examples-of-windows--unix-system-calls)
- [23. Hands-on](#23-hands-on)
- [24. What happens when you turn on your computer?](#24-what-happens-when-you-turn-on-your-computer)
- [25. What is the memory capacity of a 32-bit operating system ?](#25-what-is-the-memory-capacity-of-a-32-bit-operating-system-)
- [26. What is the memory capacity of a 64-bit operating system ?](#26-what-is-the-memory-capacity-of-a-64-bit-operating-system-)
- [27. How much data can a 32-bit CPU architecture process ?](#27-how-much-data-can-a-32-bit-cpu-architecture-process-)
- [28. How much data can a 64-bit CPU architecture process ?](#28-how-much-data-can-a-64-bit-cpu-architecture-process-)
- [29. What are the advantages of a 64-bit operating system over a 32-bit operating system?](#29-what-are-the-advantages-of-a-64-bit-operating-system-over-a-32-bit-operating-system)
- [30.](#30)

<!-- /TOC -->

# 1. What if there is no OS?
  - Bulky and complex app. (Hardware interaction code must be in app’s code base)
  - Resource exploitation by 1 App.
  - No memory protection.

# 2. What is an OS made up of?
 - Collection of system software.
  
# 3. Functions of OS
  - Resource management (Aka, Arbitration) (memory, device, file, security, process etc)
  - Hides the underlying complexity of the hardware. (Aka, Abstraction)
  - facilitates execution of application programs by providing isolation and protection.
  - Access to the computer hardware.

# 4. What is an Operating System
  - Piece of software that manages all the resources of a computer system,both hardware and software, and provides an environment in which the user can execute his/her programs in a convenient and efficient manner by hiding underlying complexity of the hardware and acting as a resource manager.

# 5. Goals of OS
  - **Maximum CPU utilization** - refers to the highest level of CPU (Central Processing Unit) usage that a computer system or a specific process can reach over a given period of time. CPU utilization is a measure of how much of the CPU's processing power is being utilized to execute tasks.
  - **Less process starvation** - refers to a situation in computer systems where a process is unable to make progress or complete its execution due to limited availability of resources. It occurs when the resources required by a process are consistently allocated to other processes, preventing the starved process from receiving its fair share.
  - **Higher priority job execution** - refers to a scheduling approach where tasks or jobs with higher priority are given precedence over those with lower priority when it comes to execution. In this context, priority refers to the relative importance or urgency of a job compared to others in a system.

# 6. Types of OS

a. **Single Process OS** - refers to an operating system that supports the execution of only a single process at a time . No maximum utilization, process starvation occurs, no high priority job occurs. Example - MS DOS

b. **Batch Processing OS** - facilitates the execution of a series of jobs or programs without requiring user interaction. The jobs are submitted as a batch, and the operating system executes them one after another without requiring manual intervention. Example - ATLAS
![](https://github.com/ItsRoy69/Learn/assets/78967360/9bbe8956-4c3d-4c55-9af9-c635dfcd16ed)

      1. Firstly, user prepares his job using punch cards.
      2. Then, he submits the job to the computer operator.
      3. Operator collects the jobs from different users and sort the jobs into batches with
      similar needs.
      4. Then, operator submits the batches to the processor one by one.
      5. All the jobs of one batch are executed together.
      
   ## Issues
      
      - Priorities cannot be set, if a job comes with some higher priority. 
      - May lead to starvation. (A batch may take more time to complete) 
      - CPU may become idle in case of I/O operations. 
      
c. **Multiprogramming OS** - increases CPU utilization by keeping multiple jobs (code and data) in the memory so that the CPU always has one to execute in case some job gets busy with I/O. Example - THE OS
      
      - Single CPU 
      - Context switching for processes. 
      - Switch happens when current process goes to wait state. 
      - CPU idle time reduced. 

d. **Multitasking OS** - is a logical extension of multiprogramming. Example - CTSS OS

      - Single CPU 
      - Able to run more than one task simultaneously. 
      - Context switching and time sharing used. 
      - Increases responsiveness. 
      - CPU idle time is further reduced.  

e. **Multi-processing OS** - more than 1 CPU in a  single computer.  Example - Windows

      - Increases reliability, 1 CPU fails, other can work 
      - Better throughput. 
      - Lesser process starvation, (if 1 CPU is working on some process, other can be executed on other CPU.

f. **Distributed OS** - Loosely Coupled OS.  Example - LOCUS, Mach/OS

      - OS manages many bunches of resources, >=1 CPUs, >=1 memory, >=1 GPUs, etc 
      - Loosely connected autonomous, interconnected computer nodes. 
      - collection of independent, networked, communicating, and physically separate computational nodes. 
 
g. **Real-Time OS**  Example - Network Multimedia Systems
       
      - Real time error free, computations within tight-time boundaries.
      - Air Traffic control system, ROBOTS etc. 

# 7. Process
  Program under execution. Resides in Computer’s primary memory (RAM).

# 8. Program
  A Program is an executable file which contains a certain set of instructions written to complete the specific job or operation on your computer.
  
    • It’s a compiled code. Ready to be executed.
    • Stored in Disk
    
# 9. Thread

    • Single sequence stream within a process.
    • An independent path of execution in a process.
    • Light-weight process.
    • Used to achieve parallelism by dividing a process’s tasks which are independent path
    of execution.

    • E.g., Multiple tabs in a browser, text editor (When you are typing in an editor, spell-checking, formatting of text and saving the text are done concurrently by multiple threads.)
    
------------------------------------------------------------------------------------------------------------------

# 10. Difference between Multithreading and Multiprocessing

| **Multitasking**                                                       | **Multithreading**                                                                                                              |
| ---------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| Execution of more than one task simultaneously is called multitasking. | A process is divided into several different sub-tasks called threads, each with its own path of execution (within the process). |
| Concept of more than one processes being context switched.             | Concept of more than one thread. Threads are context switched.                                                                  |
| Number of CPUs: 1 or more                                              | Number of CPUs: 1 or more (preferably more than 1).                                                                             |
| Isolation and memory protection existfor each program executed.        | No isolation and memory protection. Resources are shared among threads of the same process.                                     |

------------------------------------------------------------------------------------------------------------------

# 11. Thread Scheduling

Threads are scheduled for execution based on their priority. Even though threads are executing within the runtime, all threads are assigned processor time slices by the operating system.

------------------------------------------------------------------------------------------------------------------

# 12. Difference between Thread Context Switching and Process Context Switching

| Thread Context Switching                                                                                  | Process Context Switching                                                                   |
| --------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| OS saves current state of thread & switches to another thread of the same process.                        | OS saves current state of the process & switches to another process by restoring its state. |
| Doesn't include switching of memory address space. (But Program counter, registers & stack are included.) | Includes switching of memory address space.                                                 |
| Fast switching.                                                                                           | Slow switching.                                                                             |
| CPU's cache state is preserved.                                                                           | CPU's cache state is flushed.                                                               |

------------------------------------------------------------------------------------------------------------------

# 13. Components of Operating System

   1. **Kernel** : A kernel is that part of the operating system which interacts directly with the hardware andperforms the most crucialtasks.
   
        a. Heart of OS/Core component \
        b. Very first part of OS to load on start-up.
        
   2. **User space** : Where application software runs, apps don’t have privileged access to the underlying hardware. It interacts with kernel.
   
        a. GUI \
        b. CLI
------------------------------------------------------------------------------------------------------------------

# 14. A shell, 
also known as a command interpreter, is that part of the operating system that receives commands from the users and gets them executed. 

------------------------------------------------------------------------------------------------------------------

# 15. Functions of Kernel:

   1. Process management:   \
      a. Scheduling processes and threads on the CPUs. \
      b. Creating & deleting both user and system process. \
      c. Suspending and resuming processes \
      d. Providing mechanisms for process synchronization or process communication. 
    
   2. Memory management: \
      a. Allocating and deallocating memory space as per need. \
      b. Keeping track of which part of memory are currently being used and by which process. 
      
   3. File management: \
      a. Creating and deleting files. \
      b. Creating and deleting directories to organize files. \
      c. Mapping files into secondary storage. \
      d. Backup support onto a stable storage media. 
      
   4. I/O management: to manage and control I/O operations and I/O devices \
      a. Buffering (data copy between two devices), caching and spooling. \
        i. Spooling \
          1. Within differing speed two jobs. \
          2. Eg. Print spooling and mail spooling. 
          
        ii. Buffering \
          1. Within one job. \
          2. Eg. Youtube video buffering 
          
        iii. Caching \
          1. Memory caching, Web caching etc. 

------------------------------------------------------------------------------------------------------------------

# 16. Types of Kernels:

   1. **Monolithic kernel** \
      a. All functions are in kernel itself i.e process management, memory management, file management, i/o management. \
      b. Bulky in size. \
      c. Memory required to run is high. \
      d. Less reliable, one module crashes -> whole kernel is down. \
      e. High performance as communication is fast. (Less user mode, kernel mode overheads) \
      f. Eg. Linux, Unix, MS-DOS.
      
   2. **Micro Kernel** \
      a. Only major functions are in kernel \
              i. Memory mgmt. \
              ii. Process mgmt.
        
      b. File mgmt. and IO mgmt. are in User-space.      
      c. smaller in size     
      d. More Reliable     
      e. More stable
      f. Performance is slow.
      g. Overhead switching b/w user mode and kernel mode.
      h. Eg. L4 Linux, Symbian OS, MINIX etc.   
     
   3. **Hybrid Kernel:** \
      a. Advantages of both worlds. (File mgmt. in User space and rest in Kernel space. ) <br>
      b. Combined approach.  \
      c. Speed and design of mono.  \
      d. Modularity and stability of micro.  \
      e. Eg. MacOS, Windows NT/7/10  \
      f. IPC also happens but lesser overheads 

------------------------------------------------------------------------------------------------------------------

# 17. How will communication happen between user mode and kernel mode?

   Inter process communication (IPC). \
      1. Two processes executing independently, having independent memory space (Memory protection), But some may need to communicate to work. \
      2. Done by shared memory and message passing.

------------------------------------------------------------------------------------------------------------------

# 18. How do apps interact with Kernel? 
   -> using system calls

   Eg. Mkdir laks \
      - Mkdir indirectly calls kernel and asked the file mgmt. module to create a new directory. \
      - Mkdir is just a wrapper of actual system calls. \
      - Mkdir interacts with kernel using system calls. 

   Eg. Creating a process. \
      - User executes a process. (User space) \
      - Gets system call. (US) \
      - Exec system call to create a process. (KS) \
      - Return to US.

   **Transitions from US to KS done by software interrupts.**   

   **System calls** are implemented in C.

   ------------------------------------------------------------------------------------------------------------------

# 19. What is System Call ?

&nbsp;&nbsp;&nbsp;   A system call is a mechanism using which a user program can request a service from the kernel for which it does not have the permission to perform. User programs typically do not have permission to perform operations like accessing I/O devices and communicating other programs

------------------------------------------------------------------------------------------------------------------

# 20. System Calls are the only way through which a process can go into kernel mode from user mode.

![](https://github.com/ItsRoy69/Learn/assets/78967360/44516d47-371d-48c1-aa22-e824dac10c5e)

------------------------------------------------------------------------------------------------------------------

# 21. Types of System Calls: 

   1) **Process Control** \
      a. end, abort \
      b. load, execute \
      c. create process, terminate process \
      d. get process attributes, set process attributes \
      e. wait for time \
      f. wait event, signal event \
      g. allocate and free memory

   2) **File Management**

      a. create file, delete file \
      b. open, close \
      c. read, write, reposition \
      d. get file attributes, set file attributes

   3) **Device Management**

      a. request device, release device \
      b. read, write, reposition \
      c. get device attributes, set device attributes \
      d. logically attach or detach devices

   4) **Information maintenance**

      a. get time or date, set time or date \
      b. get system data, set system data \
      c. get process, file, or device attributes \
      d. set process, file, or device attributes

   5) **Communication Management**

      a. create, delete communication connection \
      b. send, receive messages \
      c. transfer status information \
      d. attach or detach remote devices 

------------------------------------------------------------------------------------------------------------------

# 22. Examples of Windows & Unix System calls:

| Category               | Windows                        | Unix     |
| ---------------------- | ------------------------------ | -------- |
| Process Control        | CreateProcess()                | fork()   |
|                        | ExitProcess()                  | exit()   |
|                        | WaitForSingleObject()          | wait()   |
| **                     | **                             | **       |
| File Management        | CreateFile()                   | open()   |
|                        | ReadFile()                     | read()   |
|                        | WriteFile()                    | write()  |
|                        | CloseHandle()                  | close()  |
|                        | SetFileSecurity()              | chmod()  |
|                        | InitializeSecurityDescriptor() | umask()  |
|                        | SetSecurityDescriptorGroup()   | chown()  |
| **                     | **                             | **       |
| Device Management      | SetConsoleMode()               | ioctl()  |
|                        | ReadConsole()                  | read()   |
|                        | WriteConsole()                 | write()  |
| **                     | **                             | **       |
| Information Management | GetCurrentProcessID()          | getpid() |
|                        | SetTimer()                     | alarm()  |
|                        | Sleep()                        | sleep()  |
| **                     | **                             | **       |
| Communication          | CreatePipe()                   | pipe()   |
|                        | CreateFileMapping()            | shmget() |
|                        | MapViewOfFile()                | mmap()   |

------------------------------------------------------------------------------------------------------------------

# 23. Hands-on
   

   1. Open a terminal or command prompt.

   2. Create a new file called `my_script.sh` by running the following command:

      ```
      touch my_script.sh
      ```

   3. Use a text editor like Vim to edit the `my_script.sh` file:

      ```
      vim my_script.sh
      ```

      This will open the file in Vim.

   4. In Vim, press `i` to enter insert mode and add the following lines to your script:

      ```
      #!/bin/bash
      echo "Hello, world!"
      ```

      This is a basic script that prints "Hello, world!".

   5. Press `Esc` to exit insert mode.

   6. Save the file and exit Vim by typing `:wq` and pressing `Enter`. This command writes the file and quits Vim.

   7. Make the script executable by running the following command:

      ```
      chmod +x my_script.sh
      ```

      This command gives the script execute permission.

   8. Run the script by entering its name in the terminal:

      ```
      ./my_script.sh
      ```

      You should see the output "Hello, world!".

   9. To display the current working directory, use the `pwd` command:

      ```
      pwd
      ```

      It will print the current directory path.

   10. To list all running processes, use the `ps -a` command:

         ```
         ps -a
         ```

         This command displays a list of all processes, including those of other users.

   11. To list detailed information about all processes, use the `ps -al` command:

         ```
         ps -al
         ```

         This command provides more detailed information about the processes.

   12. To kill a process, you need to know its process ID (PID). Find the PID of the process you want to kill by using the `ps -a` command or other process listing commands.

   13. Once you have the PID, use the `kill` command followed by the PID to terminate the process. For example, to kill a process with PID 1234:

         ```
         kill 1234
         ```
         This command sends a termination signal to the specified process.

   That's it! You've created a simple shell script, used Vim to edit it, and learned how to navigate directories with `pwd`, list processes with `ps -a` and `ps -al`, and terminate processes with the `kill` command.

------------------------------------------------------------------------------------------------------------------

# 24. What happens when you turn on your computer?


   **i. PC On**

   **ii. CPU initializes itself and looks for a firmware program (BIOS) stored in BIOS Chip**
   - The BIOS chip is a ROM chip found on the motherboard that allows access and setup of the computer system at the most basic level.
   - In modern PCs, the CPU loads UEFI (Unified Extensible Firmware Interface).

   **iii. CPU runs the BIOS and performs the POST (Power-On Self-Test) process**
   - The BIOS tests and initializes system hardware.
   - The BIOS loads configuration settings and checks for any errors.
   - If an error is found, such as missing RAM, the boot process is stopped.
   - UEFI can perform additional functions beyond hardware initialization, acting as a tiny operating system with features like Intel Management Engine.

   **iv. BIOS hands off booting responsibility to the OS's bootloader**
   - The BIOS examines the Master Boot Record (MBR) at the beginning of the disk.
   - The MBR contains code that loads the operating system's bootloader.
   - The BIOS executes the bootloader program.

   **v. Bootloader starts booting the actual operating system**
   - The bootloader is a small program that boots the rest of the operating system.
   - Windows uses Windows Boot Manager (Bootmgr.exe), Linux systems use GRUB, and Macs use boot.efi.

   In summary, the PC powers on, the CPU initializes itself and looks for the BIOS or UEFI firmware. The CPU runs the BIOS, performs hardware tests, and loads configuration settings. The BIOS then hands off the booting process to the operating system's bootloader, which starts booting the actual operating system.

------------------------------------------------------------------------------------------------------------------


# 25. What is the memory capacity of a 32-bit operating system ?
   

<span>&nbsp;&nbsp;</span>A 32-bit operating system can access 2^32 unique memory addresses, which equals 4GB of physical memory.

# 26. What is the memory capacity of a 64-bit operating system ?

<span>&nbsp;&nbsp;</span>A 64-bit operating system can access 2^64 unique memory addresses, which equals 17,179,869,184 GB of physical memory.

# 27. How much data can a 32-bit CPU architecture process ?

<span>&nbsp;&nbsp;</span>A 32-bit CPU architecture can process 32 bits of data and information.

# 28. How much data can a 64-bit CPU architecture process ?

<span>&nbsp;&nbsp;</span>A 64-bit CPU architecture can process 64 bits of data and information.

# 29. What are the advantages of a 64-bit operating system over a 32-bit operating system?

- **Addressable Memory**: A 32-bit CPU can access 2^32 memory addresses, while a 64-bit CPU can access 2^64 memory addresses.

- **Resource Usage**: Upgrading a system with excess RAM to the 64-bit version of Windows can improve performance, whereas adding more RAM to a system with a 32-bit OS doesn't have a significant impact.

- **Performance**: Larger registers in a 64-bit CPU allow for larger calculations to be performed simultaneously, improving performance.

- **Compatibility**: A 64-bit CPU can run both 32-bit and 64-bit operating systems, while a 32-bit CPU can only run 32-bit operating systems.
 
- **Better Graphics Performance**: 64-bit architecture enables 8-byte graphics calculations, leading to faster execution of graphics-intensive applications.

------------------------------------------------------------------------------------------------------------------

# 30. 