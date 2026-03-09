public class AgeExceptionExample {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age less than 18");
        } else {
            System.out.println("Valid Age");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}