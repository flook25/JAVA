// You might need to add your package declaration back here if you use it
// package day05;

/**
 * A simple runnable task that prints its name.
 * This class is needed for the main example to work.
 *
 * DEFINED ONLY ONCE.
 */
class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("🚀 " + this.name + " has started its task in the background.");
        try {
            // Simulate some work
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("✅ " + this.name + " has finished.");
    }
}


/**
 * The main class for this file.
 *
 * DEFINED ONLY ONCE.
 */
public class ThreadAndSleep {
    public static void main(String[] args) {
        // Create and start a new thread that will run in the background
        Thread thread1 = new Thread(new MyRunnable("Background-Thread-1"));
        thread1.start();

        System.out.println("Main thread is starting a task (e.g., a download progress bar).");

        try {
            // This loop runs in the 'main' thread
            StringBuilder progressBar = new StringBuilder("[");

            for (int i = 1; i <= 100; i++) {
                // Add a piece to the progress bar every 2 iterations
                if (i % 2 == 0) {
                    progressBar.append("=");
                }

                String display = String.format("\rLoading... %d%% %-50s", i, progressBar.toString() + "]");
                System.out.print(display);

                // Thread.sleep() pauses the CURRENT thread
                Thread.sleep(50);
            }

            // Add a final newline character
            System.out.println();
            System.out.println("Main thread's task is complete.");

            // Wait for the background thread to finish before exiting the program
            thread1.join();

        } catch (InterruptedException e) {
            // This exception is thrown if another thread interrupts this one while it's sleeping.
            System.out.println("Main thread was interrupted.");
            e.printStackTrace();
        }

        System.out.println("All threads have finished. Program is exiting.");
    }
}

// DO NOT add the class definitions again down here.