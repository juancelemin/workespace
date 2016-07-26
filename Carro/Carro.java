import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.List;
/**
 * Write a description of class Carro1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro
{
    // instance variables - replace the example below with your own
   
    /**
     * Constructor for objects of class Carro1
     */
    public Carro()
    {
        // initialise instance variables
       
    }

 
  
        private Circle wall;
        private Square carro1;
        private Triangle carro;
        private Circle sun;
        private Circle rueda1;
        private Circle rueda2;
        private Square puerta;
        private Circle ventana;
        private Square chimenea;
        private Square fondo;
        private String color;
        private Graphics2D graphic;
 
 
 
 
    /**
     * Draw this picture.
     */
    public void draw()
    {
       
        /*fondo = new Square();
        fondo.moveHorizontal(-310);
        fondo.moveVertical(-310);
        fondo.changeSize(500);
        fondo.makeVisible();
        fondo.changeColor("blue");*/
        
        wall = new Circle();
        wall.changeColor("green");
        wall.moveHorizontal(-40);
        wall.moveVertical(80);
        wall.changeSize(80);
        wall.makeVisible();
      
        carro = new Triangle();
        carro.changeSize(90, 210);
        carro.moveHorizontal(20);
        carro.moveVertical(40);
        carro.makeVisible();
        
        rueda1 = new Circle();
        rueda1.changeColor("black");
        rueda1.moveHorizontal(-60);
        rueda1.moveVertical(160);
        rueda1.changeSize(40);
        rueda1.makeVisible();
        
        rueda2 = new Circle();
        rueda2.changeColor("black");
        rueda2.moveHorizontal(20);
        rueda2.moveVertical(160);
        rueda2.changeSize(40);
        rueda2.makeVisible();
        
        ventana = new Circle();
        ventana.changeColor("white");
        ventana.moveHorizontal(-13);
        ventana.moveVertical(100);
        ventana.changeSize(30);
        ventana.makeVisible();
        
     
        
        
        int i=0;
        while(i<50) 
        { 
        carro.slowMoveHorizontal(2);
        wall.slowMoveHorizontal(2);
        ventana.slowMoveHorizontal(2);
        rueda2.slowMoveHorizontal(2);
        rueda1.slowMoveHorizontal(2);
        i++;
        }
    
    
        
    /**
     * Change this picture to black/white display
     */
    }
    public void setBlackAndWhite()
    {
            if (wall != null)   // only if it's painted already...
            {
                wall.changeColor("");
                sun.changeColor("black");
            }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
            {
                wall.changeColor("red");
                sun.changeColor("yellow");
            }
    }
  
}

