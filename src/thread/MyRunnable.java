package thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread-0");
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}