package main;

public class Main {
    public static void main(String[] args) {

        final int setpolitica = 1;     //politica 1 es 50/50, 2 es 80/20
        final int numerodeimagenesaprocesar = 200;  //numero de invariantes que buscamos
        final int numhilos1 = 2;    //cargador, ajustador 
        final int numhilos2 = 1;    //creador, exportador, recortador

        //agregar un check flag a exportador andtes de llamar a la bandera

    //     Politic politic = new Politic(setpolitica);
    //     Monitor monitor = new Monitor(politic);

    //     Creator[] creator = new Creator[numhilos2];
    //     Thread[] threadCreador = new Thread[numhilos2];

    //     Loader[] cargadores = new Loader[numhilos1];
    //     Thread[] threadCargadores = new Thread[numhilos1];

    //     Adjuster[] ajustadores = new Adjuster[numhilos1];
    //     Thread[] threadAjustadores = new Thread[numhilos1];

    //     Trimmer[] recortadores = new Trimmer[numhilos2];
    //     Thread[] threadRecortadores = new Thread[numhilos2];

    //     Exporter[] exporter = new Exporter[numhilos2];
    //     Thread[] threadExportador = new Thread[numhilos2];

    //     for(int i = 0; i < numhilos1; i++){
    //         cargadores[i] = new Loader(monitor);
    //         threadCargadores[i] = new Thread(cargadores[i]);
    //         threadCargadores[i].setName("Cargador: " + i);

    //         ajustadores[i] = new Adjuster(monitor);
    //         threadAjustadores[i] = new Thread(ajustadores[i]);
    //         threadAjustadores[i].setName("Ajustador: " + i);
    //     }

    //     for(int i = 0; i < numhilos2; i++){
    //         creator[i] = new Creator(monitor, numerodeimagenesaprocesar);
    //         threadCreador[i] = new Thread(creator[i]);
    //         threadCreador[i].setName("Creador: " + i);

    //         exporter[i] = new Exporter(monitor, numerodeimagenesaprocesar);
    //         threadExportador[i] = new Thread(exporter[i]);
    //         threadExportador[i].setName("Exportador: " + i);

    //         recortadores[i] = new Trimmer(monitor);
    //         threadRecortadores[i] = new Thread(recortadores[i]);
    //         threadRecortadores[i].setName("Recortador: " + i);
    //     }

    //     Log log = new Log(threadCreador, threadCargadores, threadAjustadores, threadRecortadores, threadExportador, monitor);
    //     new Thread(log).start();

    //     for(int i = 0; i < numhilos1; i++){
    //         threadCargadores[i].start();
    //         threadAjustadores[i].start();
    //     }

    //     for(int i = 0; i < numhilos2; i++){
    //         threadCreador[i].start();
    //         threadExportador[i].start();
    //         threadRecortadores[i].start();
    //     }
    }
}

