## **Lambda Expressions in Java**

Lambda expressions are a feature introduced in **Java 8** that allow us to define **anonymous functions (methods without a name and a class)** in a concise way. They are mainly used to provide implementations for **functional interfaces**.

---

## **🔹 Rules for Using Lambda Expressions**
1. **Lambda expressions require a functional interface**
    - The interface must have **only one abstract method (SAM - Single Abstract Method)**.
    - Example: `Runnable`, `Callable`, `Comparator<T>`, `Consumer<T>`, etc.

2. **Parentheses in Parameter List:**
    - If there is **only one parameter**, parentheses **can be Excluded**.
    - If there are **multiple parameters or no parameters**, parentheses **must be included**.

3. **Curly Braces `{}` in the Body:**
    - If the body **has a single statement**, `{}` can be Excluded.
    - If the body **has multiple statements**, `{}` must be used.

4. **Return Keyword Usage:**
    - If a lambda body **has only one return statement**, `return` can be Excluded.
    - If there are multiple statements, `return` must be explicitly used.

5. **No Need for Data Types in Parameters:**
    - Java **infers** the data types from the functional interface.

---

## **🔹 Syntax for Lambda Expressions**
### **1️⃣ Lambda Expression with No Parameters**
```java
() -> System.out.println("Hello from Lambda!");
```
🔹 **Example with Runnable Interface**
```java
public class LambdaNoParam {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Thread is running...");
        new Thread(r).start();
    }
}
```
✅ Since `Runnable` has a **single abstract method (`run()`)**, we can use a lambda.

---

### **2️⃣ Lambda Expression with a Single Parameter**
```java
parameter -> expression;
(parameter) -> expression;
```
🔹 **Example with `Consumer<T>` Functional Interface**
```java
import java.util.function.Consumer;

public class LambdaSingleParam {
    public static void main(String[] args) {
        Consumer<String> display = message -> System.out.println("Message: " + message);
        display.accept("Lambda with one parameter");
    }
}
```
✅ **Since `message` is the only parameter, parentheses are optional.**

---

### **3️⃣ Lambda Expression with Multiple Parameters**
```java
(param1, param2) -> expression;
(param1, param2) -> { statements; return result; }
```
🔹 **Example with `BiFunction<T, U, R>` Functional Interface**
```java
import java.util.function.BiFunction;

public class LambdaMultipleParams {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Addition: " + add.apply(10, 20));
    }
}
```
✅ Since there are **multiple parameters**, parentheses are **mandatory**.

---

### **4️⃣ Lambda Expression with a Block (Multiple Statements)**
```java
(param1, param2) -> {
    statement1;
    statement2;
    return result;
}
```
🔹 **Example with Multiple Statements**
```java
import java.util.function.BiFunction;

public class LambdaMultiStatements {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> {
            int result = a * b;
            System.out.println("Multiplication Result: " + result);
            return result;
        };
        multiply.apply(5, 3);
    }
}
```
✅ **Curly braces `{}` are required because there are multiple statements.**

---

## **🔹 Which Syntax Should You Use?**
| **Scenario** | **Best Syntax** | **Why?** |
|-------------|-----------------|----------|
| **No Parameters** | `() -> expression` | Clean and concise |
| **Single Parameter** | `param -> expression` | Shorter syntax, avoids extra parentheses |
| **Multiple Parameters** | `(param1, param2) -> expression` | Ensures clarity |
| **Multiple Statements** | `(param1, param2) -> { statements; return result; }` | Readable and maintainable |

✅ **Choose the simplest syntax** that makes your code easy to read and understand.

---

## **🔹 Conclusion**
- Lambda expressions **must be assigned to a functional interface**.
- Syntax varies depending on the **number of parameters** and **statements**.
- **Shorter syntax** is preferred for **concise code**, but **use `{}` when necessary** for clarity.

Would you like more examples on **real-world use cases** of lambda expressions? 🚀