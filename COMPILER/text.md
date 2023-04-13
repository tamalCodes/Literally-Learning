# What is a compiler ? 

A compiler is a software tool that translates computer code written in one programming language (the source language) into another language (the target language). The process of compiling typically involves several stages, including lexical analysis, syntax analysis, semantic analysis, code optimization, and code generation.

The resulting output of the compiler is usually a binary executable file or object code that can be executed directly by the computer's processor.

## High and low level languages

- High-level languages are **easy for humans to read and write** but **difficult for computers to understand**.
- Low-level languages are **difficult for humans to read and write** but **easy for computers to understand**.

## What is a compiler written in ?

A compiler is written in a programming language. The compiler is then compiled into a binary executable file. This binary executable file is then used to compile other programs written in the same programming language. 

## Language processing systems (using a compiler)


  ![](https://i.ibb.co/VBP2zY8/2023-04-05-12-11.png)


# Phases of a compiler

![](https://i.ibb.co/80sqjHM/phases.png)

![](https://i.ibb.co/TMSr1JB/2023-04-05-12-19.png)

### Lexical analyzer

The lexical analyzer (also known as the scanner or tokenizer) breaks the input stream into a sequence of tokens.  For example if i give `int x=y+10` as input, the lexical analyzer will break it into `x`, `=`, `y`, `+`, `10`.

Here `int` is a keyword,  `x` is an identifier, `=` is an assignment operator, `y` is an identifier, `+` is an arithmetic operator, `10` is a constant.

The `tokens` are also called `lexemes`.

### Syntax analyzer

The syntax analyzer (also known as the parser) takes the sequence of tokens produced by the lexical analyzer and checks whether the tokens are in the correct order and form. 

For example, if the input is `int x=y+10`, the syntax analyzer will check whether the tokens are in the correct order and form. 

If the tokens are in the correct order and form, the syntax analyzer will produce a parse tree. If the tokens are not in the correct order and form, the syntax analyzer will produce an error message.

**Parse tree** is a tree-like representation of the syntactic structure of a sentence in a formal language.

I'll get the output as `int x=y+10` in `id1/ = / id2 / + / 10` format. Here `id1` is an identifier, `/` is a delimiter, `=` is an assignment operator, `id2` is an identifier, `+` is an arithmetic operator, `10` is a constant.

### Semantic analyzer

The semantic analyzer (also known as the semantic checker) takes the parse tree produced by the syntax analyzer and checks whether the tokens are semantically correct.


