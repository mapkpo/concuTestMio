package main;
import java.util.concurrent.Semaphore;

public class Monitor {
    final private Rdp petri;
    final private Semaphore mutex;
  
    private boolean allInvariantsCompleted = false; //bandera para parar hilos
    long startTime;
    long endTime;
   

    public Monitor(Policy _politic){
        petri = new Rdp();
        mutex = new Semaphore(1, true);
        startTime = System.currentTimeMillis();
    }

    /* Tries to acquire the mutex. */
    private void getMutex() {
        try{
            mutex.acquire();
        } catch (InterruptedException e){
            System.out.println("Monitor: interrupted while trying to acquire mutex: " + e);
        }
    }


    public void fireTransition(int t){

    }

    public boolean isReadyToFinish(){
        return allInvariantsCompleted;
    }

    public String getSecuence(){
        return petri.getSequence();
    }

    public void finish(){
        allInvariantsCompleted = true;
        getMutex();
        //System.out.println("Programa finalizado con: " + getBufferExported() + " invariantes");
        petri.printCounter();
        mutex.release();
        //System.out.print(petri.getSecuencia());
    }
}
