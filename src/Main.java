import service.Printer;
import thread.MyThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        Printer printer = new Printer();
        MyThread myThread1 = new MyThread(printer);
        MyThread myThread2 = new MyThread(printer);
        myThread1.start();
        myThread2.start();
//        Thread thread1 = new Thread(new MyRunnable());
//        thread1.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());
    }
}