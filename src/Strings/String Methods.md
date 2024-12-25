### String Built-in Methods in Java

#### Definition:
Explain the concept in simple and easy-to-understand language:
- **String Built-in Methods**: The `String` class in Java provides a variety of built-in methods to perform different operations on strings. These methods allow you to manipulate, compare, search, and analyze string data effectively.

#### List of Built-in Methods:
Provide a table with some common built-in methods, their syntax, and description:
Sure! Here is a table listing various string functions in Java, along with examples and serial numbers.

| Serial No. | Function                   | Description                                                                 | Example                                                                 |
|------------|----------------------------|-----------------------------------------------------------------------------|-------------------------------------------------------------------------|
| 1          | `length()`                 | Returns the length of the string                                            | `"hello".length() // returns 5`                                         |
| 2          | `charAt(int index)`        | Returns the character at the specified index                                | `"hello".charAt(1) // returns 'e'`                                      |
| 3          | `concat(String str)`       | Concatenates the specified string to the end of the current string          | `"hello".concat(" world") // returns "hello world"`                     |
| 4          | `equals(Object obj)`       | Compares the string to the specified object                                 | `"hello".equals("hello") // returns true`                               |
| 5          | `equalsIgnoreCase(String str)` | Compares the string to another string, ignoring case differences         | `"hello".equalsIgnoreCase("HELLO") // returns true`                     |
| 6          | `compareTo(String str)`    | Compares two strings lexicographically                                      | `"hello".compareTo("world") // returns a negative number`               |
| 7          | `compareToIgnoreCase(String str)` | Compares two strings lexicographically, ignoring case differences        | `"hello".compareToIgnoreCase("HELLO") // returns 0`                     |
| 8          | `indexOf(int ch)`          | Returns the index of the first occurrence of the specified character        | `"hello".indexOf('e') // returns 1`                                     |
| 9          | `indexOf(String str)`      | Returns the index of the first occurrence of the specified substring        | `"hello world".indexOf("world") // returns 6`                           |
| 10         | `lastIndexOf(int ch)`      | Returns the index of the last occurrence of the specified character         | `"hello".lastIndexOf('l') // returns 3`                                 |
| 11         | `lastIndexOf(String str)`  | Returns the index of the last occurrence of the specified substring         | `"hello world".lastIndexOf("o") // returns 7`                           |
| 12         | `contains(CharSequence cs)`| Returns true if the string contains the specified sequence of char values   | `"hello world".contains("world") // returns true`                       |
| 13         | `substring(int beginIndex)`| Returns a substring starting from the specified index                       | `"hello".substring(2) // returns "llo"`                                 |
| 14         | `substring(int beginIndex, int endIndex)` | Returns a substring between the specified indices | `"hello".substring(1, 4) // returns "ell"`                               |
| 15         | `replace(char oldChar, char newChar)` | Replaces all occurrences of the specified old character with the new character | `"hello".replace('l', 'p') // returns "heppo"`                          |
| 16         | `replace(CharSequence target, CharSequence replacement)` | Replaces each substring of the string that matches the literal target sequence with the specified replacement sequence | `"hello world".replace("world", "Java") // returns "hello Java"`        |
| 17         | `replaceAll(String regex, String replacement)` | Replaces each substring that matches the given regular expression with the specified replacement | `"hello world".replaceAll("o", "a") // returns "hella warld"`            |
| 18         | `toUpperCase()`            | Converts all characters in the string to uppercase                          | `"hello".toUpperCase() // returns "HELLO"`                              |
| 19         | `toLowerCase()`            | Converts all characters in the string to lowercase                          | `"HELLO".toLowerCase() // returns "hello"`                              |
| 20         | `trim()`                   | Removes leading and trailing whitespace                                     | `"  hello  ".trim() // returns "hello"`                                 |
| 21         | `split(String regex)`      | Splits the string around matches of the given regular expression            | `"hello world".split(" ") // returns ["hello", "world"]`                |
| 22         | `join(CharSequence delimiter, CharSequence... elements)` | Joins the given elements with the specified delimiter                   | `String.join(", ", "a", "b", "c") // returns "a, b, c"`                 |
| 23         | `String.format(String format, Object... args)` | Returns a formatted string using the specified format string and arguments | `String.format("Name: %s, Age: %d", "John", 25) // returns "Name: John, Age: 25"` |
| 24         | `isEmpty()`                | Returns true if the string is empty                                         | `"".isEmpty() // returns true`                                          |
| 25         | `isBlank()`                | Returns true if the string is empty or contains only white space            | `"  ".isBlank() // returns true`                                        |
| 26         | `matches(String regex)`    | Tells whether or not the string matches the given regular expression        | `"hello123".matches("\\w+") // returns true`                            |
| 27         | `getBytes()`               | Encodes the string into a sequence of bytes using the platform's default charset | `"hello".getBytes() // returns byte array of "hello"`                   |
| 28         | `toCharArray()`            | Converts the string to a new character array                                | `"hello".toCharArray() // returns ['h', 'e', 'l', 'l', 'o']`            |
| 29         | `intern()`                 | Returns a canonical representation for the string object                    | `String str = new String("hello").intern() // returns "hello"`          |

This table provides an overview of common string methods in Java, along with examples to illustrate their usage.
#### Program Example:
Provide a code snippet demonstrating the usage of some built-in methods, that I will easily copy & paste in Java IDE:
Here is a Java program that demonstrates the usage of various string methods listed in the table:

```java
public class StringMethodsDemo {
    public static void main(String[] args) {
        // 1. length()
        String str1 = "hello";
        System.out.println("Length: " + str1.length()); // 5

        // 2. charAt(int index)
        System.out.println("Character at index 1: " + str1.charAt(1)); // e

        // 3. concat(String str)
        String str2 = " world";
        System.out.println("Concatenation: " + str1.concat(str2)); // hello world

        // 4. equals(Object obj)
        System.out.println("Equals: " + str1.equals("hello")); // true

        // 5. equalsIgnoreCase(String str)
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("HELLO")); // true

        // 6. compareTo(String str)
        System.out.println("Compare To: " + str1.compareTo("world")); // Negative value

        // 7. compareToIgnoreCase(String str)
        System.out.println("Compare To Ignore Case: " + str1.compareToIgnoreCase("HELLO")); // 0

        // 8. indexOf(int ch)
        System.out.println("Index of 'e': " + str1.indexOf('e')); // 1

        // 9. indexOf(String str)
        System.out.println("Index of 'world': " + "hello world".indexOf("world")); // 6

        // 10. lastIndexOf(int ch)
        System.out.println("Last Index of 'l': " + str1.lastIndexOf('l')); // 3

        // 11. lastIndexOf(String str)
        System.out.println("Last Index of 'o': " + "hello world".lastIndexOf("o")); // 7

        // 12. contains(CharSequence cs)
        System.out.println("Contains 'world': " + "hello world".contains("world")); // true

        // 13. substring(int beginIndex)
        System.out.println("Substring from index 2: " + str1.substring(2)); // llo

        // 14. substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 1 to 4: " + str1.substring(1, 4)); // ell

        // 15. replace(char oldChar, char newChar)
        System.out.println("Replace 'l' with 'p': " + str1.replace('l', 'p')); // heppo

        // 16. replace(CharSequence target, CharSequence replacement)
        System.out.println("Replace 'world' with 'Java': " + "hello world".replace("world", "Java")); // hello Java

        // 17. replaceAll(String regex, String replacement)
        System.out.println("Replace all 'o' with 'a': " + "hello world".replaceAll("o", "a")); // hella warld

        // 18. toUpperCase()
        System.out.println("Uppercase: " + str1.toUpperCase()); // HELLO

        // 19. toLowerCase()
        String str3 = "HELLO";
        System.out.println("Lowercase: " + str3.toLowerCase()); // hello

        // 20. trim()
        String str4 = "  hello  ";
        System.out.println("Trimmed: " + str4.trim()); // hello

        // 21. split(String regex)
        String[] splitStr = "hello world".split(" ");
        System.out.println("Split: " + java.util.Arrays.toString(splitStr)); // [hello, world]

        // 22. join(CharSequence delimiter, CharSequence... elements)
        System.out.println("Join: " + String.join(", ", "a", "b", "c")); // a, b, c

        // 23. String.format(String format, Object... args)
        System.out.println("Formatted String: " + String.format("Name: %s, Age: %d", "John", 25)); // Name: John, Age: 25

        // 24. isEmpty()
        String str5 = "";
        System.out.println("Is Empty: " + str5.isEmpty()); // true

        // 25. isBlank()
        String str6 = "  ";
        System.out.println("Is Blank: " + str6.isBlank()); // true

        // 26. matches(String regex)
        System.out.println("Matches \\w+: " + "hello123".matches("\\w+")); // true

        // 27. getBytes()
        byte[] byteArray = str1.getBytes();
        System.out.println("Get Bytes: " + java.util.Arrays.toString(byteArray)); // [104, 101, 108, 108, 111]

        // 28. toCharArray()
        char[] charArray = str1.toCharArray();
        System.out.println("To Char Array: " + java.util.Arrays.toString(charArray)); // [h, e, l, l, o]

        // 29. intern()
        String str7 = new String("hello").intern();
        System.out.println("Interned: " + str7); // hello
    }
}
```

This program covers each string method mentioned in the table, showing how to use them with examples. You can run this program to see the output of each string function.
#### Advantages & Disadvantages:
List the advantages and disadvantages of using the built-in string methods in Java:

| Advantages                       | Disadvantages                        |
|----------------------------------|--------------------------------------|
| a. **Convenience**: Provides easy-to-use methods for common string operations. | a. **Immutability**: Methods create new strings instead of modifying existing ones, which can impact performance. |
| b. **Readability**: Enhances code readability by using descriptive method names. | b. **Overhead**: Creating multiple string objects can lead to increased memory usage. |
| c. **Consistency**: Ensures consistent behavior and performance across different Java applications. | |
| d. **Efficiency**: Built-in methods are optimized for performance by the Java development team. | |

### Summary:
- **String Built-in Methods**: Core Java provides a variety of methods to manipulate, compare, search, and analyze strings.
- **Types**: Methods include `length()`, `charAt()`, `substring()`, `equals()`, `toUpperCase()`, `toLowerCase()`, `trim()`, `replace()`, `split()`, `contains()`, `startsWith()`, and `endsWith()`.
- **List**: Provides a table of common string methods with their syntax and descriptions.
- **Example**: Demonstrates the usage of various string methods such as `length`, `charAt`, `substring`, `equals`, `toUpperCase`, `trim`, `replace`, `split`, `contains`, `startsWith`, and `endsWith`.
- **Advantages**: Convenience, readability, consistency, and efficiency.
- **Disadvantages**: Immutability, potential overhead from creating new string objects.