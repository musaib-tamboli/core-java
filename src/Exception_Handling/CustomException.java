package Exception_Handling;
// Java Allow us to create Custom / User Define Exception
// To Define Custom Exception we need to extends Exception Class

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String msg)
    {
        super(msg);
    }
}
public class CustomException   {
    public static void testAge(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age Must Be Above 18");
        }
    }

    public static void main(String[] args) {
    try
    {
        testAge(14);
    }
    catch (InvalidAgeException e)
    {
        System.out.println(e);
    }
    }
}
