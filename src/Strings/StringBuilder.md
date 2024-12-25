### StringBuilder in Java

#### Definition:
Explain the concept in simple and easy-to-understand language:
- **StringBuilder** is a class used to create mutable (modifiable) string objects. Unlike the `String` class, which creates immutable objects, `StringBuilder` allows you to modify the content of the string without creating new objects. It is similar to `StringBuffer` but is not synchronized, making it faster and more efficient for single-threaded scenarios.

#### Syntax:
Give the syntax or structure of the feature, method, or concept in Java:

```java
StringBuilder sb = new StringBuilder(String str);
StringBuilder sb = new StringBuilder(int capacity);
StringBuilder sb = new StringBuilder(); // Default capacity is 16
```

#### Program Example:
Provide a code snippet demonstrating the usage of the feature, method, or concept, that I will easily copy & paste in a Java IDE:

```java
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb); // Output: Hello

        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        sb.insert(6, "Java ");
        System.out.println(sb); // Output: Hello Java World

        sb.replace(6, 10, "Beautiful");
        System.out.println(sb); // Output: Hello Beautiful World

        sb.delete(6, 15);
        System.out.println(sb); // Output: Hello World

        sb.reverse();
        System.out.println(sb); // Output: dlroW olleH
    }
}
```

#### Output:
Show the expected output when running the provided code example:

```
Hello
Hello World
Hello Java World
Hello Beautiful World
Hello World
dlroW olleH
```

#### Common Methods:
List the common methods available in `StringBuilder` with their descriptions in tabular format:

| Method       | Description                                             | Syntax                                         |
|--------------|---------------------------------------------------------|------------------------------------------------|
| `append`     | Adds the specified string to this sequence.             | `sb.append(String str)`                        |
| `insert`     | Inserts the specified string at the specified position. | `sb.insert(int offset, String str)`            |
| `replace`    | Replaces the specified substring with the given string. | `sb.replace(int start, int end, String str)`   |
| `delete`     | Removes the characters in the specified range.          | `sb.delete(int start, int end)`                |
| `reverse`    | Reverses the sequence of characters.                    | `sb.reverse()`                                 |
| `length`     | Returns the length of the sequence.                     | `int length = sb.length()`                     |
| `capacity`   | Returns the current capacity.                           | `int capacity = sb.capacity()`                 |
| `charAt`     | Returns the character at the specified index.           | `char ch = sb.charAt(int index)`               |
| `substring`  | Returns a new `String` that contains a subsequence of characters currently contained in this sequence. | `String sub = sb.substring(int start, int end)` |

#### Advantages & Disadvantages:
List the advantages and disadvantages of using `StringBuilder` in Java:

| Advantages                                    | Disadvantages                                       |
|-----------------------------------------------|-----------------------------------------------------|
| - Faster performance compared to `StringBuffer` in single-threaded contexts. | - Not thread-safe.                                  |
| - Less memory overhead compared to `StringBuffer`. | - Cannot be used safely in multi-threaded environments. |
| - Allows modification of strings without creating new objects. |                                                     |

### Comparison: StringBuilder vs String vs StringBuffer

| Feature            | String                               | StringBuffer                          | StringBuilder                        |
|--------------------|--------------------------------------|---------------------------------------|--------------------------------------|
| **Mutability**     | Immutable                            | Mutable                               | Mutable                               |
| **Thread Safety**  | Thread-safe (implicitly due to immutability) | Thread-safe (synchronized methods)    | Not thread-safe                      |
| **Performance**    | Slower for concatenation and modification operations | Slower than `StringBuilder` due to synchronization overhead | Faster than `StringBuffer` for single-threaded operations |
| **Usage**          | Use when strings do not need to be modified | Use when thread-safe, mutable strings are needed | Use when mutable strings are needed in single-threaded environments |
| **Memory Usage**   | More memory usage if strings are frequently modified | More memory usage due to synchronization overhead | Less memory usage compared to `StringBuffer` |

### Summary:
- **String**: Immutable, thread-safe by default, slower for modification, more memory usage for frequent changes.
- **StringBuffer**: Mutable, thread-safe (synchronized), slower performance due to synchronization, suitable for multi-threaded environments.
- **StringBuilder**: Mutable, not thread-safe, faster performance for single-threaded operations, less memory overhead compared to `StringBuffer`.

Understanding the differences between `String`, `StringBuffer`, and `StringBuilder` helps you choose the right one based on your application's requirements, especially in terms of performance and thread safety.