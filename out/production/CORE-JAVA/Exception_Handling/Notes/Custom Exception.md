## **Custom Exception in Java**

### **Concept Name:** Custom Exception

### **Definition**
A **Custom Exception** (also called a **User-Defined Exception**) is a specific type of exception created by extending either the `Exception` or `RuntimeException` class to handle application-specific errors.

---

### **Syntax**

#### **1. Creating a Custom Checked Exception (Extends `Exception`)**
```java
// Custom Checked Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

#### **2. Creating a Custom Unchecked Exception (Extends `RuntimeException`)**
```java
// Custom Unchecked Exception
class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}
```

---

### **Working Mechanism**

1. Define a class that **extends `Exception` (Checked) or `RuntimeException` (Unchecked)**.
2. Use a **constructor** to accept error messages.
3. Throw the custom exception using the `throw` keyword.
4. Handle the exception using a **try-catch block** if necessary.

---

### **Key Features & Properties**
✔ Helps in handling **application-specific errors**.  
✔ Improves **code readability and debugging**.  
✔ Supports **custom messages and extra fields**.  
✔ Can be either **checked (compile-time) or unchecked (runtime)**.

---

### **Code Example**

#### **1. Checked Custom Exception**
```java
// Custom Exception for Age Validation
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomCheckedExceptionExample {
    // Method that throws a custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age for registration.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
```

#### **Output**
```
Exception Caught: Age must be 18 or above.
```

---

#### **2. Unchecked Custom Exception**
```java
// Custom Exception for Invalid Username
class InvalidUsernameException extends RuntimeException {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

public class CustomUncheckedExceptionExample {
    public static void checkUsername(String username) {
        if (username.length() < 5) {
            throw new InvalidUsernameException("Username must be at least 5 characters long.");
        }
        System.out.println("Valid username.");
    }

    public static void main(String[] args) {
        checkUsername("abc"); // This will throw an exception
    }
}
```

#### **Output**
```
Exception in thread "main" InvalidUsernameException: Username must be at least 5 characters long.
```

---

### **Use Cases & Applications**
- **Validation errors** (e.g., age validation, invalid input).
- **Business rule enforcement** (e.g., insufficient funds in banking applications).
- **Security-related errors** (e.g., unauthorized access).
- **Data integrity checks** (e.g., duplicate records).

---

### **Comparison Table: Checked vs Unchecked Custom Exception**

| Feature              | Checked Exception (`extends Exception`) | Unchecked Exception (`extends RuntimeException`) |
|----------------------|--------------------------------------|----------------------------------------|
| Requires `throws`   | Yes                                  | No                                     |
| Needs `try-catch`   | Yes                                  | No (but recommended)                   |
| Type of error       | Application-specific issues          | Programming logic errors               |
| Example            | `IOException`, `SQLException`        | `NullPointerException`, `ArrayIndexOutOfBoundsException` |

---

### **Common Mistakes & Best Practices**

| Mistake | Best Practice |
|---------|--------------|
| Throwing generic `Exception` | Use specific custom exceptions |
| Not providing a meaningful message | Always include a meaningful error message |
| Using checked exceptions unnecessarily | Use unchecked exceptions for logic errors |

---

### **Interview Questions & Answers**

1. **Why do we need custom exceptions?**  
   → To handle application-specific errors with meaningful messages.

2. **What is the difference between checked and unchecked custom exceptions?**  
   → Checked exceptions must be handled using `try-catch` or `throws`, whereas unchecked exceptions occur at runtime and don't require explicit handling.

3. **Can a custom exception extend both `Exception` and `RuntimeException`?**  
   → No, it must extend only one of them.

---

### **Memory Trick / Mnemonic**

**"CECE" → Custom Exception, Checked Exception**
- **C** → Checked exceptions → Extend `Exception`.
- **E** → Explicitly handled using `try-catch`.
- **C** → Custom messages for clarity.
- **E** → Enforce business logic.

---

This covers everything about **Custom Exceptions** in Java. Let me know if you need further clarification!