class Test {
    final int x = 10;
    final void show() {
        System.out.println("Final method");
    }
}
public class FinalExample {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        System.out.println(t.x);
    }
}