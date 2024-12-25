import java.util.*;
public class Input
{
    /*
Taking Input from the user:
1. To Take input from the user we use Scanner class.
2. Scanner class is present in java.util package.
3. Scanner class is used to take input from the user.
4. Scanner Class is use to take different types of input from the user.
5. Scanner class has many methods to take input from the user.
6. Scanner class has nextInt(), nextFloat(), nextLong(), nextDouble(), next(), nextLine() methods.
7. nextInt() method is used to take integer input from the user.
8. nextFloat() method is used to take float input from the user.
9. nextLong() method is used to take long input from the user.
10. nextDouble() method is used to take double input from the user.
11. next() method is used to take String input from the user.
12. nextLine() method is used to take String input from the user.

*/

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Two Numbers :: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum of Two Numbers is :: "+(a+b));
        }

}
