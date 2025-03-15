package Static;

public class StaticMethod
{
    public static void display()
    {
        System.out.println("I am Static Method ");
    }

    public static void main(String[] args) {
//        Static Method Does Not need to Create Instance of Class for calling static method

        display();// Calling Method Without Creating Instance of class
        StaticMethod.display();// Can be Called Using Class name , ClassName.staticMethod();
//        StaticMethod s = new StaticMethod();
//        s.display();

    }
}
