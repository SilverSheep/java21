package pl.mbaranowski._9_virtual_threads;

import java.util.stream.IntStream;

public class New {
    static int THREADS_NO = 100_000;
    public static void main(String[] args) {
        IntStream.range(0, THREADS_NO)
                .forEach(i -> Thread.ofVirtual().start(new Task()));
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
