package OOP;

public class ThisKeyword
{
//    'this' keyword is a reference to the current Object
    int a ;
    int b ;
    public ThisKeyword(int a , int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("a = "+a +" b = "+b);
    }

    public static void main(String[] args) {
        ThisKeyword t = new ThisKeyword(500,400);
        
    }
}
