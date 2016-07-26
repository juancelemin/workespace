/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.List;
public class CarroConHerencia implements IDibujo
{
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
    private int xPosition;
    private IDibujo[] formas;
    
 
 

    /**
     * Constructor for objects of class Picture
     */
    public CarroConHerencia()
    {
       
        
        // nothing to do... instance variables are automatically set to null
    }
 
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
        
        formas = new IDibujo[5];
        formas[0]= wall;
        formas[1]= carro;
        formas[2]= rueda1;
        formas[3]= rueda2;
        formas[4]= ventana;
        
        
        
        for(int i =0;i<200;i++)
        {
            for(int j =0;j<formas.length;j++)
            {
            formas[j].slowMoveHorizontal(2);
            }
        }
    }        
    public void setBlackAndWhite(){
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
    public void changeColor(String newColor)
    {
        color = newColor;
        wall.changeColor(color);
        carro.changeColor(color);
        ventana.changeColor("white");
        rueda1.changeColor("black");
        rueda2.changeColor("black");    
      
    }
    public void slowMoveHorizontal(int distance)
        {
            int delta;

            if(distance < 0) 
            {
                delta = -1;
                distance = -distance;
            }
            else 
            {
                delta = 1;
            }

            for(int i = 0; i < distance; i++)
            {
                xPosition += delta;
                draw();
            }
        
        }
}