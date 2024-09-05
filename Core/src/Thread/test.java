package Thread;

public class test {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Two threads incrementing the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}