class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
public class CustomException {
    static void check(int age) throws MyException {
        if (age < 18)
            throw new MyException("Not Eligible");
        else
            System.out.println("Eligible");
    }
    public static void main(String[] args) {
        try {
            check(16);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}