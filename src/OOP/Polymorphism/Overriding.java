package OOP.Polymorphism;
class Color {
    void paint() {
        System.out.println("I'm Painting.");
    }
}

class RedPaint extends Color {
    void paint() {
        System.out.println("I'm Painting with Red color.");
    }
}

class BluePaint extends Color {
    void paint() {
        System.out.println("I'm Painting with Blue color.");
    }
}


public class Overriding {

    public static void main(String[] args) {
        Color c;
        c = new RedPaint();
        c.paint();
        c = new BluePaint();
        c.paint();
    }
}

//Child classes have overridden the method of attribute parent class.
// Hence, when we create object of child class, then the method inside the child class is executed because it has more priority .
