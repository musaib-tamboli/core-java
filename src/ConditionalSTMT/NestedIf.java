package ConditionalSTMT;

public class NestedIf
{
    public static void main(String args[])
    {
        int number = 101;
        if (number > 0)
        {
            System.out.println("The number is positive.");
            if (number % 2 == 0)
            {
                System.out.println("The number is even.");
            }
            else
            {
                System.out.println("The number is Odd.");
            }
        }
        else
        {
            System.out.println("The Number is Negative ");
        }

    }
}
