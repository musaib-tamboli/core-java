# 🔹 **Enum Class & Constructor in Java**

## 🔹 **Definition**
In Java, an **`enum` (enumeration)** is a special class that represents a **fixed set of constants**. Enums can have **constructors, fields, and methods**, making them more powerful than simple constant values.

---

## 🔹 **Syntax of Enum Class with Constructor**
```java
enum EnumName {
    CONSTANT1(value1),
    CONSTANT2(value2);

    private DataType variable;  // Instance variable

    // Constructor
    EnumName(DataType variable) {
        this.variable = variable;
    }

    // Method to get variable value
    public DataType getVariable() {
        return variable;
    }
}
```

---

## 🔹 **Working Mechanism of Enum Class with Constructor**
1. **Enum constants are like objects** of the enum class.
2. Each constant **calls the constructor** with a specified argument.
3. The constructor **assigns values to instance variables**.
4. Methods inside the enum **retrieve or modify** these values.

---

## 🔹 **Code Example: Enum Class with Constructor**
```java
// Define Enum with Constructor
enum Level {
    EASY(1), MEDIUM(2), HARD(3);

    private int difficulty; // Instance variable

    // Constructor
    Level(int difficulty) {
        this.difficulty = difficulty;
    }

    // Getter Method
    public int getDifficulty() {
        return difficulty;
    }
}

// Main Class
public class EnumExample {
    public static void main(String[] args) {
        Level myLevel = Level.MEDIUM;

        // Print Enum Constant and its associated value
        System.out.println("Selected Level: " + myLevel);
        System.out.println("Difficulty Level: " + myLevel.getDifficulty());
    }
}
```
**📝 Output:**
```
Selected Level: MEDIUM
Difficulty Level: 2
```

---

## 🔹 **Key Features & Properties of Enum with Constructor**
✔ **Enums can have instance variables** to store constant-specific values.  
✔ **Constructors in enums are always `private`** (cannot use `public` or `protected`).  
✔ **Enums can have methods** (like `getDifficulty()`).  
✔ **Enum constants are final and static** (cannot be modified).  
✔ **Useful for defining predefined sets of related constants with additional attributes**.

---

## 🔹 **Use Cases & Applications**
✅ **Representing Fixed Constants with Data** (Difficulty Levels, Status Codes).  
✅ **Replacing String-Based Constants** (Avoids typos, improves performance).  
✅ **Encapsulating Data Inside Enum** (Associating values with each constant).

---

## 🔹 **Common Mistakes & Best Practices**
❌ **Mistake: Using `public` constructor in Enum (Not Allowed!)**
```java
enum Level {
    EASY(1);
    
    private int difficulty;
    
    public Level(int difficulty) { // ❌ Compilation Error!
        this.difficulty = difficulty;
    }
}
```
✅ **Solution: Enum constructors must be `private` (or default access).**
```java
enum Level {
    EASY(1);
    
    private int difficulty;
    
    Level(int difficulty) { // ✅ Correct: Implicitly Private
        this.difficulty = difficulty;
    }
}
```

---

## 🔹 **Comparison Table: Enum vs Class**
| Feature        | Enum | Regular Class |
|---------------|------|--------------|
| Instantiation | ❌ Cannot create new instances | ✅ Can create objects using `new` |
| Constructors  | ✅ Private constructors only | ✅ Public/Protected constructors |
| Fields & Methods | ✅ Can have fields & methods | ✅ Can have fields & methods |
| Mutability    | ❌ Immutable constants | ✅ Can be mutable |

---

## 🔹 **Interview Questions & Answers**
🔹 **Q1:** Can an enum have a constructor in Java?  
✅ **A:** Yes, but the constructor must be **private or package-private** (default access modifier).

🔹 **Q2:** Why can’t we create an object of an enum using `new`?  
✅ **A:** Enum constants are **static and final** by default, meaning they are instantiated only once in memory.

🔹 **Q3:** Can enums extend another class?  
✅ **A:** No, enums **cannot extend** another class because they **implicitly extend `java.lang.Enum`**.

---

## 🔹 **Memory Trick / Mnemonic**
🔹 **"Enums Are Classes with Fixed Objects!"**  
✔ **E** → Enums **Encapsulate Data**  
✔ **N** → **Never use `new`** to create an enum object  
✔ **U** → **Use Constructors** for assigning values  
✔ **M** → **Methods** can be added inside enums

---

Let me know if you need more details! 🚀