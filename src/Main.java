import thread.MyThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        MyThread myThread1 = new MyThread();
        myThread1.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());
    }
}