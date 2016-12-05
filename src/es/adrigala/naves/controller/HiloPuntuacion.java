package es.adrigala.naves.controller;

/**
 * Created by juanxxiii on 05/12/2016.
 */
public class HiloPuntuacion extends Thread {

    private int grados;
    @Override
    public void run(){
        grados += 1;
        try {
            sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
