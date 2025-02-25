package Enums;
// This is Apply if-else  & switch case on Enums
enum level
{
    Hard,
    Medium,
    Easy
}
// We Can use if-else & Switch Case on Enums
public class EnumCondi
{
    public static void main(String[] args) {
        level l =  level.Medium;
//        System.out.println("========== if-else Statement ==========");
//        System.out.println(l);
//        if (level.Easy == l)
//        {
//            System.out.println("Level is Very : "+l);
//        }
//        else if (level.Hard == l)
//        {
//            System.out.println("Level is Very : "+l);
//        }
//        else
//        {
//            System.out.println("Level is "+l);
//        }
        System.out.println("========== Switch Case ==========");
//        switch(l)
//        {
//            case Easy:
//                System.out.println("Level is "+l);
//                break;
//            case Medium:
//                System.out.println("Level is "+l);
//            break;
//            case Hard:
//                System.out.println("Level is "+l);
//                break;
//            default:
//                System.out.println("Invalid ");
//        }


        switch (l)
        {
            case Easy ->  System.out.println("Level is "+l);
            case Hard ->  System.out.println("Level is "+l);
            case Medium ->  System.out.println("Level is "+l);
        }

    }
}
