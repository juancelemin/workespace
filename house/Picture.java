/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
import java.util.*;
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle ventana1;
    private Circle ventana2;
    private Square puerta;
    private Circle luna;
    private Square chimenea;
    private Square fondo;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        fondo = new Square();
        fondo.moveHorizontal(-310);
        fondo.moveVertical(-310);
        fondo.changeSize(500);
        fondo.makeVisible();
        fondo.changeColor("blue");
        
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(80);
        wall.changeSize(120);
        wall.makeVisible();
      
        
        chimenea = new Square();
        chimenea.moveHorizontal(-60);
        chimenea.moveVertical(40);
        chimenea.changeSize(40);
        chimenea.changeColor("magenta");
        chimenea.makeVisible();
       
        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(0);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        luna = new Circle();
        luna.changeColor("white");
        luna.moveHorizontal(-100);
        luna.moveVertical(-40);
        luna.changeSize(80);
        luna.makeVisible();
       
        ventana1 = new Circle();
        ventana1.changeColor("white");
        ventana1.moveHorizontal(-40);
        ventana1.moveVertical(130);
        ventana1.changeSize(30);
        ventana1.makeVisible();
        
        ventana2 = new Circle();
        ventana2.changeColor("white");
        ventana2.moveHorizontal(10);
        ventana2.moveVertical(130);
        ventana2.changeSize(30);
        ventana2.makeVisible();
        
        puerta = new Square();
        puerta.moveHorizontal(-100);
        puerta.changeColor("black");
        puerta.moveVertical(140);
        puerta.changeSize(40);
        puerta.makeVisible();
        
        
        luna.slowMoveHorizontal(150);
        
        
        fondo = new Square();
        fondo.moveHorizontal(-310);
        fondo.moveVertical(-310);
        fondo.changeSize(500);
        fondo.makeVisible();
        fondo.changeColor("orange");
        
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(80);
        wall.changeSize(120);
        wall.makeVisible();
       
        
        chimenea = new Square();
        chimenea.moveHorizontal(-60);
        chimenea.moveVertical(40);
        chimenea.changeSize(40);
        chimenea.changeColor("magenta");
        chimenea.makeVisible();
       
        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(0);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        luna = new Circle();
        luna.changeColor("white");
        luna.moveHorizontal(50);
        luna.moveVertical(-40);
        luna.changeSize(80);
        luna.makeVisible();
       
        ventana1 = new Circle();
        ventana1.changeColor("white");
        ventana1.moveHorizontal(-40);
        ventana1.moveVertical(130);
        ventana1.changeSize(30);
        ventana1.makeVisible();
        
        ventana2 = new Circle();
        ventana2.changeColor("white");
        ventana2.moveHorizontal(10);
        ventana2.moveVertical(130);
        ventana2.changeSize(30);
        ventana2.makeVisible();
        
        puerta = new Square();
        puerta.moveHorizontal(-100);
        puerta.changeColor("black");
        puerta.moveVertical(140);
        puerta.changeSize(40);
        puerta.makeVisible();
        
       
       
        luna.slowMoveHorizontal(50);
     
        
        fondo = new Square();
        fondo.moveHorizontal(-310);
        fondo.moveVertical(-310);
        fondo.changeSize(500);
        fondo.makeVisible();
        fondo.changeColor("black");
        
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(80);
        wall.changeSize(120);
        wall.makeVisible();
       
        
        chimenea = new Square();
        chimenea.moveHorizontal(-60);
        chimenea.moveVertical(40);
        chimenea.changeSize(40);
        chimenea.changeColor("magenta");
        chimenea.makeVisible();
       
        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(0);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        luna = new Circle();
        luna.changeColor("black");
        luna.moveHorizontal(100);
        luna.moveVertical(-40);
        luna.changeSize(80);
        luna.makeVisible();
       
        ventana1 = new Circle();
        ventana1.changeColor("white");
        ventana1.moveHorizontal(-40);
        ventana1.moveVertical(130);
        ventana1.changeSize(30);
        ventana1.makeVisible();
        
        ventana2 = new Circle();
        ventana2.changeColor("white");
        ventana2.moveHorizontal(10);
        ventana2.moveVertical(130);
        ventana2.changeSize(30);
        ventana2.makeVisible();
        
        puerta = new Square();
        puerta.moveHorizontal(-100);
        puerta.changeColor("black");
        puerta.moveVertical(140);
        puerta.changeSize(40);
        puerta.makeVisible();
       
        
        luna.slowMoveHorizontal(60);
        
        

        fondo = new Square();
        fondo.moveHorizontal(-310);
        fondo.moveVertical(-310);
        fondo.changeSize(500);
        fondo.makeVisible();
        fondo.changeColor("orange");
       
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(80);
        wall.changeSize(120);
        wall.makeVisible();
       
        
        chimenea = new Square();
        chimenea.moveHorizontal(-60);
        chimenea.moveVertical(40);
        chimenea.changeSize(40);
        chimenea.changeColor("magenta");
        chimenea.makeVisible();
       
        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(0);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        luna = new Circle();
        luna.changeColor("white");
        luna.moveHorizontal(160);
        luna.moveVertical(-40);
        luna.changeSize(80);
        luna.makeVisible();
       
        ventana1 = new Circle();
        ventana1.changeColor("white");
        ventana1.moveHorizontal(-40);
        ventana1.moveVertical(130);
        ventana1.changeSize(30);
        ventana1.makeVisible();
        
        ventana2 = new Circle();
        ventana2.changeColor("white");
        ventana2.moveHorizontal(10);
        ventana2.moveVertical(130);
        ventana2.changeSize(30);
        ventana2.makeVisible();
        
        puerta = new Square();
        puerta.moveHorizontal(-100);
        puerta.changeColor("black");
        puerta.moveVertical(140);
        puerta.changeSize(40);
        puerta.makeVisible();
        
        
        
         luna.slowMoveHorizontal(50);
        
        fondo = new Square();
        fondo.moveHorizontal(-310);
        fondo.moveVertical(-310);
        fondo.changeSize(500);
        fondo.makeVisible();
        fondo.changeColor("blue");
       
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(80);
        wall.changeSize(120);
        wall.makeVisible();
       
        
        chimenea = new Square();
        chimenea.moveHorizontal(-60);
        chimenea.moveVertical(40);
        chimenea.changeSize(40);
        chimenea.changeColor("magenta");
        chimenea.makeVisible();
       
        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(0);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        luna = new Circle();
        luna.changeColor("white");
        luna.moveHorizontal(-100);
        luna.moveVertical(-40);
        luna.changeSize(80);
        luna.makeVisible();
       
        ventana1 = new Circle();
        ventana1.changeColor("white");
        ventana1.moveHorizontal(-40);
        ventana1.moveVertical(130);
        ventana1.changeSize(30);
        ventana1.makeVisible();
        
        ventana2 = new Circle();
        ventana2.changeColor("white");
        ventana2.moveHorizontal(10);
        ventana2.moveVertical(130);
        ventana2.changeSize(30);
        ventana2.makeVisible();
        
        puerta = new Square();
        puerta.moveHorizontal(-100);
        puerta.changeColor("black");
        puerta.moveVertical(140);
        puerta.changeSize(40);
        puerta.makeVisible();
        
        
        

 
    }
  
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
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
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
}
