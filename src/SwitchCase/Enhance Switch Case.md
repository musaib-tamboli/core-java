The concept used in the above **`switch-case` statement** is called **"Enhanced Switch Expression"** or **"Arrow (`->`) Case Labels in Switch"**, which was introduced in **Java 14** as part of **"Switch Expressions"** (Java 12 preview, Java 13 improved, and Java 14 finalized).

---

### 🔹 **Concept Name**:
✅ **Enhanced `switch` Expression with Arrow (`->`) Case Labels**

---

### 🔹 **Definition**:
🔹 In Java **14+**, the `switch` statement supports **arrow (`->`) case labels**, which allow more concise and readable code.  
🔹 Unlike traditional `switch-case`, arrow (`->`) syntax **does not require `break` statements**.  
🔹 It is a part of **Java's Pattern Matching and Expression Switches**.

---

### 🔹 **Syntax** (Using Enums in `switch` with Arrow Syntax)
```java
enum Level {
    Easy, Medium, Hard;
}

public class EnumSwitch {
    public static void main(String[] args) {
        Level l = Level.Medium;

        switch (l) {  
            case Easy   -> System.out.println("Level is Easy");
            case Medium -> System.out.println("Level is Medium");
            case Hard   -> System.out.println("Level is Hard");
        }
    }
}
```

---

### 🔹 **Working Mechanism**:
1. The **arrow (`->`) replaces the colon (`:`)** in each `case` statement.
2. **No need for `break;` statements**—each case executes only its block.
3. **More readable & concise compared to traditional `switch-case`.**

---

### 🔹 **Key Features & Properties**:
✔️ Works with **Enums, Strings, Integers, and other supported types**  
✔️ **No need for `break` statements** (automatic fall-through prevention)  
✔️ **More readable & concise** than traditional `switch-case`  
✔️ Can **return values** when used in an **expression switch**  
✔️ Introduced as a preview in **Java 12 & 13**, finalized in **Java 14**

---

### 🔹 **Comparison Table: Traditional vs. Enhanced `switch` in Enums**

| Feature            | Traditional `switch` (Java <12) | Enhanced `switch` (Java 14+) |
|--------------------|--------------------------------|------------------------------|
| Syntax Complexity | Requires `case:` and `break;`  | Uses `case ->`, no `break;` needed |
| Code Readability  | Verbose                        | Concise & clean             |
| Fall-through      | Possible (if `break` missing)  | Not possible (implicit `break`) |
| Return Values     | Not directly possible          | Can return values           |

---

### 🔹 **Common Mistakes & Best Practices**
❌ **Mistake: Using Arrow Syntax in Java 11 or older**
```java
// This will cause an error in Java 11 or earlier!
case Easy -> System.out.println("Level is Easy");
```
✅ **Fix: Upgrade to Java 14+ to use `->` syntax**

---

### 🔹 **Interview Questions & Answers**
🔹 **Q1:** What is the advantage of using `->` in a `switch` statement?  
✅ **A:** The `->` syntax makes `switch` more concise, eliminates `break;`, and prevents fall-through errors.

🔹 **Q2:** Can you use `->` syntax in Java 8 or Java 11?  
✅ **A:** No, the arrow `->` switch syntax is available **only from Java 14 onwards**.

---

Let me know if you need further explanation! 🚀