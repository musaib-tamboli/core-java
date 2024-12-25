package Method;
// This is method Overloading Program
public class Overloading
{
//    Example : Same Datatype With Different Parameter Size
    public static int Add(int a, int b)
    {
        return a+b;
    }
    public static int Add(int a , int b , int c)
    {
        return a+b+c;
    }
//    Example : Different Datatype with Same Parameters
    public static void disp(int a)
    {
        System.out.println("Value is "+a);
    }
    public static void disp(String str)
    {
        System.out.println("This is String ");
    }

    public static void main(String args[])
    {
        System.out.println("Sum of 2 Numbers :: "+Add(10,50)); // 60
        System.out.println("Sum of 3 Numbers :: "+Add(10,50,40)); // 100

    }
}

