public class StaticVar
{
//    When a variable is declared as  static then a single copy of the variable is created and shared among all objects at the class level
    public int a  = 10; // Non static Variable
    public static int b ; // Static Variable
    public void show()
    {
        System.out.println("a =  "+a);
    }
    public void showB()
    {
        System.out.println("b = "+b);
    }

    public static void main(String[] args) {
        StaticVar s = new StaticVar();
        s.show();

        StaticVar s1 = new StaticVar();
        s1.a= 100; // Variable 'a' is Modified to 100 , Using with new Object 's1'
        s1.show();

//        Creating Instance for Static Variable
        StaticVar s2 = new StaticVar();
        StaticVar.b= 500; // Static Varible are Accessed by Class name , Rather than Instance of Class
//        s2.showB(); // Before Modifying value of b = 500

        StaticVar s3 = new StaticVar();
        StaticVar.b=2000;
        s3.showB();
        s2.showB(); // After Modifying value of b = 2000

        System.out.println("the Value of b is  "+StaticVar.b);


    }

}
