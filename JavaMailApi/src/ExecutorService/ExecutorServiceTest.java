package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

    public void threadController() {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task1 = new Runnable() {

            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName());
                System.out.println("My task 1 is started");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("My task 1 ends");

            }
        };

        Runnable task2 = new Runnable() {

            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName());
                System.out.println("My task 2 is started");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("My task 2 ends");

            }
        };

        Runnable task3 = new Runnable() {

            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName());
                System.out.println("My task 3 is started");

                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("My task 3 ends");

            }
        };

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();

    }

}
