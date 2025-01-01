package Method;

public class InstanceFunc
{
    int a;
    public int val(int a)
    {
        this.a = a;
        System.out.println(a);
        return a;
    }
    public static void main(String args[])
    {
        InstanceFunc i = new InstanceFunc();
        i.val(10);
        i.val(200);

    }
}
