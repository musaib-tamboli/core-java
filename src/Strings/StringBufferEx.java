package Strings;

public class StringBufferEx
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // Empty StringBuffer with initial size 16
        System.out.println(sb.capacity()); // capacity() method returns Capacity.

        StringBuffer sb1 = new StringBuffer("Hello"); // Create StringBuffer with Specified String
        System.out.println("String is :: '"+sb1 +"' & Capacity is :: "+sb1.capacity()); // Capacity is 21 , because initial Capacity + String length i.e 16 + 5 = 21

        StringBuffer sb2 = new StringBuffer(30);// Create StringBuffer with Specified Capacity
        System.out.println("Capacity of 'sb2' is  :: "+sb2.capacity());

//        Methods of StringBuffer

        StringBuffer str = new StringBuffer("Hello");
        System.out.println(str); // Hello

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

//        11. ensureCapacity() :: Ensures capacity is at least equal to the given minimum.




    }
}
