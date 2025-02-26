//package OOP.Inheritance;

// The  child Class having more than 1 Parent Class Then it is Known as Multiple OOP.Inheritance

interface Animal
{
    public void sound();
}
interface Pet
{
    public void play();
}
class Dog implements Animal,Pet
{
    @Override
    public void sound()
    {
        System.out.println("The Dog Barks");
    }

    @Override
    public void play() {
        System.out.println("The Dog Can Play");
    }
}
class Multiple
{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.play();
    }
}