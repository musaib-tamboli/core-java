package OOP.Inheritance;

class Parent
{
    public void dispA()
    {
        System.out.println("Method From Class A");
    }
}
class Child extends Parent
{
    public void dispB()
    {
        System.out.println("Method From Class B");
    }
}
public class SingleInherit
{
    public static void main(String[] args) {
        Child c = new Child();
        c.dispA();
        c.dispB();
    }
}
