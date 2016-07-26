import java.awt.*;
import java.util.*;

/**
 * Write a description of interface IDibujo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface IDibujo
{
   
public void changeColor(String newColor);
public void slowMoveHorizontal(int distance);
public void slowMoveVertical(int distance);
public void draw();

}



