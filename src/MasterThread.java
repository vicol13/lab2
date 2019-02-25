import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MasterThread extends Thread{
    @Override
    public void run() {
        super.run();

        System.out.println("Master thread" + Thread.currentThread().getName());

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new WorkerThread());
        service.submit(new WorkerThread());

        service.shutdown();

    }
}
