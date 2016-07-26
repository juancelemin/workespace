
/**
 * Write a description of class Cohete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cohete implements IDibujo
{
    // instance variables - replace the example below with your own
  

    private Triangle head1;
    private Square head2;
    private Triangle cuerpo;
    private Circle ventana1;
    private Circle ventana2;
    private Circle ventana3;
    private Square escape1;
    private Square escape2; 
    private Triangle fuego1;
    private Triangle fuego2;
    private int xPosition;
    private int yPosition;
    private String color;
    private IDibujo[] formas;

    /**
     * Constructor for objects of class Cohete
     */
    public Cohete()
    {
        // initialise instance variables
      
    }

     public void draw()
    {
        
        
        head2 = new Square();
        head2.moveHorizontal(-125);
        head2.moveVertical(-30);
        head2.changeSize(50);
        head2.changeColor("white");
        head2.makeVisible();
        
        head1 = new Triangle();
        head1.changeSize(50, 50);
        head1.changeColor("black");
        head1.moveHorizontal(0);
        head1.moveVertical(-100);
        head1.makeVisible();
        
        fuego1 = new Triangle();
        fuego1.changeSize(30, 30);
        fuego1.changeColor("red");
        fuego1.moveHorizontal(-20);
        fuego1.moveVertical(90);
        fuego1.makeVisible();
        
        fuego2 = new Triangle();
        fuego2.changeSize(30, 30);
        fuego2.changeColor("red");
        fuego2.moveHorizontal(20);
        fuego2.moveVertical(90);
        fuego2.makeVisible();
        
        escape2 = new Square();
        escape2.moveHorizontal(-130);
        escape2.moveVertical(110);
        escape2.changeSize(20);
        escape2.changeColor("black");
        escape2.makeVisible();
        
        escape1 = new Square();
        escape1.moveHorizontal(-90);
        escape1.moveVertical(110);
        escape1.changeSize(20);
        escape1.changeColor("black");
        escape1.makeVisible();
        
        cuerpo = new Triangle();
        cuerpo.changeSize(200, 100);
        cuerpo.changeColor("white");
        cuerpo.moveHorizontal(0);
        cuerpo.moveVertical(-100);
        cuerpo.makeVisible();
        
        ventana1 = new Circle();
        ventana1.changeColor("black");
        ventana1.moveHorizontal(-30);
        ventana1.moveVertical(10);
        ventana1.changeSize(20);
        ventana1.makeVisible();
        
        ventana2 = new Circle();
        ventana2.changeColor("black");
        ventana2.moveHorizontal(-30);
        ventana2.moveVertical(30);
        ventana2.changeSize(20);
        ventana2.makeVisible();
        
        ventana3 = new Circle();
        ventana3.changeColor("black");
        ventana3.moveHorizontal(-30);
        ventana3.moveVertical(50);
        ventana3.changeSize(20);
        ventana3.makeVisible();
        
        /*IDibujo[] formas
        for(int i =0;i<200;i++)
        {
            for(int j =0;j<formas.length;j++)
            {
                formas[j].slowMoveVertical(2);
           
            }
        }
        */
        
        /*int i=1;
        while(i<150)
        {
            head2.slowMoveVertical(-2);
            head1.slowMoveVertical(-2);
            fuego1.slowMoveVertical(-2);
            fuego2.slowMoveVertical(-2);
            escape1.slowMoveVertical(-2);
            escape2.slowMoveVertical(-2);
            cuerpo.slowMoveVertical(-2);
            ventana1.slowMoveVertical(-2);
            ventana3.slowMoveVertical(-2);
            ventana2.slowMoveVertical(-2);
            i++;
        }*/
        
        
        
        

        
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
    public void slowMoveVertical(int distance)
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
            yPosition += delta;
            draw();
        }
    }
    public void changeColor(String newColor)
    {
       
    }
}
