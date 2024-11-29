package main;

public class Trimmer implements Runnable{
    final Monitor monitor;
    String threadName;

    public Trimmer(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {

        threadName = Thread.currentThread().getName();
        System.out.printf("%s inicializado\n", threadName);

        while (!monitor.isReadyToFinish()){
            monitor.fireTransition(11);
            monitor.fireTransition(12);
            monitor.fireTransition(13);
            monitor.fireTransition(14);
        }
    }
}
