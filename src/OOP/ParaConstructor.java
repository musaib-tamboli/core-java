package OOP;

public class ParaConstructor
{
    public ParaConstructor(int a , int b) // This is Parameterized Constructor
    {
        System.out.println("Sum "+a+ " & " +b+" is  " +(a+b));
    }
    public ParaConstructor() // We Can overload Constructor , By Passing differnt Pararmeter with Different Datatypes
    {
        System.out.println("This is Default Constructor ");
    }

    public static void main(String[] args) {
        ParaConstructor p = new ParaConstructor(10,20); // The Value is passed When we are Creating Object
//        ParaConstructor p1 = new ParaConstructor(10,40);
        ParaConstructor p1 = new ParaConstructor();
    }
}
