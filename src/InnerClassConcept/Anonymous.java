package InnerClassConcept;
abstract class Sample
{
    abstract void display();
}

public class Anonymous {
    public static void main(String[] args) {
        Sample s = new Sample() {
            @Override
            void display() {
                System.out.println("This is Anonymous InnerClass");
            }
        };
        s.display();

    }
}
