## **Thread Lifecycle in Java**

Yes, a thread in Java has a **lifecycle** that consists of several states. The **Java Thread Life Cycle** is controlled by the `java.lang.Thread` class and has **five major states**:

---

### **Thread Lifecycle States**
| **State** | **Description** |
|-----------|----------------|
| **1. New** | The thread is created but not started yet. |
| **2. Runnable** | The thread is ready to run and waiting for CPU scheduling. |
| **3. Running** | The thread is currently executing. |
| **4. Blocked/Waiting** | The thread is paused due to some condition (e.g., waiting for a lock). |
| **5. Terminated (Dead)** | The thread has completed execution or was stopped. |

---

### **Diagram of Thread Lifecycle**
```
       +------------+   
       |   New      |   
       +------------+   
             | (start())  
             v   
       +------------+    
       | Runnable   |  <-----------+  
       +------------+              |  
             | (CPU assigned)       | (waiting for CPU)  
             v                      |  
       +------------+ (running)     |  
       | Running    |---------------+  
       +------------+  
         |    |  
         |    | (blocked/waiting)  
         v    v  
  +------------+  
  | Blocked /  |  
  | Waiting    |  
  +------------+  
         | (condition met)  
         v  
  +------------+  
  | Terminated |  
  +------------+  
```

---

### **Explanation of Each State**
#### **1. New State** (Thread is Created)
- When a thread is created but not started.
- Example:
  ```java
  Thread t = new Thread();  // Thread created, but not started
  ```
- It remains in this state until `start()` is called.

#### **2. Runnable State** (Ready to Execute)
- The thread is **ready to run** but waiting for CPU time.
- Example:
  ```java
  t.start();  // Now thread is in Runnable state
  ```
- The thread enters this state after calling `start()`, but it still needs CPU allocation.

#### **3. Running State** (Executing)
- The thread gets CPU time and starts executing the `run()` method.
- Example:
  ```java
  public void run() {
      System.out.println("Thread is running...");
  }
  ```
- The thread remains in this state **until** it finishes execution or is interrupted.

#### **4. Blocked / Waiting State** (Paused)
- A thread enters this state when:
    - It is waiting for a lock (`synchronized` block).
    - It calls `wait()`, `sleep()`, or `join()`.
- Example:
  ```java
  Thread.sleep(1000);  // Thread goes to waiting state for 1 second
  ```
- It moves back to **Runnable** when the condition is met.

#### **5. Terminated (Dead State)** (Execution Completed)
- The thread completes execution or is **stopped manually**.
- Example:
  ```java
  System.out.println("Thread execution finished.");  // Thread is now dead
  ```
- A terminated thread **cannot** be restarted.

---

### **Example Program Demonstrating Thread Lifecycle**
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is Running...");
        try {
            Thread.sleep(2000); // Thread moves to waiting state
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
        System.out.println("Thread Execution Completed.");
    }
}

public class ThreadLifecycle {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        System.out.println("Thread is in New State.");
        t.start();  // Moves to Runnable state

        System.out.println("Thread is in Runnable State.");
    }
}
```

**Expected Output:**
```
Thread is in New State.
Thread is in Runnable State.
Thread is Running...
Thread Execution Completed.
```

---

### **Key Takeaways**
1. **Threads move between different states based on their execution and conditions.**
2. **A thread cannot be restarted once it reaches the Terminated state.**
3. **The operating system's thread scheduler decides when a Runnable thread gets CPU time.**
4. **Using methods like `sleep()`, `wait()`, or `join()` can pause a thread, moving it to the Blocked/Waiting state.**

Would you like to explore **Thread Synchronization** next?