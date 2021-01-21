
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juani
 */
public class Hilo extends Thread{
    Lienzo puntero; //JFRAME
    public Hilo(Lienzo b){
        puntero = b;
    }
    @Override
    public void run() {
        while(true){
            try {
                puntero.Semaforos.Cambio();
                puntero.repaint();

                //sleep(1000);
                //if(puntero.Semaforos.EstadoSem()){sleep(10000);}
                //else{sleep(5000);}
                if(puntero.Semaforos.EstadoSem()==0){sleep(2000);}
                if(puntero.Semaforos.EstadoSem()==1){sleep(1000);}
                if(puntero.Semaforos.EstadoSem()==2){sleep(3000);}
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
