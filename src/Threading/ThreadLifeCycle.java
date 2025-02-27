package Threading;
import java.lang.Thread;
public class ThreadLifeCycle extends Thread
{
@Override
    public void run() {
        System.out.println("Thread is Running ...");
        try
        {
            Thread.sleep(1000); // Here thread will go in Waiting State
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread Interrupted ! ");
        }
        System.out.println("Thread Execution Completed");
    }

    public static void main(String[] args) {
        ThreadLifeCycle t = new ThreadLifeCycle();
        System.out.println("Thread is in New State");
        t.start();
        System.out.println("Thread is in Runnable State");
    }
}
