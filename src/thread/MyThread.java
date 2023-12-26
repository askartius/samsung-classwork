package thread;

import service.Printer;

public class MyThread extends Thread {
    private Printer printer;

    public MyThread(Printer printer) {
        this.printer = printer;
    }
    @Override
    public void run() {
        while (true) {
//            System.out.println(getName());
//            printer.printName(getName());
            /*try {
                sleep(3 * 1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }*/
            synchronized (printer) {
                printer.notify();

                try {
                    printer.wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }

                printer.printName(getName());
            }
        }
    }
}