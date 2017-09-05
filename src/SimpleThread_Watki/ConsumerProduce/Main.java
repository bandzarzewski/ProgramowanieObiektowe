package SimpleThread_Watki.ConsumerProduce;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Processor proc = new Processor(); // Pierwszy krok tworzymy obiekt klasy na ktorej pracujemy
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();


    }
}
