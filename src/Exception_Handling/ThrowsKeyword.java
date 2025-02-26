package Exception_Handling;

public class ThrowsKeyword
{
    public void a() throws ArrayIndexOutOfBoundsException
    {
        int[] arr = new int[5];
        arr[5]=10;
    }

    public void b() throws ArithmeticException
    {
        int i=0;
        i = 14/0;
        System.out.println(i);
    }
   public void test()
    {
        try
        {
            a();
            b();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot Divide any Number with Zero :: "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out of Bound :: "+e.getMessage());
        }
    }
    public static void main(String[] args) {
    ThrowsKeyword t = new ThrowsKeyword();
        t.test();

    }
}
