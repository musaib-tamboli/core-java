## **Multithreading in Java**

### **Definition**
Multithreading in Java is the process of executing **multiple threads concurrently** to improve the performance of a program. It allows a program to perform **multiple tasks at the same time** by utilizing CPU cores efficiently.

---

## **Concepts of Multithreading**

| **Concept** | **Description** |
|------------|---------------|
| **Thread** | A lightweight sub-process of a program that runs independently. |
| **Process vs. Thread** | A process is an independent program in execution, whereas a thread is a **smaller unit within a process**. |
| **Concurrency** | Running multiple tasks in an interleaved manner (not necessarily parallel). |
| **Parallelism** | Running multiple tasks at the **same time** (requires multiple CPUs). |
| **Thread Synchronization** | A mechanism to control access to shared resources to avoid **race conditions**. |
| **Thread Communication** | Threads communicate with each other using `wait()`, `notify()`, and `notifyAll()`. |

---

## **Ways to Create a Thread in Java**

| **Approach** | **Description** | **Example** |
|-------------|----------------|-------------|
| **Extending `Thread` Class** | Inherits the `Thread` class and overrides `run()` method. | `class MyThread extends Thread { public void run() { } }` |
| **Implementing `Runnable` Interface** | Implements `Runnable` interface and defines `run()` method. | `class MyRunnable implements Runnable { public void run() { } }` |
| **Using `Callable` and `Future`** | Used when a thread needs to return a result. | `class MyCallable implements Callable<Integer> { public Integer call() { return 10; } }` |

---

## **1. Creating a Thread using `Thread` Class**

### **Example**
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // Starts the thread
    }
}
```

### **Working Mechanism**
- Extends `Thread` class.
- Overrides `run()` method.
- Calls `start()` to initiate a new thread.

**Drawback:** Since Java supports **single inheritance**, this approach limits class extension.

---

## **2. Creating a Thread using `Runnable` Interface**

### **Example**
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
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
- Implements `Runnable` interface.
- Defines `run()` method.
- Creates `Thread` object and passes `Runnable` instance.

**Advantage:** More flexible than extending `Thread` class.

---

## **3. Creating a Thread using `Callable` and `Future` (Returns a Value)**

### **Example**
```java
import java.util.concurrent.*;

class MyTask implements Callable<Integer> {
    public Integer call() {
        return 10 * 2;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new MyTask());
        System.out.println("Result: " + future.get());
        executor.shutdown();
    }
}
```

**Key Points:**
- `Callable` interface allows returning a value.
- `Future` is used to retrieve the result.

---

## **Thread Lifecycle (States of a Thread)**

| **State** | **Description** |
|----------|---------------|
| **New** | Thread is created but not yet started (`new Thread()`). |
| **Runnable** | Thread is ready to run (`start()` called). |
| **Blocked** | Waiting for a resource (like a locked object). |
| **Waiting** | Indefinitely waiting (`wait()` or `join()`). |
| **Timed Waiting** | Waiting for a fixed time (`sleep()` or `wait(timeout)`). |
| **Terminated** | Thread has finished execution. |

---

## **Thread Methods**

| **Method** | **Description** |
|-----------|---------------|
| `start()` | Starts the thread. |
| `run()` | Defines the thread's task. |
| `sleep(ms)` | Pauses execution for a given time. |
| `join()` | Waits for another thread to finish. |
| `yield()` | Hints the scheduler to allow other threads to execute. |
| `interrupt()` | Interrupts a sleeping or waiting thread. |

### **Example of `sleep()`**
```java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
```
**Output:** Numbers printed with a **1-second delay**.

---

## **Thread Synchronization**

### **Problem Without Synchronization (Race Condition)**
```java
class SharedResource {
    void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}

class MyThread extends Thread {
    SharedResource sr;
    MyThread(SharedResource sr) { this.sr = sr; }
    public void run() { sr.printTable(5); }
}

public class Main {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);
        t1.start();
        t2.start();
    }
}
```
**Problem:** Both threads access `printTable()` **simultaneously**, causing **inconsistent output**.

---

### **Solution: Synchronization**
```java
class SharedResource {
    synchronized void printTable(int n) { // Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}
```
**Fix:** The `synchronized` keyword ensures that only **one thread** can access `printTable()` at a time.

---

## **Thread Communication (`wait()`, `notify()`, `notifyAll()`)**

| **Method** | **Description** |
|-----------|---------------|
| `wait()` | Makes a thread wait until notified. |
| `notify()` | Wakes up a single waiting thread. |
| `notifyAll()` | Wakes up all waiting threads. |

### **Example**
```java
class Shared {
    synchronized void produce() throws InterruptedException {
        System.out.println("Producer waiting...");
        wait();
        System.out.println("Producer resumed...");
    }

    synchronized void consume() {
        System.out.println("Consumer notifying...");
        notify();
    }
}

public class Main {
    public static void main(String[] args) {
        Shared s = new Shared();
        new Thread(() -> { try { s.produce(); } catch (InterruptedException e) {} }).start();
        new Thread(() -> s.consume()).start();
    }
}
```
**Output:** Producer waits → Consumer notifies → Producer resumes.

---

## **Common Mistakes & Best Practices**

| **Mistake** | **Best Practice** |
|-------------|------------------|
| Calling `run()` instead of `start()` | Always use `start()` to begin execution. |
| Not handling `InterruptedException` | Use `try-catch` to handle interruptions. |
| Not synchronizing shared resources | Use `synchronized` keyword to avoid race conditions. |
| Using too many threads | Use **thread pools** for efficient resource management. |

---

## **Interview Questions & Answers**

**Q1: What is the difference between a process and a thread?**  
**A:** A process is an independent executing program, whereas a thread is a **smaller unit within a process** that shares memory and resources.

**Q2: What is the advantage of using `Runnable` over extending `Thread`?**  
**A:** Java **supports single inheritance**, so using `Runnable` allows more flexibility.

Would you like an example of **Thread Pool using Executors**?