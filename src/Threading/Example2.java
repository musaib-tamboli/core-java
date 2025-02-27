package Threading;
import java.lang.Thread;
class A1 extends Thread
{
    @Override
    public void run()
    {
        for (int i=1;i<=20;i++)
        {
            System.out.println(" Hello :: "+i);
            if (i==10)
            {
                try{
                    Thread.sleep(1000*30);
                }
                catch (InterruptedException e)
                {
                    System.out.println("Thread Interrupted !");
                }
            }
        }
    }
}
class B1 extends Thread
{
    @Override
    public void run()
    {
        for (int i=1;i<=20;i++)
        {
            System.out.println("Hiii :: "+i);
        }
    }
}


public class Example2
{

    public static void main(String[] args) {
    A1 a1 = new A1();
    B1 b1 = new B1();

    a1.start();
    b1.start();
    }
}
