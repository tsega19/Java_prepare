package Thread;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable is running");
    }
}
class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start(); // Start the thread
    }
}