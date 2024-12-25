/*
* When to Use Enums
* Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
*
* */
enum  Department
{
    Computer,
    Automobile,
    Mechaniacal,
    Eelctronics,
}
public class Enums
{
//    We Can Create Enum inside the Class also
    enum Level
{
    LOW,
    MEDIUM,
    HIGH
}
    public static void main(String[] args) {
        Department CO = Department.Computer ;
        System.out.println("I am "+CO+" Engineer");

//        Enum Inside Class Example
    Level high =Level.HIGH;
        System.out.println("The temprature is Too "+high);

//        We Can Iterate Loop Through Enums
//        Using for loop
        for(Department dept : Department.values())
        {
            System.out.println(dept);
        }
    }
}
