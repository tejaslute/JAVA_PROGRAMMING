class NumberPrinter extends Thread {
    private final int start;
    private final int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                // Introducing a short delay for demonstration purposes
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        // Creating two threads
        Thread thread1 = new NumberPrinter(1, 5);
        Thread thread2 = new NumberPrinter(6, 10);

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}


