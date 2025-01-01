class Outer1
{
    private String outerField = "Outer Class Variable";
    public void localInnerEx()
    {
        final int a = 10;
        class Inner
        {
            public void display()
            {
                System.out.println("Outer "+outerField);
                System.out.println("Final Variable :: "+a);
            }
        }
        Inner in = new Inner();
        in.display();
    }
}

public class LocalInner
{
    public static void main(String[] args) {
       Outer1 ot = new Outer1();
       ot.localInnerEx();
    }
}

