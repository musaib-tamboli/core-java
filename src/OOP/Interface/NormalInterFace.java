package OOP.Interface;
// Normal Interface is a type of Interface
interface Normal // Interface Who Contains More than 1 Method is Known as Normal Interface
{
    public abstract void test1();
    public abstract void test2();

}

public class NormalInterFace implements Normal
{
    public void test1()
    {
        System.out.println("This is Test 1 ");
    }
    public void test2()
    {
        System.out.println("This is Tesy 2");
    }
    public static void main(String[] args) {
        NormalInterFace n = new NormalInterFace();
        n.test1();
        n.test2();
    }
}
