package SimpleThread_Watki.ConsumerProduce;


import java.util.Scanner;

public class Processor {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread running");
            wait();
            System.out.println("Resumed");
        }
    }

    public void consume() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this) {
            System.out.println(" Waiting foe Enter");
            sc.nextLine();
            System.out.println("Enter pressed");
            notify();
        }
    }
}
