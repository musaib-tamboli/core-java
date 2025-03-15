### **Singleton Class in Java**  

#### **Definition**  
A Singleton class is a class that allows only one instance (object) to be created during the entire runtime of a Java application. It ensures that a global point of access to the object is maintained.  

#### **Syntax**  
A Singleton class typically follows these steps:  
- A **private constructor** to restrict object creation from outside.  
- A **static instance variable** to store the single instance.  
- A **static method** to provide access to the instance.  

```java
class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton instance;

    // Step 2: Private constructor to prevent instantiation
    private Singleton() {}

    // Step 3: Public static method to provide global access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create instance if not already created
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton Class!");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        // Get the only instance of Singleton class
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        // Try to create another instance
        Singleton obj2 = Singleton.getInstance();

        // Checking if both references point to the same instance
        System.out.println(obj1 == obj2); // Output: true
    }
}
```

#### **Working Mechanism**  
1. The **constructor is private**, preventing object creation from outside.  
2. The **getInstance() method** checks if an instance already exists:  
   - If not, it creates one.  
   - If yes, it returns the existing instance.  
3. This ensures only one instance is created and used throughout the program.  

#### **Key Features & Properties**  
- Only **one instance** is created.  
- The **instance is globally accessible**.  
- The constructor is **private** to restrict direct instantiation.  
- The method `getInstance()` is used to control object creation.  

#### **Code Example Output**  
```
Hello from Singleton Class!
true
```

#### **Use Cases & Applications**  
- **Database connections** (ensures only one connection instance).  
- **Logging systems** (one logger instance for the whole application).  
- **Thread pools** (manage resources efficiently).  
- **Cache management** (avoid redundant data loading).  
- **Configuration settings** (single source of truth).  

#### **Comparison Table: Eager vs Lazy Initialization**  

| Type                | Implementation | Performance | When to Use? |
|--------------------|---------------|------------|--------------|
| **Eager Initialization** | Instance created at class loading | Fast but may waste memory | When object is always required |
| **Lazy Initialization** | Instance created on first access | Saves memory but may be slower | When object creation is conditional |

#### **Common Mistakes & Best Practices**  
| Mistake | Best Practice |
|---------|--------------|
| Making the constructor `public` | Always use a `private` constructor |
| Not handling multithreading | Use `synchronized` or **Double-Checked Locking** |
| Creating a new instance in `getInstance()` every time | Check if instance exists before creating |

#### **Interview Questions & Answers**  
1. **What is a Singleton class in Java?**  
   - A class that allows only **one instance** and provides **global access** to it.  

2. **How do you implement a Singleton class in Java?**  
   - Use a **private constructor**, a **static instance variable**, and a **public static method** (`getInstance()`).  

3. **What is lazy vs eager initialization in Singleton?**  
   - **Lazy:** Instance is created only when requested (better for memory).  
   - **Eager:** Instance is created at class loading (faster but may waste memory).  

4. **How to make a Singleton class thread-safe?**  
   - Use **synchronized keyword** in `getInstance()` or **Double-Checked Locking**.  

5. **Why should Singleton be used with caution?**  
   - It can lead to **hidden dependencies** and **global state issues**, making testing harder.  

#### **Memory Trick / Mnemonic**  
**SINGLE** → **S**ingle instance, **I**nitialized lazily, **N**ot multiple objects, **G**lobal access, **L**ocking for thread safety, **E**ager vs Lazy initialization.  

Let me know if you need more details! 🚀