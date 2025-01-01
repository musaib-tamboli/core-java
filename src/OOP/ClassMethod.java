package OOP;

public class ClassMethod
{
static void sample() // Static Method,  which means that it can be accessed without creating an object of the class, to Call Method
{
    System.out.println("This is Staic Method From Class Classmethod");
}
public int sum(int a , int b) // This Method is Accept 2 Parameter
{
    return a + b;
}
public static void main(String args[])
{
    sample(); // No need to create Object , Static method Called Directly without using OBject of Class
    ClassMethod c = new ClassMethod();
    System.out.println("Sum = "+c.sum(2100,3100)); // for this method require Object to Call Function From Class

}

}