package OOP;

public class ParaConstructor
{
    public ParaConstructor(int a , int b) // This is Parameterized Constructor
    {
        System.out.println("Sum "+a+ " & " +b+" is  " +(a+b));
    }

    public static void main(String[] args) {
        ParaConstructor p = new ParaConstructor(10,20); // The Value is passed When we are Creating Object
//        ParaConstructor p1 = new ParaConstructor(10,40);
    }
}
