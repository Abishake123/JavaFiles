import MultiThreading.MultiThreading;

public class App {
    public static void main(String[] args){
        
        MultiThreading multiThreading = new MultiThreading();


        // multiThreading.run();
        // multiThreading.run();

        Thread t1 = new Thread(multiThreading);
        Thread t2 = new Thread(multiThreading);

        t1.start();
        t2.start();



    }
}
