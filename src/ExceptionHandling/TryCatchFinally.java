package ExceptionHandling;

public class TryCatchFinally
{
    public static void main(String[] args) {
        try
        {
            int res = 50/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error is "+e.getMessage());
        }
        finally {
            int res = 50/2;
            System.out.println("Result From finally Block :: "+res);
        }
    }
}
