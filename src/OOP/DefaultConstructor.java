package OOP;

public class DefaultConstructor
{
//     Constructor Name is Same as Class Name
    public DefaultConstructor() // Construtor without Arguments is Known as Default Constructor
    {
        System.out.println("This Is Constructor ");
    }
    public static void main(String args[])
    {
        DefaultConstructor d = new DefaultConstructor(); // Constructor Call Automatically When Object is Created

    }
}
