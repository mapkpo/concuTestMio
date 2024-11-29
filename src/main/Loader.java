package main;

public class Loader implements Runnable{
    final Monitor monitor;
    String threadName;

    public Loader(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        threadName = Thread.currentThread().getName();
        System.out.printf("%s inicializado\n", threadName);

        while (!monitor.isReadyToFinish()){
            monitor.fireTransition(1);
            monitor.fireTransition(2);
            monitor.fireTransition(3);
            monitor.fireTransition(4);
        }
    }
}
