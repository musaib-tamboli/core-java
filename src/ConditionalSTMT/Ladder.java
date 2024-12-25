package ConditionalSTMT;

public class Ladder
{
    public static void main(String args[])
    {
        int score = 95;
        if(score>=90)
        {
            System.out.println("Grade A");
        }
        else if(score>=80)
        {
            System.out.println("Grade B");
        }
        else if(score>=50)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
