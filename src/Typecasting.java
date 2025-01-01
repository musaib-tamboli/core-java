
/*
Typecasting In Java
1. It is used to convert one data type to another data type.
2. There are TWO types of typecasting:
    a. Implicit Typecasting (Smaller to Larger)
    b. Explicit Typecasting (Larger to Smaller)
3. Implicit Typecasting: It is done automatically by the compiler.
      byte -> short -> char -> int -> long -> float -> double
4. Explicit Typecasting: It is done manually by the programmer.
      double -> float -> long -> int -> char -> short -> byte
*/

public class Typecasting
{
    public static void main(String args[])
    {
        // Implicit typecasting
        int a = 10;
        float b = a;
        System.out.println("Before Converstion: " + a);
        System.out.println("After Conversion: " + b);

        System.out.println("==================================");
        // Explicit typecasting
        float f = 10.5f;
        int i = (int)f;
        System.out.println("Before Conversion: " + f);
        System.out.println("After Conversion: " + i);
    }
}

