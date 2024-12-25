package OOP.Inheritance;

class A
{
    public void dispA()
    {
        System.out.println("Musaib ");
    }
}
class B extends  A
{
    public void dispB()
    {
        System.out.println("Ismail ");
    }
}
class C extends B
{
    public void dispC()
    {
        System.out.println("Tamboli ");
    }
}


public class MultiLevel
{
    public static void main(String[] args) {
        C c1 = new C();
        c1.dispA();
        c1.dispB();
        c1.dispC();
    }
}
