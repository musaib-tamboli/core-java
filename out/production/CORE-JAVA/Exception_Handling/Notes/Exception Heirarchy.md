# 🔹 **Hierarchy of Exception in Java**

## 🔹 **Definition**
In Java, exceptions are organized in a hierarchical structure under the **`Throwable`** class. This hierarchy divides exceptions into two main categories:
1. **Checked Exceptions** (Must be handled at compile time)
2. **Unchecked Exceptions** (Occur at runtime)

---
<img alt="img.png" height="300" src="Images/img.png" width="250"/>
---

## 🔹 **Exception Hierarchy Diagram**
```
                java.lang.Throwable  
                   /         \
      Exception            Error  
         /    \              |
Checked  Unchecked       JVM Errors  
```

### **Hierarchical Breakdown:**
1. **`Throwable`** (Parent class of all exceptions and errors)
    - **`Exception`** → Represents recoverable exceptions (e.g., `IOException`)
        - **Checked Exceptions** (`IOException`, `SQLException`)
        - **Unchecked Exceptions (RuntimeException)** (`NullPointerException`, `ArithmeticException`)
    - **`Error`** → Represents serious problems that the program **cannot recover from** (e.g., `OutOfMemoryError`)

---

## 🔹 **Hierarchy Breakdown with Examples**
| **Class**                 | **Description**                                    | **Examples** |
|--------------------------|------------------------------------------------|------------|
| `Throwable`               | The root class for all exceptions and errors    | -          |
| ├── `Exception`           | Recoverable exceptions (checked & unchecked)    | -          |
| │   ├── `IOException`     | Issues in I/O operations                        | `FileNotFoundException`, `EOFException` |
| │   ├── `SQLException`    | Issues in database operations                   | `SQLTimeoutException` |
| │   ├── `RuntimeException` | Unchecked exceptions (programmer mistakes)      | `NullPointerException`, `IndexOutOfBoundsException` |
| ├── `Error`              | Irrecoverable errors caused by JVM issues       | `OutOfMemoryError`, `StackOverflowError` |

---

## 🔹 **Comparison: Checked vs Unchecked Exceptions**
| Feature               | Checked Exception (`Exception`) | Unchecked Exception (`RuntimeException`) |
|----------------------|--------------------------------|----------------------------------------|
| **Compile-time checking?** | ✅ Yes | ❌ No |
| **Requires handling?** | ✅ Yes (`try-catch` or `throws`) | ❌ No (but recommended) |
| **Examples**          | `IOException`, `SQLException` | `NullPointerException`, `ArithmeticException` |
| **Must be declared in method signature?** | ✅ Yes | ❌ No |

---

## 🔹 **Code Example: Exception Hierarchy in Action**
```java
import java.io.*;

public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent.txt"); // Checked Exception
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: File not found!");
        }

        try {
            int result = 10 / 0; // Unchecked Exception
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: Division by zero!");
        }
    }
}
```
**📝 Output:**
```
Checked Exception: File not found!
Unchecked Exception: Division by zero!
```

---

## 🔹 **Common Mistakes & Best Practices**
❌ **Mistake: Catching `Exception` instead of specific exceptions**
```java
catch (Exception e) { // ❌ Bad practice
    System.out.println("An error occurred.");
}
```
✅ **Best Practice: Catch only necessary exceptions**
```java
catch (IOException e) { // ✅ Good practice
    System.out.println("File error occurred.");
}
```

---

## 🔹 **Interview Questions & Answers**
🔹 **Q1:** What is the root class of all exceptions?  
✅ **A:** The root class is `Throwable`.

🔹 **Q2:** What is the key difference between checked and unchecked exceptions?  
✅ **A:** Checked exceptions **must be handled**, while unchecked exceptions **occur at runtime and don’t require handling**.

🔹 **Q3:** What is an example of an `Error` in Java?  
✅ **A:** `OutOfMemoryError`, `StackOverflowError`.

---

## 🔹 **Memory Trick / Mnemonic**
🔹 **"Exceptions can be caught, Errors cannot!"**
- **Exceptions → Recoverable issues** (File not found, invalid input)
- **Errors → JVM problems** (Memory full, stack overflow)

---

Let me know if you need further clarification! 🚀