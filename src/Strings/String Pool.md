### String Pool in Java

#### Definition:
Explain the concept in simple and easy-to-understand language:
- **String Pool**: The String Pool, also known as the interned string pool, is a special memory area in Java's heap memory. It is used to store string literals. When a new string literal is created, the Java Virtual Machine (JVM) checks the string pool first. If the string already exists in the pool, the JVM returns a reference to the existing string. If not, it adds the new string to the pool. This mechanism helps save memory by reusing immutable string objects.

#### Types:
Explain the types related to the string pool:
- **String Literals**: Strings defined with double quotes, like `"Hello"`. These are automatically interned.
- **Interned Strings**: Strings explicitly added to the pool using the `intern()` method.

#### Syntax:
Give the syntax or structure of the feature, method, or concept in Java:

```java
String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");
String str4 = str3.intern();
```

#### Program Example:
Provide a code snippet demonstrating the usage of the feature, method, or concept, that I will easily copy & paste in Java IDE:

```java
public class StringPoolExample {
    public static void main(String[] args) {
        // String literals
        String str1 = "Hello";
        String str2 = "Hello";
        
        // Checking if both references point to the same object
        System.out.println("str1 == str2: " + (str1 == str2)); // true

        // Creating a new string object
        String str3 = new String("Hello");
        
        // Checking if str3 is the same as str1
        System.out.println("str1 == str3: " + (str1 == str3)); // false

        // Using intern() method
        String str4 = str3.intern();
        
        // Checking if str1 is the same as str4
        System.out.println("str1 == str4: " + (str1 == str4)); // true
    }
}
```

#### Output:
Show the expected output when running the provided code example:

```
str1 == str2: true
str1 == str3: false
str1 == str4: true
```

#### Advantages & Disadvantages:
List the advantages and disadvantages of using the string pool in Java:

| Advantages                              | Disadvantages                                  |
|-----------------------------------------|------------------------------------------------|
| a. **Memory Efficiency**: Reduces memory usage by reusing string objects. | a. **Limited to String Literals**: Only applies to string literals and interned strings. |
| b. **Performance Improvement**: Faster string comparisons using reference equality. | b. **Memory Overhead**: Storing many strings can increase the size of the string pool. |
| c. **Consistency**: Ensures that identical strings are stored only once. | c. **Interning Overhead**: Interning strings manually can add a slight performance overhead. |

### Summary:
- **String Pool**: A special memory area in Java's heap memory for storing string literals to save memory by reusing immutable string objects.
- **Types**: Includes string literals and interned strings.
- **Syntax**: Demonstrates string creation and interning.
- **Example**: Provides a code snippet showing string pooling and the `intern()` method.
- **Advantages**: Memory efficiency, performance improvement, and consistency.
- **Disadvantages**: Limited to string literals, potential memory overhead, and interning overhead.