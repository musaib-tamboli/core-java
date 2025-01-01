package Arrays;

public class ArrayEx
{
    public static void main(String args[])
    {
        int num[] = {10,20,30,40}; // Integer Type Array
        System.out.println("Element at index 2 : "+num[2]);
//        Printing All Array Elements
        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }

        System.out.println("Printing Array Elements of Car ------------");
        String[] Car = {"Volvo","BMW","Audi","McLaren"};
//        Iterate Array through the loop
        for(int i=0;i<Car.length;i++)
        {
            System.out.println(Car[i]);
        }
    }
}
