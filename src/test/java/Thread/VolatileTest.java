package Thread;

public class VolatileTest extends Thread{
    public volatile boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning){
        }
        System.out.println("Ended");
    }

    public static void main(String[] args) {
        VolatileTest thread = new VolatileTest();
        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.isRunning = false;
        System.out.println("Changed to false");
    }
}
