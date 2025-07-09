package day04;

public class MultiThread {
    
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() ->
                System.out.println("Thread" + threadNumber + " is running" )
            );
            thread.start();
        }
    }
}


