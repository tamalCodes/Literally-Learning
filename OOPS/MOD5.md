<!-- TOC -->

- [What is String Class in Java ?](#what-is-string-class-in-java-)
  - [Disadvantages of String Class](#disadvantages-of-string-class)
  - [Concept of immutable string](#concept-of-immutable-string)
  - [String methods](#string-methods)
- [StringBuffer Class](#stringbuffer-class)
  - [Concept of mutable string](#concept-of-mutable-string)
  - [StringBuffer methods](#stringbuffer-methods)
- [StringBuilder Class](#stringbuilder-class)
  - [Difference between StringBuffer and StringBuilder](#difference-between-stringbuffer-and-stringbuilder)

<!-- /TOC -->

# What is String Class in Java ? 

In Java, the String class is a built-in class that represents a sequence of characters. It is used to store and manipulate strings of text.

The String class is part of the `java.lang` package, which is automatically imported into all Java programs, so you don't need to import it explicitly. This means you can use String objects directly in your code.

## Disadvantages of String Class

- String objects are immutable, which means that they cannot be changed after they are created. This means that if you want to change a string, you must create a new string object.
  
- Memory is wasted because String objects are immutable. For example, if you want to change the value of a string, you must create a new string object. This means that the old string object is no longer used and is therefore wasted memory.


## Concept of immutable string

**Let's understand how it works under the hood.**

When you create a string object, the string is stored in the memory. The string object contains a reference to the string in the memory. This means that the string object does not contain the string itself, but only a reference to the string in the memory.

**What happens when we want to change the value of a string?**

Let's say we have a string `s1` called `Tamal` which is located at `100`.

So if we now say that `s1 = s1 + "Das"` then the string `Tamal` will be copied to a new location in the memory and the new string will be `TamalDas` which will be located at `200`.

**So what happened to the old value ?**

The old value is still there at `100` and is not used anymore. This means that the old value is wasted memory.


## String methods

The String class has many useful methods that can be used to manipulate strings. Here are some of the most commonly used methods:

- `charAt()` - Returns the character at the specified index (position)
  
- `length()` - Returns the length of a string
  
- `substring()` - Extracts the characters from a string, beginning at a specified start position, and through the specified number of character

- `toLowerCase()` - Converts a string to lower case letters

- `toUpperCase()` - Converts a string to upper case letters

- `trim()` - Removes whitespace from both ends of a string

- `replace()` - Searches a string for a specified value, and returns a new string where the specified values are replaced

- `concat()` - Concatenates a specified string to the end of another string

- `equals()` - Compares two strings. Returns true if the strings are equal, and false if not

- `equalsIgnoreCase()` - Compares two strings, ignoring case considerations

- `compareTo()` - Compares two strings. Returns 0 if the strings are equal, less than 0 if the first string is less than the second string, and greater than 0 if the first string is greater than the second string

- `compareToIgnoreCase()` - Compares two strings, ignoring case considerations. Returns 0 if the strings are equal, less than 0 if the first string is less than the second string, and greater than 0 if the first string is greater than the second string

- `startsWith()` - Checks whether a string starts with specified characters

- `endsWith()` - Checks whether a string ends with specified characters

- `contains()` - Checks whether a string contains a specified sequence of characters

- `indexOf()` - Returns the position of the first found occurrence of specified characters in a string

- `lastIndexOf()` - Returns the position of the last found occurrence of specified characters in a string

- `split()` - Splits a string into an array of substrings

- `valueOf()` - Returns the string representation of a specified type


# StringBuffer Class

The StringBuffer class is used to create mutable (modifiable) strings. The StringBuffer class is part of the `java.lang` package, which is automatically imported into all Java programs, so you don't need to import it explicitly. This means you can use StringBuffer objects directly in your code.

```java
StringBuffer sb = new StringBuffer();
```

String buffer gives you a buffer which will be of 16 characters. If you want to increase the size of the buffer, you can use the `ensureCapacity()` method.

```java
sb.ensureCapacity(32);
```

## Concept of mutable string

```java

StringBuffer sb = new StringBuffer("Tamal");
sb.append("Das");
System.out.println(sb);

```

**So let's understand how it works under the hood**

When you create a string buffer object, the string is stored in the memory. The string buffer object contains a reference to the string in the memory. This means that the string buffer object does not contain the string itself, but only a reference to the string in the memory.

**What happens when we want to change the value of a string?**

Let's say we have a string buffer `sb` called `Tamal` which is located at `100`.

So if we now say that `sb.append("Das")` then the string `Tamal` will be changed to `TamalDas` which will be located at `100`.

**How is it better than String ?**

In String class,  old value is still there at `100` and is not used anymore. This means that the old value is wasted memory. 

But in the case of string buffer, the old value is still there at `100` and is used. This means that the old value is not wasted memory.

## StringBuffer methods

The StringBuffer class has many useful methods that can be used to manipulate strings. Here are some of the most commonly used methods:

- `append()` - Appends the specified string to the end of this buffer

```java
StringBuffer sb = new StringBuffer("Tamal");
sb.append("Das");
System.out.println(sb);
```

- `insert()` - Inserts the specified string into this buffer at the specified position

```java
StringBuffer sb = new StringBuffer("Tamal");
sb.insert(5, "Das");
System.out.println(sb); // TamalDas
```

- `replace()` - Replaces the characters in a substring of this buffer with characters in the specified String

```java
StringBuffer sb = new StringBuffer("Tamal");
sb.replace(0, 5, "Das");
System.out.println(sb); // Das
```


- `delete()` - Removes the characters in a substring of this buffer

```java
StringBuffer sb = new StringBuffer("Tamal");
sb.delete(0, 5);
System.out.println(sb); // ""
```


- `reverse()` - Causes this character sequence to be replaced by the reverse of the sequence

```java
StringBuffer sb = new StringBuffer("Tamal");
sb.reverse();
System.out.println(sb); // lamaT
```

# StringBuilder Class

The StringBuilder class is used to create mutable (modifiable) strings. The StringBuilder class is part of the `java.lang` package, which is automatically imported into all Java programs, so you don't need to import it explicitly. This means you can use StringBuilder objects directly in your code.

## Difference between StringBuffer and StringBuilder

StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously. StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.

**The methods are really not that different.**

```java