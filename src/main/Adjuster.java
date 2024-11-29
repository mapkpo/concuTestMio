package main;

public class Adjuster implements Runnable{
    final Monitor monitor;
    String threadName;

    public Adjuster(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        threadName = Thread.currentThread().getName();
        System.out.printf("%s inicializado\n", threadName);

        while (!monitor.isReadyToFinish()){
            monitor.fireTransition(5);
            monitor.fireTransition(6);
            monitor.fireTransition(7);
            monitor.fireTransition(8);
            monitor.fireTransition(9);
            monitor.fireTransition(10);
        }
    }
}
