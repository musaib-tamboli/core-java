package Method;

public class MethodEx
{
    public void display()
    {
        System.out.println("Hello ! this is Default Function ");
    }
    public int addition(int a , int b)
    {
        System.out.println("Sum = "+(a+b));
        return 0;
    }
    public static void main(String args[])
    {
        MethodEx m1 = new MethodEx();
        m1.display();
        m1.addition(10,2300);
    }
}

