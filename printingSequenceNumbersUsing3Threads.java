class NumberPrinter {
    private int counter = 1;
    private int N;

    public NumberPrinter(int N) {
        this.N = N;
    }

    public synchronized void printNumber(int threadId) {
        while (counter <= N) {
            // Check if it's this thread's turn to print
            while (counter % 3 != threadId) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (counter <= N) {
                System.out.println("THREAD-" + (threadId + 1) + " : " + counter);
                counter++;
            }
            notifyAll(); // Wake up other threads
        }
    }
}

public class ThreadSequence {
    public static void main(String[] args) {
        int N = 10;
        NumberPrinter numberPrinter = new NumberPrinter(N);

        // Create 3 threads, each responsible for printing numbers
        Thread t1 = new Thread(() -> numberPrinter.printNumber(1 % 3));
        Thread t2 = new Thread(() -> numberPrinter.printNumber(2 % 3));
        Thread t3 = new Thread(() -> numberPrinter.printNumber(0 % 3));

        t1.start();
        t2.start();
        t3.start();
    }
}

/* 
THREAD-1 : 1
THREAD-2 : 2
THREAD-3 : 3
THREAD-1 : 4
THREAD-2 : 5
THREAD-3 : 6
THREAD-1 : 7
THREAD-2 : 8
THREAD-3 : 9
THREAD-1 : 10
*/
