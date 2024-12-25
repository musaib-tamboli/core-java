//package Loops;
import java.util.*;
public class Forloop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for Multiplication Table :: ");
        int num = sc.nextInt();
        for(int i=1; i<=10;i++)
        {
            int mul = num*i;
            System.out.println(mul);
        }

//        for(int i=0; i<=10;++i)
//        {
//            System.out.println(i);
//        }
    }
}
