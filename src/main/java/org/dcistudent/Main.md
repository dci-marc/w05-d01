This Java program is a simple introduction to creating and using methods (functions) in Java, with the goal of printing different messages to the console. Let’s go through each part of the code to understand how it works.

### Package Declaration

```java
package org.dcistudent;
```

The `package` keyword is used to organize classes in Java. Here, `org.dcistudent` is the package name, meaning this file belongs to the `org.dcistudent` package, a sort of "folder" for organizing code. This makes it easier to manage large programs by grouping related files.

### Imports

```java
import lombok.NonNull;
```

This line imports a utility from a library called `lombok`. The `@NonNull` annotation helps ensure that certain variables or parameters are not null (empty). In this program, `@NonNull` is used in the `printReplace` method to check that a value is always provided.

### The `Main` Class

```java
public class Main {

}
```

In Java, every program needs a `class`, which is a blueprint that groups related methods and variables together. Here, we have a `Main` class that holds all the methods (instructions) for our program. The keyword `public` means this class is accessible to other classes if needed.

### The `main` Method

```java
public static void main(String[] args) {
    print();
    print("DCI");
    printReplace("DCI Student");
}
```

The `main` method is the entry point of any Java application. When you run a Java program, it always starts by executing the `main` method. Let’s break down the parts of this method:

- **`public`**: This makes `main` accessible from anywhere.
- **`static`**: This means `main` belongs to the `Main` class and can be called without creating an instance of the class.
- **`void`**: This indicates that `main` does not return any value.
- **`String[] args`**: This is an array of strings that allows you to pass arguments from the command line, but in this program, it’s not used.

Inside `main`, we call three other methods in sequence:

1. **`print()`**: This prints a default greeting.
2. **`print("DCI")`**: This prints a greeting that includes the word "DCI."
3. **`printReplace("DCI Student")`**: This prints a greeting with underscores replacing spaces in the phrase "DCI Student."

### The `print` Method (No Parameters)

```java
public static void print() {
    System.out.println("Hello World!");
}
```

The `print` method does not take any parameters, meaning it has no extra information provided when it is called. It simply prints `"Hello World!"` to the console. Here’s how each part works:

- **`System.out.println()`**: This is a built-in Java command that prints text to the console.
- **`"Hello World!"`**: The text that will appear in the console when this method is called.

### The `print` Method (With a Parameter)

```java
public static void print(String message) {
    System.out.println("Good morning " + message + "!");
}
```

This version of `print` has one parameter called `message`, which allows the caller to specify additional text. For example, calling `print("DCI")` will replace `message` with `"DCI"`. Here’s a breakdown:

- **`String message`**: This parameter allows a custom message to be printed.
- **`System.out.println("Good morning " + message + "!")`**: This concatenates (joins together) three parts: the text `"Good morning "`, the `message` provided, and an exclamation mark (`!`).

So, calling `print("DCI")` will output: `Good morning DCI!`.

### The `printReplace` Method

```java
public static void printReplace(@NonNull String message) {
    System.out.println("Good morning " + message.replaceAll(" ", "_") + "!");
}
```

This method also prints a greeting but has two key differences:

1. **`@NonNull String message`**: The `@NonNull` annotation is used here to ensure that the `message` parameter is not null. If it is null, the program will throw an error.
2. **`message.replaceAll(" ", "_")`**: This replaces all spaces in `message` with underscores (`_`). For example, if `message` is `"DCI Student"`, it will turn into `"DCI_Student"`.

### Summary of Console Output

When the program is run, the `main` method will call the three methods and produce this output in the console:

```
Hello World!
Good morning DCI!
Good morning DCI_Student!
```

Each line of output corresponds to one of the `print` or `printReplace` method calls.
