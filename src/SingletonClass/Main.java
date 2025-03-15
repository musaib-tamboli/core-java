package SingletonClass;
class SingleTon
{
    private SingleTon()
    {

        System.out.println("This is Singleton Constructor");
    }
    private static  SingleTon instance;
    public static SingleTon getObj()
    {
        if(instance == null)
        {
            instance = new SingleTon();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getObj();
        SingleTon s2= SingleTon.getObj();
        SingleTon s3 = SingleTon.getObj();

        System.out.println(s2 == s3 ); // returns true because both Are referencing to same instance
    }

}
