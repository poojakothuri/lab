import java.io.IOException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Simulating ArithmeticException
            int result = divide(10, 0);

            // Simulating NullPointerException
            String str = null;
            int length = str.length();

            // Simulating ArrayIndexOutOfBoundsException
            int[] array = {1, 2, 3};
            int element = array[3];

            // Simulating IOException
            simulateIOException();

            // This statement will not be reached if an exception occurs above
            System.out.println("Application executed successfully.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            System.out.println("This block will be executed regardless of exceptions.");
        }
    }

    private static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    private static void simulateIOException() throws IOException {
        throw new IOException("Simulated IOException");
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            System.out.println("This block will be executed regardless of exceptions.");
        }
    }

    private static void readFile(String fileName) throws IOException {
        // Simulating an IOException by attempting to read from a non-existent file
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        // In a real scenario, this code may attempt to read data from the file
        // Here, it is just to simulate an IOException
    }
}
