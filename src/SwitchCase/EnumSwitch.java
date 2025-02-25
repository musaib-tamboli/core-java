
package SwitchCase;
enum Level {
    Easy, Medium, Hard;
}

public class EnumSwitch {
    public static void main(String[] args) {
        Level l = Level.Medium;

        switch (l) {
            case Easy   -> System.out.println("Level is Easy");
            case Medium -> System.out.println("Level is Medium");
            case Hard   -> System.out.println("Level is Hard");
        }
    }
}
