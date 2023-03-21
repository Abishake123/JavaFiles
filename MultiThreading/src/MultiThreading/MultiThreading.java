package MultiThreading;

public class MultiThreading implements Runnable{
    
    @Override
    public void run(){
        // Thread t1 = new Thread();
        try {
            System.out.println("Notice the delay");
            Thread.sleep(5000);
            System.out.println("Thread is running ..");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void add(){
        System.out.println("Adding...");
    }


}
