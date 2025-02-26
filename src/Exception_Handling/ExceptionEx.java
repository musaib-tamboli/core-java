package Exception_Handling;
import java.util.*;
import java.io.*;
public class ExceptionEx
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Declare variables
            int i = 0, j = 0;
            int[] arr = new int[5]; // Array with size 5 (Index: 0 to 4)
            arr[4] = 10;

            try {
                // ArithmeticException (Divide by zero)
                j = 14 / i; // Will cause ArithmeticException

                // ArrayIndexOutOfBoundsException (Access invalid index)
                arr[5] = 11; // Out of bounds (valid indices: 0 to 4)

                // NullPointerException
                String str = null;
                System.out.println(str.length()); // Null reference

                // NumberFormatException
                int num = Integer.parseInt("abc"); // Cannot parse "abc" as an integer

                // InputMismatchException (Invalid input type)
                System.out.print("Enter an integer: ");
                int userNumber = scanner.nextInt(); // User enters a non-integer value

                // FileNotFoundException (File does not exist)
                FileReader file = new FileReader("non_existent_file.txt");

                // IOException (General file handling issues)
                BufferedReader br = new BufferedReader(file);
                String line = br.readLine();
                System.out.println(line);
            }

            // Catch Specific Exceptions
            catch (ArithmeticException e) {
                System.out.println("Cannot divide a number by zero.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound.");
            }
            catch (NullPointerException e) {
                System.out.println("Null Pointer Exception: Trying to access an object that is null.");
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Number Format: Cannot convert string to integer.");
            }
            catch (InputMismatchException e) {
                System.out.println("Input Mismatch: Please enter a valid integer.");
            }
            catch (FileNotFoundException e) {
                System.out.println("File Not Found: The specified file does not exist.");
            }
            catch (IOException e) {
                System.out.println("IO Exception: Error while reading the file.");
            }
            catch (Exception e) {
                System.out.println("General Exception: " + e);
            }
            finally {
                System.out.println("Execution Completed. Finally block always executes.");
                scanner.close();
            }

            System.out.println("Result: " + j);
        }
    }
