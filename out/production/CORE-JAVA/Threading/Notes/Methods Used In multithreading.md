## **Methods of the `Thread` Class in Java**

The `Thread` class in Java provides several methods to manage and control threads. Below is a list of commonly used methods:

---

### **1. Thread Life Cycle Methods**
| Method | Description |
|--------|------------|
| `start()` | Starts a new thread and executes the `run()` method. |
| `run()` | Contains the code that will be executed when the thread starts. |
| `sleep(long millis)` | Puts the thread to sleep for a specified time (in milliseconds). |
| `join()` | Waits for the thread to complete before moving to the next instruction. |
| `join(long millis)` | Waits for the thread to complete within the specified time. |
| `interrupt()` | Interrupts a sleeping or waiting thread. |

---

### **2. Thread Priority & Control Methods**
| Method | Description |
|--------|------------|
| `setPriority(int priority)` | Sets the priority of a thread (`1` to `10`). |
| `getPriority()` | Returns the priority of a thread. |
| `setName(String name)` | Sets the name of the thread. |
| `getName()` | Returns the name of the thread. |
| `isAlive()` | Checks if the thread is still running. |

---

### **3. Thread Synchronization & Status Methods**
| Method | Description |
|--------|------------|
| `yield()` | Pauses the current thread to allow other threads to execute. |
| `wait()` | Makes the thread wait until another thread notifies it using `notify()`. |
| `notify()` | Wakes up a single waiting thread. |
| `notifyAll()` | Wakes up all waiting threads. |

---

### **4. Thread Daemon Methods**
| Method | Description |
|--------|------------|
| `setDaemon(boolean status)` | Marks a thread as a **daemon thread** (runs in background). |
| `isDaemon()` | Checks if a thread is a daemon thread. |

---

### **5. Thread Interruption Methods**
| Method | Description |
|--------|------------|
| `interrupt()` | Interrupts the thread, stopping sleep/wait states. |
| `isInterrupted()` | Checks if the thread has been interrupted. |
| `static interrupted()` | Checks if the current thread is interrupted and clears its status. |

---

## **Example Code Using Thread Methods**
```java
class MyThread extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running...");
            Thread.sleep(2000); // Pauses execution for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

public class ThreadMethodsExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Worker-1");
        t2.setName("Worker-2");

        t1.start();
        t2.start();

        System.out.println("Thread " + t1.getName() + " priority: " + t1.getPriority());
        
        t1.join(); // Waits for t1 to complete
        t2.interrupt(); // Interrupts t2

        System.out.println("Main thread finished execution.");
    }
}
```
**Expected Output:**
```
Worker-1 is running...
Worker-2 is running...
Thread Worker-1 priority: 5
Worker-2 was interrupted.
Main thread finished execution.
```

---

## **Key Takeaways**
- `start()` is used to launch a thread.
- `join()` ensures a thread finishes before continuing execution.
- `sleep()` pauses execution for a specified time.
- `interrupt()` is used to stop sleeping or waiting threads.
- `isAlive()` checks if a thread is still active.

Would you like to learn about **thread states** or **thread synchronization** next?