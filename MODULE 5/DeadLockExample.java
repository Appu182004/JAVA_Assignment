public class DeadLockExample {
    public static void main(String[] args) {
        final String r1 = "Resource1";
        final String r2 = "Resource2";
        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("Thread1 locked r1");
                synchronized (r2) {
                    System.out.println("Thread1 locked r2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread2 locked r2");
                synchronized (r1) {
                    System.out.println("Thread2 locked r1");
                }
            }
        });
        t1.start();
        t2.start();
    }
}