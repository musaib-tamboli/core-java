public class Variable_Datatype
{
/*
Variables In JAVA :-
1. Variables are containers for storing data values.
2. A variable is created the moment you first assign a value to it.
3. Variables Name should be meaningful and should not be a keyword.
4. Variables Cannot Start with Number.
5. Variables Should Starts with Lowercase or Uppercase , $ (Dollar) or  _ (UnderScore).
6. Variables are case sensitive.
7. Variables can be of any data type.
*/

/*
Data Types In JAVA :-
1. Primitive Data Types :-
   /*
    * byte :- stores whole numbers from -128 to 127
    * short :- stores whole numbers from -32,768 to 32,767
    * int :- stores whole numbers from -2,147,483,648 to 2,147,483,647
    * long :- stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    * float :- stores single-precision floating-point numbers (numbers with decimals)
    * double :- stores double-precision floating-point numbers (numbers with decimals)
    * boolean :- stores true or false values
    * char :- stores a single character
   */



        public static void main(String[] args)
        {
            int a = 10;
            float f = 10.5f;
            String str = "Hello World";
            double db = 10.5;
            char ch = 'a';
            boolean b = true;
            System.out.println("Integer Value is  " + a);
            System.out.println("Float Value is  " + f);
            System.out.println("String Vlaue is  " + str);
            System.out.println("Double Value is  " + db);
            System.out.println("Char Value is  " + ch);
            System.out.println("Boolean Value is  " + b);

        }


}
