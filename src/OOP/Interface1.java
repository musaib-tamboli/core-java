package OOP;

interface Car
{
    public abstract void model(String m);
    public void drive();
//    In 'interface' We only Declare methods of any Type
}

// All Methods Which is Declare in Interface they all Should be implemented in Class
// Otherwise Error Arise

class BMW implements Car // 'implements' Keyword is Used to Access Interface
{
    @Override
    public void model(String m)
    {
        System.out.println(m);
    }
    @Override
    public void drive()
    {
        System.out.println("Lets Drive The Car ");
    }
}

public class Interface1
{
    public static void main(String[] args) {
        BMW b = new BMW(); // We Cannot Create Instance of Interface
        b.model("BMW X1 Class ");
        b.drive();

    }
}
