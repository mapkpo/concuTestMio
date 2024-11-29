package main;

//import java.util.concurrent.TimeUnit;

public class Trimmer implements Runnable{
    final Monitor monitor;
    String threadName;
    private int counter;

    public Trimmer(Monitor monitor) {
        this.monitor = monitor;
        counter = 0;
    }

    @Override
    public void run() {

        threadName = Thread.currentThread().getName();
        System.out.printf("%s inicializado\n", threadName);

        while (!monitor.isReadyToFinish()){
            //System.out.println(threadName + ": Buscando imagen para recortar.");

            counter++;
        }
    }

    public int getCounter(){
        return counter;
    }
}
