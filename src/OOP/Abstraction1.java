package OOP;

abstract class Animal // This is Abstract Class
{
//   1. We Cannot Create Objects of Abstract Class

//  Abstract Class can Contain Regular or abstract Methods
    abstract void makeSound(); //  Abstract Method is Declare Here & Body is Not written Here # Body Is Written in Subclass

    public void sleep() // This is Regular Method Define In Abstract Class with Its Body
    {
        System.out.println("This Animal is Sleeping ");
    }
}
class Dog extends Animal
{
//    In Subclass of Abstract we Must write Method Body for all Methods which are declared in Abstract Class
//    If we don't Write Method Body of all methods in subclass , Then that Class will be Abstract Class
    @Override
    void makeSound()
    {
        System.out.println("The Dog Barks ");
    }
}
class Cat  extends Animal
{
    @Override
    void makeSound() {
        System.out.println("The Cat Meow");
    }
}
public class Abstraction1
{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myDog.sleep();

        myCat.makeSound();
        myCat.sleep();

//        This line of code demonstrates the concept of polymorphism in Java.
//        It declares a variable of type Animal and initializes it with an instance of the Dog class.
//        Even though myDog is of type Animal, it can call the methods implemented by the Dog class due to polymorphism.


    }
}
