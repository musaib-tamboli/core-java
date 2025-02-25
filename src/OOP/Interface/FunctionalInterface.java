package OOP.Interface;
// Functional Interface is a Type of Interface |
// Who Contains Only Single Abstract Method (SAm)
interface Functional
{
    public abstract void sample();
}

public class FunctionalInterface implements Functional
{
    public void sample()
    {
        System.out.println("This is Functional Interface ");
    }
    public static void main(String[] args) {

    }
}
