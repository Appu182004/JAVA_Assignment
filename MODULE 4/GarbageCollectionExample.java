class Test {
    protected void finalize() {
        System.out.println("Garbage Collected");
    }
}
public class GarbageCollectionExample {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1 = null;
        t2 = null;
        System.gc();
    }
}