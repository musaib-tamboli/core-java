public class MemoryAllocation{

    // Instance variable (Heap memory)
    private int instanceVar;

    public static void main(String[] args) {
        // Local variable (Stack memory)
        int localVar = 5;

        // Object creation (Heap memory)
        MemoryAllocation example = new MemoryAllocation();

        // Accessing instance variable
        example.instanceVar = 10;

        // Printing values
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + example.instanceVar);
    }
}
