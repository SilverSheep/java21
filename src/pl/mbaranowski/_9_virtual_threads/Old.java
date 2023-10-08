package pl.mbaranowski._9_virtual_threads;

import java.util.stream.IntStream;

public class Old {
    static int THREADS_NO = 100_000;

    public static void main(String[] args) {
        IntStream.range(0, THREADS_NO)
                .forEach(i -> new Thread(new Task()).start());
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            try {
                // WARNING! Running this code can be a pain for your hardware and it can stop responding
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
