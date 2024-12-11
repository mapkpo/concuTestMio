package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        int maxFiresForT0 = 2; // Límite máximo de disparos para la transición 0
        Policy policy = new Policy(true);

        int creatorThreads = 1;
        int loaderThreadsLeft = 1;
        int loaderThreadsRight = 1;
        int adjustersThreadsLeft = 1;
        int adjustersThreadsRight = 1;
        int trimmersThreads = 1;
        int exportersThreads = 1;

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

        // for (int i = 0; i < creatorThreads; i++){
        //     creators[i] = new Threads(Arrays.asList(0), monitor);
        //     creators[i].setName("Creator " + i);
        // }

        // for (int i = 0; i < loaderThreadsLeft; i++){
        //     loadersLeft[i] = new Threads(Arrays.asList(1,3), monitor);
        //     loadersLeft[i].setName("Loader left " + i);
        // }

        // for (int i = 0; i < loaderThreadsRight; i++){
        //     loadersRight[i] = new Threads(Arrays.asList(2,4), monitor);
        //     loadersRight[i].setName("Loader right " + i);
        // }

        // for (int i = 0; i < adjustersThreadsLeft; i++){
        //     adjustersLeft[i] = new Threads(Arrays.asList(5,7,9), monitor);
        //     adjustersLeft[i].setName("Adjuster left " + i);
        // }

        // for (int i = 0; i < adjustersThreadsRight; i++){
        //     adjustersRight[i] = new Threads(Arrays.asList(6,8,10), monitor);
        //     adjustersRight[i].setName("Adjuster right " + i);
        // }

        // for (int i = 0; i < trimmersThreads; i++){
        //     trimmers[i] = new Threads(Arrays.asList(11,12,13,14), monitor);
        //     trimmers[i].setName("Trimmers " + i);
        // }

        // for (int i = 0; i < exportersThreads; i++){
        //     exporters[i] = new Threads(Arrays.asList(15,16), monitor);
        //     exporters[i].setName("Trimmers " + i);
        // }

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


        // Crear hilos con grupos de transiciones
        // Threads thread1 = new Threads(Arrays.asList(0), monitor);
        // Threads thread2 = new Threads(Arrays.asList(1,3), monitor);
        // Threads thread3 = new Threads(Arrays.asList(2,4), monitor);
        // Threads thread4 = new Threads(Arrays.asList(5,7,9), monitor);
        // Threads thread5 = new Threads(Arrays.asList(6,8,10), monitor);
        // Threads thread6 = new Threads(Arrays.asList(11,12,13,14), monitor);
        // Threads thread7 = new Threads(Arrays.asList(15,16), monitor);

        // Iniciar los hilos
        // thread1.start();
        // thread2.start();
        // thread3.start();
        // thread4.start();
        // thread5.start();
        // thread6.start();
        // thread7.start();

    }

}