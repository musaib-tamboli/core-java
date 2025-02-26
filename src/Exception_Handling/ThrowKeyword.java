package Exception_Handling;

public class ThrowKeyword
{
    public static void main(String[] args) {
        int i = 20, j = 0;

        try
        {
            j = 14/i;
            if(j==0)
                throw new ArithmeticException("Catch Block is Called Through throw "); // throw keyword is used to Call catch block
        }
        catch (ArithmeticException e)
        {
            j = 14/1;
            System.out.println("This is Catch Block  : "+e);
        }
        System.out.println(j);
    }
}
