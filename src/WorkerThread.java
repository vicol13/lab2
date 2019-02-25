public class WorkerThread extends Thread {
    @Override
    public void run() {
        super.run();

        System.out.println("  WorkerThread " + Thread.currentThread().getName());
    }
}
