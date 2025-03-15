package LambdaExpression;

// Functional Interface with a single abstract method
@FunctionalInterface
interface A {
    int add(int a, int b); // Abstract method to add two numbers
}

public class LambdaEx1 {
    public static void main(String[] args) {
        // Implementing the add() method using a Lambda Expression
        A l1 = ( a,  b) -> a + b; // If Lambda Expression have only one Statement in Body then their is no need to use 'return' keyword
        // Adding two numbers and returning the result


        // Calling the add() method using lambda expression and printing the result
        System.out.println("Addition = " + l1.add(10, 30)); // Output: Addition = 40
    }
}
