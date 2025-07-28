/**
 * Implements the Runnable interface to define the task that our threads will execute.
 */
class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        // FIX: Used 'this.' to refer to the instance variable 'name'.
        this.name = name;
    }

    @Override
    public void run() {
        // Added a loop to make the thread run for a little longer
        // and print its priority to see the effect.
        for (int i = 0; i < 5; i++) {
            System.out.println(
                this.name + " is running (Priority: " + Thread.currentThread().getPriority() + ")"
            );
            try {
                // A short sleep can make it easier to see threads interleaving.
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(this.name + " was interrupted.");
                Thread.currentThread().interrupt(); // Restore the interrupted status
            }
        }
        System.out.println("✅ " + this.name + " has finished.");
    }
}

public class ThreadAndPriority { // Renamed from ThredAndPriority for correct spelling
    public static void main(String[] args) {
        // Create three threads with our custom Runnable task
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));

        // --- DEMONSTRATING THREAD PRIORITY ---
        // Set different priorities for each thread.
        // Note: The OS scheduler is not guaranteed to strictly follow these priorities.
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority = 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority = 5 (Default)
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority = 10

        System.out.println("Starting threads...");

        // FIX: You must call the start() method to begin thread execution.
        // Calling start() invokes the run() method in a new thread of execution.
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Main thread has finished starting other threads.");
    }
}