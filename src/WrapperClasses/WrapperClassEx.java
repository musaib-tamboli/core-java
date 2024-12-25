package WrapperClasses;

public class WrapperClassEx
{
    public static void main(String[] args) {

//        Wrapper Class are used to convert Primitive datatype into Corresponding Wrapper Class

        // Autoboxing :: Converting Primitive type to Object i.e int to Integer
        int num = 10;
        System.out.println("Primitive type int  :: "+num);
        Integer boxed = Integer.valueOf(num); // Equivalent to Integer boxed1 = num;
//        Integer boxed1 = num;
//        System.out.println("Wrapper Class Integer :: "+boxed1);
        System.out.println("Wrapper Class Integer :: "+boxed);

        // Unboxing :: Converting Objects into Primitive type i.e Integer to int

        Integer a = 200;
        System.out.println("Wrapper Class Obj :: "+a);
        int b = a; // Equivalent to int b1 = a.intValue();
//        int b1 = a.intValue();
//        System.out.println(b1);
        System.out.println("Primitive Type :: "+b);

    }
}
