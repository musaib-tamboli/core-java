package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        try
        {
            int res = 50 / 0;

        }
        catch (ArithmeticException e)
        {
            System.out.println("Error :: "+e.getMessage());
        }
    }
}
