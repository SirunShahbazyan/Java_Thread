package Thread;

public class ThreadTest2 {
    static int[] array = {-4, 8, 58, 23, 147, 5968, 2, 10};
    static int max = array[0];

    public static void main(String[] args) {
        Thread maxThread = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i < array.length; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (max < array[i])
                        max = array[i];
                }
            }
        });

        maxThread.start();
        while (maxThread.isAlive()) {
        }
        System.out.println(max);
    }
}