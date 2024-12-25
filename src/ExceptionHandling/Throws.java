package ExceptionHandling;

public class Throws
{
    public static void sample() throws ArithmeticException,NullPointerException
    {
        int res = 50/0;
    }

    public static void main(String[] args) {
        try
        {
            sample();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

    }
}

