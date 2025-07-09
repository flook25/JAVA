package day04;

public class ThreadExample {
    public static void main(String[] arge) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running");
            }
        });
        thread1.start();

        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 is running");
            }
        });
        thread2.start();
        



    }
}
