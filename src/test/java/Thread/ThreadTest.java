package Thread;

public class ThreadTest {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("T1");
        thread1.start();

        MyThread thread2 = new MyThread("T2");
        thread2.start();

        Thread thread3 = new Thread(new MyRunnable("T3"));
        thread3.start();
    }
}
