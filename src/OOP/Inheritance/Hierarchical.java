package OOP.Inheritance;

class Animal
{
    public void eat()
    {
        System.out.println("Animal Eats Food ");
    }
}
class Cat extends Animal
{
    public void meow()
    {
        System.out.println("The Cat meows");
    }
}
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("The Dog barks ");
    }
}
class Goat extends Animal
{
    public void maee()
    {
        System.out.println("The Goat Maee");
    }
}

public class Hierarchical
{
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();

        Goat g = new Goat();
        g.eat();
        g.maee();

//        In Hierarchical OOP.Inheritance , the Subclass Only Access to Superclass
    }
}
