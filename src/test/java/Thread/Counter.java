package Thread;


public class Counter {

    public boolean first = true;
    public synchronized void count(String name){
        for (int i = 1; i < 11; i++) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == 5 && first){
                first = false;
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if (i == 10 && !first){
                notify();
            }
        }
    }


}
