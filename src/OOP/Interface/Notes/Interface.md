# 🔹 **Interface & Its Types in Java**

## 🔹 **Definition**
An **interface** in Java is a **blueprint of a class** that contains **only abstract methods and constants** (before Java 8). It defines **what a class should do but not how**. A class that implements an interface **must provide implementations** for its abstract methods.

---

## 🔹 **Syntax**
```java
// Defining an Interface
interface Animal {
    void makeSound();  // Abstract method (No body)
}

// Implementing the Interface
class Dog implements Animal {
    public void makeSound() {  // Providing implementation
        System.out.println("Bark! Bark!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Bark! Bark!
    }
}
```

---

## 🔹 **Working Mechanism**
1. **Interfaces contain only method declarations** (before Java 8).
2. **A class implements an interface** using `implements` keyword.
3. **The class must override all methods** declared in the interface.
4. **Multiple inheritance** is achieved using interfaces (since Java does not support multiple inheritance with classes).

---

## 🔹 **Key Features & Properties**
✔ **100% Abstraction** (before Java 8)  
✔ **Cannot have constructors** (No object creation)  
✔ **Can have default & static methods** (from Java 8)  
✔ **Can extend multiple interfaces** (Multiple inheritance support)  
✔ **All methods are `public abstract` by default**  
✔ **All variables are `public static final` (constants) by default**

---

# 🔹 **Types of Interfaces in Java**

| Type | Description | Example |
|------|------------|---------|
| **1. Normal Interface** | Contains only **abstract methods** (before Java 8) | `interface Animal { void makeSound(); }` |
| **2. Functional Interface** | Contains **exactly one abstract method** (Can have multiple default/static methods) | `Runnable, Callable, Comparator` |
| **3. Marker Interface** | **Empty Interface** (No methods, used for tagging classes) | `Serializable, Cloneable` |
| **4. Nested Interface** | Interface inside another class/interface | `Entry interface in Map` |

---

## 🔹 **1. Normal Interface (Standard Interface)**
A normal interface contains only **abstract methods** before Java 8.

### **Example**
```java
interface Vehicle {
    void start();  // Abstract method
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Output: Car is starting...
    }
}
```

---

## 🔹 **2. Functional Interface (Java 8+)**
A **functional interface** has **exactly one abstract method** but can have multiple **default and static methods**.

### **Example**
```java
@FunctionalInterface
interface Greeting {
    void sayHello();  // One abstract method
}

public class LambdaExample {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello, World!"); // Lambda Expression
        g.sayHello(); // Output: Hello, World!
    }
}
```
### **Common Functional Interfaces**
| Interface | Method |
|-----------|--------|
| `Runnable` | `void run()` |
| `Callable` | `V call()` |
| `Comparator<T>` | `int compare(T o1, T o2)` |

---

## 🔹 **3. Marker Interface (Tagging Interface)**
A **marker interface** has **no methods** and is used to provide **metadata** or **special behavior** to classes.

### **Example**
```java
import java.io.Serializable;

class Employee implements Serializable {
    int id;
    String name;
}
```
### **Common Marker Interfaces**
| Interface | Purpose |
|-----------|---------|
| `Serializable` | Allows object serialization |
| `Cloneable` | Enables cloning using `clone()` |
| `Remote` | Supports RMI (Remote Method Invocation) |

---

## 🔹 **4. Nested Interface**
A **nested interface** is defined **inside a class or another interface**.

### **Example**
```java
class OuterClass {
    interface InnerInterface {
        void show();
    }
}

class Implementor implements OuterClass.InnerInterface {
    public void show() {
        System.out.println("Nested Interface Implemented!");
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.InnerInterface obj = new Implementor();
        obj.show();  // Output: Nested Interface Implemented!
    }
}
```

---

## 🔹 **Comparison Table: Interface vs Abstract Class**
| Feature | Interface | Abstract Class |
|---------|----------|---------------|
| Method Type | Only **abstract methods** (before Java 8) | Can have **abstract & concrete methods** |
| Default Method Support | Yes (from Java 8) | Yes |
| Constructor | ❌ No constructor | ✅ Can have a constructor |
| Inheritance | Supports **multiple inheritance** | Supports **single inheritance** |
| Variables | `public static final` (constants) | Can have instance variables |

---

## 🔹 **Common Mistakes & Best Practices**
❌ **Mistake: Forgetting to implement all interface methods**
```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {  // ❌ Error: Does not implement makeSound()
}
```
✅ **Solution: Implement all methods**
```java
class Dog implements Animal {
    public void makeSound() { 
        System.out.println("Bark!");
    }
}
```

❌ **Mistake: Trying to create an instance of an interface**
```java
Animal obj = new Animal();  // ❌ Error: Cannot instantiate interface
```
✅ **Solution: Use a class that implements the interface**
```java
Animal obj = new Dog();
```

---

## 🔹 **Interview Questions & Answers**
🔹 **Q1:** Can an interface have a constructor?  
✅ **A:** No, interfaces **cannot have constructors** because they **cannot be instantiated**.

🔹 **Q2:** Can an interface extend another interface?  
✅ **A:** Yes, an interface can extend **multiple interfaces** using `extends`.
```java
interface A { void methodA(); }
interface B extends A { void methodB(); }
```

🔹 **Q3:** Can an interface implement another interface?  
❌ **A:** No, interfaces **cannot implement** another interface. They can **only extend** them.

🔹 **Q4:** What is the difference between an interface and an abstract class?  
✅ **A:** An interface has **only abstract methods (before Java 8)**, whereas an abstract class can have both **abstract and concrete methods**.

---

## 🔹 **Memory Trick / Mnemonic**
🔹 **"IMFI → Interface Means Four Types"**  
✔ **I** → **Interface (Normal Interface)**  
✔ **M** → **Marker Interface (No Methods, Just Metadata)**  
✔ **F** → **Functional Interface (1 Abstract Method, Lambda Compatible)**  
✔ **N** → **Nested Interface (Inside Class/Another Interface)**

---

## 🔹 **Conclusion**
- **Interfaces** provide **loose coupling** and **achieve multiple inheritance**.
- **Types of interfaces:** Normal, Functional, Marker, Nested.
- **Java 8+ introduced default & static methods** in interfaces.
- **Commonly used in Java frameworks** (Spring, Hibernate).

Let me know if you need more details! 🚀