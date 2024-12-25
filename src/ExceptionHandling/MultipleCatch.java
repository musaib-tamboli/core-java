package ExceptionHandling;

public class MultipleCatch
{
    public static void main(String[] args) {
        try
        {
            int res = 50/0;

        }
        catch (ArithmeticException e)
        {
            System.out.println("Error :: "+e.getMessage());
        }
        catch (NullPointerException e1)
        {
            System.out.println("Error :: "+ e1.getMessage());
        }
    }
}
