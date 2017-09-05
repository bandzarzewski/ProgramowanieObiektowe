package SimpleThread_Watki.Thread_zad1;


public class RunThread {
    public static void main(String[] args) {
        Runnable[] runner = new Runnable[10];
        Thread[] threads = new Thread[10];
        runner[0] = new HelloName("Asia");
        runner[1] = new HelloName("Zosia");
        runner[2] = new HelloName("Marysia");
        runner[3] = new HelloName("Ola");
        runner[4] = new HelloName("Pawel");
        runner[5] = new HelloName("Tomek");
        runner[6] = new HelloName("Robert");
        runner[7] = new HelloName("Kasia");
        runner[8] = new HelloName("Marysia");
        runner[9] = new HelloName("Zuza");


        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runner[i]);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

    }
}
