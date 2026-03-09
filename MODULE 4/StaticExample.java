class Counter {
    static int count = 0;
    Counter() {
        count++;
    }
    static void display() {
        System.out.println(count);
    }
}
public class StaticExample {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        Counter.display();
    }
}