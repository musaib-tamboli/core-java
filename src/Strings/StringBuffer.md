### StringBuffer in Java

#### Definition:
Explain the concept in simple and easy-to-understand language:
- **StringBuffer** is a class used to create mutable (modifiable) string objects. Unlike the `String` class, which creates immutable objects, `StringBuffer` allows you to modify the content of the string without creating new objects.

#### Types:
There are no specific types of `StringBuffer`, but it is important to know its methods and properties.

#### Syntax:
Give the syntax or structure of the feature, method, or concept in Java:

```java
StringBuffer sb = new StringBuffer(String str);
StringBuffer sb = new StringBuffer(int capacity);
StringBuffer sb = new StringBuffer(); // Default capacity is 16
```

#### Program Example:
Provide a code snippet demonstrating the usage of the feature, method, or concept, that I will easily copy & paste in a Java IDE:

```java
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
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
List the common methods available in `StringBuffer` with their descriptions in tabular format:

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
List the advantages and disadvantages of using `StringBuffer` in Java:

| Advantages                                    | Disadvantages                                       |
|-----------------------------------------------|-----------------------------------------------------|
| - Thread-safe and synchronized.               | - Slower performance due to synchronization overhead.|
| - Suitable for multi-threaded environments.   | - More memory usage compared to `StringBuilder`.     |
| - Allows modification of strings without creating new objects. |                                                     |

### Summary:
- **StringBuffer**: A class used to create mutable string objects.
- **Key Features**: Provides methods to append, insert, replace, delete, and reverse strings.
- **Usage**: Suitable for multi-threaded environments due to thread safety and synchronization.
- **Example**: Demonstrates typical usage of `StringBuffer` methods.
- **Advantages**: Thread-safe, suitable for concurrent modifications.
- **Disadvantages**: Slower performance compared to `StringBuilder` due to synchronization overhead.