package Strings;

public class StringBuilderEx
{
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str.capacity()); // its default capacity is also 16

//        StringBuilder have same methods Like StringBuffer

//        1. append() :: Adds the Specified String at the end of the existing String
        str.append(" Royal");
        System.out.println(str); // Hello Royal

//        2. insert() :: inserts the specified string at Specified Position
        str.insert(6,"Company");
        System.out.println(str); // Hello CompanyRoyal
//        3. replace() :: replace the specified substring with given string
        str.replace(6,13,"Musaib");
        System.out.println(str); // Hello MusaibRoyal

//        4. delete() :: Removes the characters in the specified range
        str.delete(6,12);
        System.out.println(str);// Hello Royal

//        5. reverse() :: Reveres the given String
//        str.reverse();
//        System.out.println(str);

//        6. length() :: Return the length of Sequence
        System.out.println(str.length()); // 11

//        7. capacity() :: returns the Current Capacity
        System.out.println(str.capacity()); // 21

//        8. charAt() :: returns the character at the specified index
        System.out.println(str.charAt(4)); // o

//        9. substring() :: returns new 'String' that contain new Subsequence of character.
        String strSub = str.substring(5,11);
        System.out.println(strSub); //  Royal

//        10. deleteCharAt() :: Deletes the character at the index specified by the location
        str.deleteCharAt(3);
        System.out.println(str); // Helo Royal



    }
}
