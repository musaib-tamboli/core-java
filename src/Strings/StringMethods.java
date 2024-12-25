package Strings;


public class StringMethods {
    public static void main(String[] args) {
        // 1. length()
        String str1 = "hello";
        System.out.println("Length: " + str1.length()); // 5

        // 2. charAt(int index)
        System.out.println("Character at index 1: " + str1.charAt(1)); // e

        // 3. concat(String str)
        String str2 = " world";
        System.out.println("Concatenation: " + str1.concat(str2)); // hello world

        // 4. equals(Object obj)
        System.out.println("Equals: " + str1.equals("hello")); // true

        // 5. equalsIgnoreCase(String str)
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("HELLO")); // true

        // 6. compareTo(String str)
        System.out.println("Compare To: " + str1.compareTo("world")); // Negative value

        // 7. compareToIgnoreCase(String str)
        System.out.println("Compare To Ignore Case: " + str1.compareToIgnoreCase("HELLO")); // 0

        // 8. indexOf(int ch)
        System.out.println("Index of 'e': " + str1.indexOf('e')); // 1

        // 9. indexOf(String str)
        System.out.println("Index of 'world': " + "hello world".indexOf("world")); // 6

        // 10. lastIndexOf(int ch)
        System.out.println("Last Index of 'l': " + str1.lastIndexOf('l')); // 3

        // 11. lastIndexOf(String str)
        System.out.println("Last Index of 'o': " + "hello world".lastIndexOf("o")); // 7

        // 12. contains(CharSequence cs)
        System.out.println("Contains 'world': " + "hello world".contains("world")); // true

        // 13. substring(int beginIndex)
        System.out.println("Substring from index 2: " + str1.substring(2)); // llo

        // 14. substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 1 to 4: " + str1.substring(1, 4)); // ell

        // 15. replace(char oldChar, char newChar)
        System.out.println("Replace 'l' with 'p': " + str1.replace('l', 'p')); // heppo

        // 16. replace(CharSequence target, CharSequence replacement)
        System.out.println("Replace 'world' with 'Java': " + "hello world".replace("world", "Java")); // hello Java

        // 17. replaceAll(String regex, String replacement)
        System.out.println("Replace all 'o' with 'a': " + "hello world".replaceAll("o", "a")); // hella warld

        // 18. toUpperCase()
        System.out.println("Uppercase: " + str1.toUpperCase()); // HELLO

        // 19. toLowerCase()
        String str3 = "HELLO";
        System.out.println("Lowercase: " + str3.toLowerCase()); // hello

        // 20. trim()
        String str4 = "  hello  ";
        System.out.println("Trimmed: " + str4.trim()); // hello

        // 21. split(String regex)
        String[] splitStr = "hello world".split(" ");
        System.out.println("Split: " + java.util.Arrays.toString(splitStr)); // [hello, world]

        // 22. join(CharSequence delimiter, CharSequence... elements)
        System.out.println("Join: " + String.join(", ", "a", "b", "c")); // a, b, c

        // 23. String.format(String format, Object... args)
        System.out.println("Formatted String: " + String.format("Name: %s, Age: %d", "John", 25)); // Name: John, Age: 25

        // 24. isEmpty()
        String str5 = "";
        System.out.println("Is Empty: " + str5.isEmpty()); // true

        // 25. isBlank()
        String str6 = "  ";
        System.out.println("Is Blank: " + str6.isBlank()); // true

        // 26. matches(String regex)
        System.out.println("Matches \\w+: " + "hello123".matches("\\w+")); // true

        // 27. getBytes()
        byte[] byteArray = str1.getBytes();
        System.out.println("Get Bytes: " + java.util.Arrays.toString(byteArray)); // [104, 101, 108, 108, 111]

        // 28. toCharArray()
        char[] charArray = str1.toCharArray();
        System.out.println("To Char Array: " + java.util.Arrays.toString(charArray)); // [h, e, l, l, o]

        // 29. intern()
        String str7 = new String("hello").intern();
        System.out.println("Interned: " + str7); // hello
    }
}

