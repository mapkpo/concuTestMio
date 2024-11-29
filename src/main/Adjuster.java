package main;

public class Adjuster implements Runnable{
    final Monitor monitor;
    String threadName;
    private int counter;

    public Adjuster(Monitor monitor) {
        this.monitor = monitor;
        counter = 0;
    }

    @Override
    public void run() {
        threadName = Thread.currentThread().getName();
        System.out.printf("%s inicializado\n", threadName);




            counter++;
    }
    

    public int getCounter(){
        return counter;
    }
}
