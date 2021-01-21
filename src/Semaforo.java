
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juani
 */
public class Semaforo{
    Color estado;
    int contador=0;
    int contador2=0;
    int EstadoActual=0;
    int x=0;
    int y=0;
    public Semaforo(){
        if(contador==0){estado=Color.GREEN; x=100;y=100;}
        contador++;
        
    }
    public void Cambio(){
        
        if(contador==0){estado=Color.GREEN; x=275;y=175;}
        if(contador==1){estado=Color.YELLOW; x=275;y=195;}
        if(contador==2){estado=Color.RED; x=275;y=215;}
        EstadoActual=contador;
        contador++;
        if(contador==3)contador=0;
        
    }
    public int EstadoSem(){
        if(EstadoActual==0){return 0;}
        if(EstadoActual==1){return 1;}
        if(EstadoActual==2){return 2;}
        return 0;
    }
    public void pintar(Graphics2D g2){
        g2.setColor(Color.BLACK);
        g2.fillRect(270, 170, 30, 70);
        g2.setColor(Color.BLACK);
        g2.fillRect(280, 240, 10, 20);
        //SEMAFORO2
        g2.setColor(Color.BLACK);
        g2.fillRect(495, 430, 70, 30);
        g2.setColor(Color.BLACK);
        g2.fillRect(475, 440, 20, 10);
        //COLORES1
        g2.setColor(new Color(204,255,204));
        g2.fillOval(275, 175, 20, 20);
        g2.setColor(new Color(255,255,204));
        g2.fillOval(275, 195, 20, 20);
        g2.setColor(new Color(255,204,204));
        g2.fillOval(275, 215, 20, 20);
        //COLORES2
        g2.setColor(new Color(204,255,204));
        g2.fillOval(540, 435, 20, 20);
        g2.setColor(new Color(255,255,204));
        g2.fillOval(520, 435, 20, 20);
        g2.setColor(new Color(255,204,204));
        g2.fillOval(500, 435, 20, 20);
        
        g2.setColor(estado);
        g2.fillOval(x, y, 20, 20);
        if(estado==Color.GREEN || estado==Color.YELLOW){
            g2.setColor(Color.RED);
            g2.fillOval(500, 435, 20, 20);
        }
        if(estado==Color.RED){
            contador2=1;
            g2.setColor(Color.GREEN);
            g2.fillOval(540, 435, 20, 20);
        }
        
    }
}
