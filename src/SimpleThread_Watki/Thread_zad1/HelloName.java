package SimpleThread_Watki.Thread_zad1;

public class HelloName implements Runnable {
    private String _name;

    public HelloName(String name) {
        this._name = name;
    }

    @Override
    public void run() {

        //  String[] names = new String []{"Ola","Adam","Zosia","Adam","Kasia"};

        for (int i = 0; i < 10; i++) {
            System.out.printf("Witaj %s \n", _name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Bye");
    }
}
