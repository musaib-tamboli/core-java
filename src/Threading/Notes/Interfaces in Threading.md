## **Interfaces in Threading in Java**

### **Definition**
In Java, multithreading can be implemented using **two approaches**:
1. **Extending the `Thread` class**
2. **Implementing the `Runnable` interface** (Recommended)

Additionally, Java provides the **Callable** and **Future** interfaces for advanced multithreading tasks.

---

## **Types of Interfaces in Threading**

| **Interface**  | **Description** | **Key Method(s)** |
|---------------|---------------|----------------|
| **Runnable** | Used to define a task that can be executed by a thread. | `void run()` |
| **Callable** | Similar to `Runnable`, but can return a result and throw exceptions. | `V call()` |
| **Future** | Used to retrieve the result of a `Callable` task. | `get()`, `isDone()` |

---

## **1. Runnable Interface**

### **Definition**
`Runnable` is a functional interface in Java that represents a task to be executed by a thread. It contains a **single method `run()`**, which defines the thread’s behavior.

### **Syntax**
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
```

### **Working Mechanism**
1. **Implement `Runnable` interface** and override `run()` method.
2. Create an instance of `Thread` class and pass the `Runnable` object to its constructor.
3. Start the thread using `start()`.

### **Key Features**
- **Preferred over extending `Thread`** (since Java supports single inheritance).
- **Can be used with thread pools and executors** (for better performance).
- **Does not return a result** (use `Callable` for that).

---

## **2. Callable Interface**

### **Definition**
The `Callable` interface is similar to `Runnable`, but it **returns a result** and **can throw exceptions**.

### **Syntax**
```java
import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
    public Integer call() throws Exception {
        return 10 * 2;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new MyCallable());
        System.out.println("Result: " + future.get()); // Fetch the result
        executor.shutdown();
    }
}
```

### **Key Features**
- **Returns a value** (`call()` returns a result of type `V`).
- **Can throw exceptions** (`call()` allows checked exceptions).
- Used with **ExecutorService** and `Future` to retrieve results.

---

## **3. Future Interface**

### **Definition**
The `Future` interface is used to **retrieve the result of an asynchronous task** submitted via `Callable`.

### **Key Methods**
| Method | Description |
|--------|-------------|
| `get()` | Retrieves the result (waits if necessary). |
| `isDone()` | Checks if the task is completed. |
| `cancel()` | Attempts to cancel execution. |

### **Example**
```java
import java.util.concurrent.*;

class MyTask implements Callable<String> {
    public String call() {
        return "Task Completed";
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> future = executor.submit(new MyTask());

        if (!future.isDone()) {
            System.out.println("Task still running...");
        }
        System.out.println(future.get()); // Waits for the result
        executor.shutdown();
    }
}
```

---

## **Comparison Table: Runnable vs Callable**

| Feature | Runnable | Callable |
|---------|---------|---------|
| **Return Value** | No return value (`void run()`) | Returns a result (`V call()`) |
| **Exception Handling** | Cannot throw checked exceptions | Can throw checked exceptions |
| **Execution** | Runs via `Thread` or `ExecutorService` | Runs via `ExecutorService` |
| **Usage** | Simple tasks | Tasks requiring results |

---

## **Common Mistakes & Best Practices**

| **Mistake** | **Best Practice** |
|-------------|------------------|
| **Calling `run()` instead of `start()`** | Always use `start()` to run a new thread. |
| **Not handling exceptions in `Callable`** | Use `try-catch` or `Future.get()` properly. |
| **Blocking threads manually** | Use `ExecutorService` for better thread management. |

---

## **Interview Questions & Answers**

**Q1: What is the difference between `Runnable` and `Callable`?**  
**A:** `Runnable` does not return a result, while `Callable` can return a value and throw exceptions.

**Q2: Why is `Runnable` preferred over extending `Thread`?**  
**A:** Java supports **single inheritance**, so implementing `Runnable` allows better flexibility.

**Q3: What is the purpose of the `Future` interface?**  
**A:** It helps retrieve results from asynchronous tasks executed using `Callable`.

---

Would you like an example of **Thread Pool using ExecutorService**?