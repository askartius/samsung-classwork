package thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println(getName());
            try {
                sleep(3 * 1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}