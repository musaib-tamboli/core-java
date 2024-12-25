package OOP.Polymorphism;



public class Overloading
{
    static int add(int a ,int b) // This is Function Same Name with same Type but Differnt Arguments # 2 Arguments
    {
        return (a+b);
    }
    static int add(int a, int b, int c) // # 3 Arguments
    {
        return (a+b+c);
    }
    static double add(double a, double b)// This is Function Same Name with same Different Type & same Arguments # 2 Arguments
    {
        return (a+b);
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(add(10.10,20.10));

    }
}
