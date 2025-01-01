package OOP;
// Creating a  Class
public class Sample
{
    int x = 10;
    final int a = 2600;
    public static void main(String args[])
    {
        Sample s1 = new Sample();
        System.out.println(s1.x); // Accessing 'x' Attribute from class Sample
        s1.x = 100; // Modifying Existing Value of 'x = 10' to 'x=100'
        System.out.println(s1.x);
//        If we dont allow to Update Existing the use 'final' keyword
//         s1.a = 1000; # Here this Error will occur "java: cannot assign a value to final variable a"
//         System.out.println(s1.a);


//        We Can Create Multiple Objects
        Sample s2 = new Sample();

    }
}
