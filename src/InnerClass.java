class Outer
{
    private String outer = "Outer Field Private Variable";
    static String prVar = "Outer Field "; // for Static Class Require Only Static Variable
    public class Inner // this is Non- static Class
    {
        public  void disp()
        {
            System.out.println("Accessing "+outer);
        }
    }
    static class InnerStatic // this is Static Class
    {
        public void disp1()
        {
            System.out.println("Accessing   "+prVar);
        }
    }
}


public class InnerClass
{
    public static void main(String[] args) {
        Outer outerClass = new Outer();
        Outer.Inner innerClass = outerClass.new Inner();
        innerClass.disp();

        Outer.InnerStatic istatic = new Outer.InnerStatic(); // Here Use Direct Class Name , Not a object of Outer class
        istatic.disp1();
    }
}
