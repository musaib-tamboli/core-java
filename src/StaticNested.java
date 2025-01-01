public class StaticNested
{
    static String prVar = "Outer Field "; // for Static Class Require Only Static Variable

    static class InnerStatic // this is Static Class # Contains Only Static Members
    {
        public void disp1()
        {
            System.out.println("Accessing   "+prVar);
        }
    }

    public static void main(String[] args) {
        Outer.InnerStatic istatic = new Outer.InnerStatic(); // Here Use Direct Class Name , Not a object of Outer class
        istatic.disp1();
    }
}
