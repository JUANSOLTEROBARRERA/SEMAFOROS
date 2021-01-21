
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juani
 */
public class Lienzo extends Canvas{
        //Image Imagen;
        //Imagen = new ImageIcon(puntero.getClass().getResource("/carro1.png")).getImage();
        Semaforo Semaforos;
        Semaforo SemaforoB;
        
        //Font myFont = new Font("Serif", Font.BOLD, 12);
        
        Hilo hilo = new Hilo(this);
    public Lienzo(){
        Semaforos = new Semaforo();
        hilo.start();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
                
        Graphics2D g2 = (Graphics2D) g;
        
        setBackground(new Color(240,240,240));
        g2.setStroke(new BasicStroke(5));
        
        g2.setColor(Color.GRAY);
        g2.fillRect(0, 260, 800, 150);
        g2.fillRect(325, 0, 150, 600);
        g2.setColor(Color.WHITE);
        //CARRIL 1
        g2.fillRect(0, 330, 30, 10);
        g2.fillRect(40, 330, 30, 10);
        g2.fillRect(80, 330, 30, 10);
        g2.fillRect(120, 330, 30, 10);
        g2.fillRect(160, 330, 30, 10);
        g2.fillRect(200, 330, 30, 10);
        g2.fillRect(240, 330, 30, 10);
        //CARRIL 2
        g2.fillRect(530, 330, 30, 10);
        g2.fillRect(570, 330, 30, 10);
        g2.fillRect(610, 330, 30, 10);
        g2.fillRect(650, 330, 30, 10);
        g2.fillRect(690, 330, 30, 10);
        g2.fillRect(730, 330, 30, 10);
        g2.fillRect(770, 330, 30, 10);
        //CARRIL 3
        g2.fillRect(395, 470, 10, 30);
        g2.fillRect(395, 510, 10, 30);
        g2.fillRect(395, 550, 10, 30);
        g2.fillRect(395, 590, 10, 30);
        g2.fillRect(395, 630, 10, 30);
        g2.fillRect(395, 670, 10, 30);
        g2.fillRect(395, 710, 10, 30);
        //CARRIL 4
        g2.fillRect(395, 175, 10, 30);
        g2.fillRect(395, 135, 10, 30);
        g2.fillRect(395, 95, 10, 30);
        g2.fillRect(395, 55, 10, 30);
        g2.fillRect(395, 15, 10, 30);
        g2.fillRect(395, -25, 10, 30);
        //PASO PEATONAL 1
        g2.fillRect(280, 270, 45, 10);
        g2.fillRect(280, 290, 45, 10);
        g2.fillRect(280, 310, 45, 10);
        g2.fillRect(280, 330, 45, 10);
        g2.fillRect(280, 350, 45, 10);
        g2.fillRect(280, 370, 45, 10);
        g2.fillRect(280, 390, 45, 10);
        //PASO PEATONAL 2
        g2.fillRect(475, 270, 45, 10);
        g2.fillRect(475, 290, 45, 10);
        g2.fillRect(475, 310, 45, 10);
        g2.fillRect(475, 330, 45, 10);
        g2.fillRect(475, 350, 45, 10);
        g2.fillRect(475, 370, 45, 10);
        g2.fillRect(475, 390, 45, 10);
        //PASO PEATONAL 3
        g2.fillRect(335, 415, 10, 45);
        g2.fillRect(355, 415, 10, 45);
        g2.fillRect(375, 415, 10, 45);
        g2.fillRect(395, 415, 10, 45);
        g2.fillRect(415, 415, 10, 45);
        g2.fillRect(435, 415, 10, 45);
        g2.fillRect(455, 415, 10, 45);
        //PASO PEATONAL 4
        g2.fillRect(335, 215, 10, 45);
        g2.fillRect(355, 215, 10, 45);
        g2.fillRect(375, 215, 10, 45);
        g2.fillRect(395, 215, 10, 45);
        g2.fillRect(415, 215, 10, 45);
        g2.fillRect(435, 215, 10, 45);
        g2.fillRect(455, 215, 10, 45);
        
        //g2.setColor(Color.BLACK);
        //g2.setFont(myFont);
        //g2.drawString("hola", 0, 0);
        
        //SEMAFORO
        
        Semaforos.pintar(g2);
    }
    
    
}
