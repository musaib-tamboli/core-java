## **`throw` and `throws` Keywords in Java**

### **1. `throw` Keyword**
The `throw` keyword in Java is used to explicitly throw an exception from a method or block of code.

### **Definition**
- The `throw` keyword is used inside a method to throw an exception manually.
- It can throw both checked and unchecked exceptions.
- Only a single exception can be thrown at a time.
- It must be used within a method or block.

### **Syntax**
```java
throw new ExceptionType("Error message");
```

### **Working Mechanism**
1. The `throw` statement is used to explicitly throw an exception.
2. The method execution is stopped immediately after `throw`.
3. If the exception is **unchecked**, it propagates up the call stack until handled.
4. If the exception is **checked**, it must be either handled using `try-catch` or declared using `throws`.

### **Example**
```java
public class ThrowExample {
    static void validate(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        } else {
            System.out.println("Valid age.");
        }
    }

    public static void main(String[] args) {
        validate(16); // This will throw an exception
        System.out.println("End of program"); // This line will not execute
    }
}
```

### **Output**
```
Exception in thread "main" java.lang.IllegalArgumentException: Age must be 18 or above
```

---

### **2. `throws` Keyword**
The `throws` keyword in Java is used to declare exceptions in a method signature, indicating that the method may throw an exception.

### **Definition**
- The `throws` keyword is used in a method signature to declare exceptions.
- It is used when a method does not handle an exception but instead passes it to the caller.
- It is mainly used for **checked exceptions** (like `IOException`, `SQLException`).
- Multiple exceptions can be declared separated by commas.

### **Syntax**
```java
returnType methodName() throws ExceptionType1, ExceptionType2 {
    // Method code
}
```

### **Working Mechanism**
1. The method that may throw a **checked exception** must declare it using `throws`.
2. If an exception occurs inside the method, the caller must handle it using `try-catch`.
3. If the exception is not handled, it propagates up the call stack.

### **Example**
```java
import java.io.*;

public class ThrowsExample {
    static void readFile() throws IOException {
        FileReader file = new FileReader("non_existent_file.txt");
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
    }

    public static void main(String[] args) {
        try {
            readFile(); // Calling a method that throws an exception
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```

### **Output**
```
File not found: non_existent_file.txt (No such file or directory)
```

---

## **Comparison Table: `throw` vs `throws`**

| Feature      | `throw` | `throws` |
|-------------|--------|----------|
| Purpose | Used to **explicitly throw** an exception | Used to **declare** exceptions in a method signature |
| Location | Inside a method or block | In method declaration |
| Exception Type | Can throw a single exception at a time | Can declare multiple exceptions |
| Used For | Both **checked** and **unchecked** exceptions | Mainly **checked** exceptions |
| Handling | Requires `try-catch` or propagation | Caller must handle the exception |

---

## **Common Mistakes & Best Practices**
### **Mistakes**
❌ Throwing a checked exception without handling it:
```java
throw new IOException("Error"); // Needs to be handled or declared
```
❌ Using `throw` instead of `throws` in method signature:
```java
void myMethod() throw IOException { } // Incorrect
```
❌ Declaring an exception with `throws` but not handling it:
```java
void myMethod() throws IOException { 
    FileReader file = new FileReader("file.txt"); // Needs try-catch
}
```

### **Best Practices**
✅ Use `throw` for **runtime exceptions** inside methods.  
✅ Use `throws` for **checked exceptions** in method declarations.  
✅ Always handle exceptions properly to prevent program crashes.  
✅ Avoid declaring unnecessary exceptions in `throws`.

---

## **Interview Questions & Answers**
### **1. What is the difference between `throw` and `throws`?**
**Answer:**
- `throw` is used to explicitly throw an exception inside a method.
- `throws` is used in a method declaration to specify that the method may throw an exception.

### **2. Can we throw multiple exceptions using `throw`?**
**Answer:**  
No, we can throw only one exception at a time using `throw`.  
For multiple exceptions, we need separate `throw` statements.

### **3. Can we use `throws` for unchecked exceptions?**
**Answer:**  
Yes, we can declare unchecked exceptions using `throws`, but it is not mandatory because they do not need to be handled explicitly.

### **4. What happens if a method declares `throws` but does not throw an exception?**
**Answer:**  
The code will compile and run normally. Declaring `throws` does not force an exception to occur.

---

## **Memory Trick**
- **"throw goes inside the method"** (Like throwing an exception)
- **"throws is in the method signature"** (Like a warning sign)

---

Let me know if you need more examples or explanations.