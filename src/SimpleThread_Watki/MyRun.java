package SimpleThread_Watki;


public class MyRun implements Runnable {
    private int _id;

    public MyRun(int id) {
        this._id = id;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.printf(" hello from thread %d\n", _id);
            try {
                Thread.sleep(1000); // zatrzymanie czasu
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
