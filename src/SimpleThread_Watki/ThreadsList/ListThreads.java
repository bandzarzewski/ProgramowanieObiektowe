//package SimpleThread_Watki.ThreadsList;
//
//
//import org.omg.CORBA.Object;
//
//import java.util.Random;
//
//public class ListThreads implements Runnable {
//    private Random rand = new Random();
//    private Object stageOneLocker = new Object();
//    private Object stageTwoLocker = new Object();
//
//    private java.lang.Object stageOneLocker = new java.lang.Object();
//    private java.lang.Object stageTwoLocker = new java.lang.Object();
//
//
//    public void stageOne() throws InterruptedException {
//
//        synchronized
//        _stageOne.add(rand.nextInt());
//        Thread.sleep(1);
//    }
//
//    public synchronized void stageTwo() throws InterruptedException {
//        _stageTwo.add(rand.nextInt());
//        Thread.sleep(1);
//    }
//
//    public void process() throws InterruptedException {
//        for (int i = 0; i < 1000; i++) {
//            stageOne();
//            stageTwo();
//        }
//    }
//
//    @Override
//    public void run() {
//        try {
//            process();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
