package Strings;

public class StringEx
{
    public static void main(String[] args) {
//      There are 2  ways to create String
//      1.  By Using String Literals
        String str = "HelloWorld";
        System.out.println(str);

//       2. By using 'new' Keyword
        String str1 = new String(" Hello Musaib");
        System.out.println(str1);

//        '+' Operator is Used to Concat the String
        System.out.println(str+str1+" Tamboli");

//        To Calculate length of String use 'length()' method
        System.out.println("The Length of str is "+str.length());

// Getting a character at a specific index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

// Extracting a substring
        String str2 = "Java Programming";
        System.out.println("Substring from str2: " + str2.substring(5, 16));

// Checking if two strings are equal
        System.out.println("str1 equals str2: " + str1.equals(str2));

//  Convert into Uppercase
        System.out.println("str2 in Upper Case :: "+str2.toUpperCase());

//  Convert into Lowercase
        System.out.println("str2 in Lower Case :: "+str2.toLowerCase());

// Replacing characters in a string
        System.out.println("Replaced str2: " + str2.replace("Java", "Python"));

// Index of Specific Character
        System.out.println("Index of 'e' is "+"hello".indexOf('e'));

//  Last Index of String
        System.out.println("Last Index of 'hello' is "+"hello world".lastIndexOf('o'));

// Contain method
        String a = "       Hello World       ";
        System.out.println("String contain 'World' "+a.contains("World"));

//  Trim the String
        System.out.println("Before using  trim() :: " + a);
        System.out.println("Trim String :: "+a.trim()); // trim() 	Removes leading and trailing whitespace
    }
}

