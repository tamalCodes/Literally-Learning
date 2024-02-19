# Backend Questions

### Mention the difference between MySQL and MongoDB?

<b> MySQL:</b> It is a Relational Database Management System (RDBMS), which makes use of SQL as a standard language to handle its database. Like different relational database management systems, MySQL makes use of a table-like structure to stow data.

<b> MongoDB:</b> MongoDB is a NoSQL database that utilizes the JSON-like structure to stow data elements. To modify and access data in MongoDB, the programmer ought to make use of the MongoDB Query Language (MQL).

---

### How V8 Engine Works

The V8 engine works as follows:

1. Parsing: Reads code and creates an Abstract Syntax Tree.
2. Interpreter: Processes AST and generates bytecode.
3. TurboFan: Optimizes code by inlining and eliminating unused parts.
4. Garbage Collection: Efficiently manages memory using generational approach.
5. JIT Compilation: Converts bytecode to machine code for faster execution.
6. Profiler: Identifies hotspots for better optimization decisions.
7. Concurrency: Executes JavaScript code concurrently with multiple threads.

Overall, V8 combines parsing, interpreting, optimizing, JIT compilation, and garbage collection to deliver high-performance JavaScript execution.

---

### Explain the steps how “Control Flow” controls the functions calls?

- Control the order of execution

- Collect data

- Limit concurrency

- Call the following step in the program.

---

### What are some commonly used timing features of Node.js?

- setTimeout/clearTimeout – This is used to implement delays in code execution.
- setInterval/clearInterval – This is used to run a code block multiple times.
- setImmediate/clearImmediate – Any function passed as the setImmediate() argument is a callback that's executed in the next iteration of the event loop.
- process.nextTick – Both setImmediate and process.nextTick appear to be doing the same thing; however, you may prefer one over the other depending on your callback’s urgency

---

### What is fork in node JS?

A fork in general is used to spawn child processes. In node it is used to create a new instance of v8 engine to run multiple workers to execute the code.

---

### What is REPL?

Read, Eval, Print, and Loop, which further means evaluating code on the go.

---

### List down the two arguments that async.queue takes as input?

- Task Function
- Concurrency Value

---

### What tools can be used to assure consistent code style?

ESLint

---

### Differentiate between process.nextTick() and setImmediate()?

Both can be used to switch to an asynchronous mode of operation by listener functions.

process.nextTick() sets the callback to execute but setImmediate pushes the callback in the queue to be executed. So the event loop runs in the following manner

**timers–>pending callbacks–>idle,prepare–>connections(poll,data,etc)–>check–>close callbacks**

In this process.nextTick() method adds the callback function to the start of the next event queue and setImmediate() method to place the function in the check phase of the next event queue

---

### How does Node.js overcome the problem of blocking of I/O operations?

Since the node has an event loop that can be used to handle all the I/O operations in an asynchronous manner without blocking the main function.

So for example, if some network call needs to happen it will be scheduled in the event loop instead of the main thread(single thread). And if there are multiple such I/O calls each one will be queued accordingly to be executed separately(other than the main thread).

Thus even though we have single-threaded JS, I/O ops are handled in a nonblocking way.

---

### What is node.js streams?

Streams are instances of EventEmitter which can be used to work with streaming data in Node.js. They can be used for handling and manipulating streaming large files(videos, mp3, etc) over the network. They use buffers as their temporary storage.

There are mainly four types of the stream:

- Writable: streams to which data can be written (for example, fs.createWriteStream()).
- Readable: streams from which data can be read (for example, fs.createReadStream()).
- Duplex: streams that are both Readable and Writable (for example, net.Socket).
- Transform: Duplex streams that can modify or transform the data as it is written and read (for example, zlib.createDeflate()).

---

### What are node.js buffers?

In general, buffers is a temporary memory that is mainly used by stream to hold on to some data until consumed. Buffers are introduced with additional use cases than JavaScript’s Unit8Array and are mainly used to represent a fixed-length sequence of bytes. This also supports legacy encodings like ASCII, utf-8, etc. It is a fixed(non-resizable) allocated memory outside the v8.

---

### What is an Event Emitter in Node.js?

EventEmitter is a Node.js class that includes all the objects that are basically capable of emitting events. This can be done by attaching named events that are emitted by the object using an eventEmitter.on() function. Thus whenever this object throws an even the attached functions are invoked synchronously.

---

### What is WASI and why is it being introduced?

Web assembly provides an implementation of WebAssembly System Interface specification through WASI API in node.js implemented using WASI class. The introduction of WASI was done by keeping in mind its possible to use the underlying operating system via a collection of POSIX-like functions thus further enabling the application to use resources more efficiently and features that require system-level access

---

###

---

###

---

###

---

###

---

###
