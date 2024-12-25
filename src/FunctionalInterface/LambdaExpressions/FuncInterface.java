package FunctionalInterface.LambdaExpressions;
//
//@FunctionalInterface
//interface Sample
//{
//public void disp();
//}
//
//
//public class FuncInterface
//{
//    public static void main(String[] args) {
//// We Can write function body of interface in Main method
//        Sample s = new Sample() {
//            @Override
//            public void disp() {
//                System.out.println("in disp function");
//            }
//        };
//
//        s.disp();
//
//
//    }
//}
@FunctionalInterface
interface MyFunctionalInterface {
    // Single abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("Default Method in Functional Interface");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static Method in Functional Interface");
    }
}

public class FuncInterface {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface func = () -> System.out.println("Abstract Method Implementation");

        // Calling the abstract method
        func.abstractMethod();

        // Calling the default method
        func.defaultMethod();

        // Calling the static method
        MyFunctionalInterface.staticMethod();
    }
}
