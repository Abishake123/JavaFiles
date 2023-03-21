package MultiThreading;

public class Multithreading implements Runnable {

    @Override
    public void run() {

        try {Thread.sleep(1000);} 
        catch (InterruptedException e) {e.printStackTrace();}
        
        
        System.out.println("Thread");
        
        
    }

    


    
}
