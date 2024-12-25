package OOP;

public class StaticBlock
{
    public static int var;
    public StaticBlock()
    {
        System.out.println("This is Constructor ");
    }
// Static Blocks are executed first , Because 
    static
    {
        var = 100;
        System.out.println("1st Static Block Executed , var = "+ var);
    }
    static
    {
        var +=50; // Value of 'var' is 150
        System.out.println("2nd Static Block Executed , var = "+ var);
    }

    public static void main(String[] args) {
        StaticBlock s = new StaticBlock();
    }
}
