import Arithmatic.Addition;
// * means all Files in Packages, Not Folders
public class PacakageEx
{
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println("Sum = "+a.addNum(10,20,30,40));
        System.out.println("Sum = "+a.addNum(10,20,30));

    }
}
