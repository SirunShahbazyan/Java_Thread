package Thread;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread t1 = new CounterThread("T1", counter);
        CounterThread t2 = new CounterThread("T2", counter);
        t1.start();
        t2.start();
    }
}
