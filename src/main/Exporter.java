package main;
import java.util.concurrent.atomic.AtomicInteger;

public class Exporter implements Runnable{
    
    final Monitor monitor;
    String threadName;
    private static final AtomicInteger counter = new AtomicInteger(0);
    private final int max;

    public Exporter(Monitor monitor, int cantidad) {
        this.monitor = monitor;
        max = cantidad;
    }

    @Override
    public void run() {
        threadName = Thread.currentThread().getName();
        System.out.printf("%s inicializado\n", threadName);

        while (!monitor.isReadyToFinish() && counter.get() < max){
            monitor.fireTransition(15);
            monitor.fireTransition(16);
            counter.incrementAndGet();
        }
        monitor.finish();
    }

    public int getContador(){
        return counter.get();
    }
}
