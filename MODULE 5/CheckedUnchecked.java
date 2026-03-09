import java.io.*;
public class CheckedUnchecked {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception");
        }
        try {
            FileReader f = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception");
        }
    }
}