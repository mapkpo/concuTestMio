package main;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        int maxFiresForT0 = 200; // Límite máximo de disparos para la transición 0
        Policy policy = new Policy(false);   //true es equitativo, false es 8020

        int creatorThreads = 2;
        int loaderThreadsLeft = 2;
        int loaderThreadsRight = 2;
        int adjustersThreadsLeft = 2;
        int adjustersThreadsRight = 2;
        int trimmersThreads = 2;
        int exportersThreads = 2;

        List<Integer> creator = new ArrayList();
        creator.add(0);
        List<Integer> LL = new ArrayList();
        LL.add(1);
        LL.add(3);
        List<Integer> LR = new ArrayList();
        LR.add(2);
        LR.add(4);
        List<Integer> AL = new ArrayList();
        AL.add(5);
        AL.add(7);
        AL.add(9);
        List<Integer> AR = new ArrayList();
        AR.add(6);
        AR.add(8);
        AR.add(10);
        List<Integer> T = new ArrayList();
        T.add(11);
        T.add(12);
        T.add(13);
        T.add(14);
        List<Integer> E = new ArrayList();
        E.add(15);
        E.add(16);

        Rdp rdp = new Rdp(maxFiresForT0);
        Monitor monitor = new Monitor(rdp, policy);

        Threads[] creators = new Threads[creatorThreads];
        Threads[] loadersLeft = new Threads[loaderThreadsLeft];
        Threads[] loadersRight = new Threads[loaderThreadsRight];
        Threads[] adjustersLeft = new Threads[adjustersThreadsLeft];
        Threads[] adjustersRight = new Threads[adjustersThreadsRight];
        Threads[] trimmers = new Threads[trimmersThreads];
        Threads[] exporters = new Threads[exportersThreads];

        for (int i = 0; i < creatorThreads; i++){
            creators[i] = new Threads(creator, monitor);
            creators[i].setName("Creator " + i);
        }

        for (int i = 0; i < loaderThreadsLeft; i++){
            loadersLeft[i] = new Threads(LL, monitor);
            loadersLeft[i].setName("Loader left " + i);
        }

        for (int i = 0; i < loaderThreadsRight; i++){
            loadersRight[i] = new Threads(LR, monitor);
            loadersRight[i].setName("Loader right " + i);
        }

        for (int i = 0; i < adjustersThreadsLeft; i++){
            adjustersLeft[i] = new Threads(AL, monitor);
            adjustersLeft[i].setName("Adjuster left " + i);
        }

        for (int i = 0; i < adjustersThreadsRight; i++){
            adjustersRight[i] = new Threads(AR, monitor);
            adjustersRight[i].setName("Adjuster right " + i);
        }

        for (int i = 0; i < trimmersThreads; i++){
            trimmers[i] = new Threads(T, monitor);
            trimmers[i].setName("Trimmers " + i);
        }

        for (int i = 0; i < exportersThreads; i++){
            exporters[i] = new Threads(E, monitor);
            exporters[i].setName("Trimmers " + i);
        }

        Log logger = new Log(creators, loadersLeft, loadersRight, adjustersLeft, adjustersRight, trimmers, exporters, monitor);
        new Thread(logger).start();

        for (int i = 0; i < creatorThreads; i++){
            creators[i].start();
        }

        for (int i = 0; i < loaderThreadsLeft; i++){
            loadersLeft[i].start();
        }

        for (int i = 0; i < loaderThreadsRight; i++){
            loadersRight[i].start();
        }

        for (int i = 0; i < adjustersThreadsLeft; i++){
            adjustersLeft[i].start();
        }

        for (int i = 0; i < adjustersThreadsRight; i++){
            adjustersRight[i].start();
        }

        for (int i = 0; i < trimmersThreads; i++){
            trimmers[i].start();
        }

        for (int i = 0; i < exportersThreads; i++){
            exporters[i].start();
        }


    }

}