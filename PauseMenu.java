import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class PauseMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseMenu extends World
{
    //Level toWorld = null;
    /**
     * Constructor for objects of class PauseMenu.
     * 
     */
    public PauseMenu(Level inWorld)
    {   
        super(600, 600, 1); 
        Buttons back = new BackToGame(inWorld);
        Buttons menu = new Exit();
        addObject(back, getWidth() / 2, 250);
        addObject(menu, getWidth() / 2, 350);
        setBG(); // prepares the background image
        //toWorld = inWorld; // save world to return to
      
    }

    private void setBG()
    {
        GreenfootImage main = getBackground();
        GreenfootImage img = new GreenfootImage("PlutonianRevenge-MarvanPAUSE.png");
        main.drawImage(img, 0, 0);

    }
    
    public void act() {

    }
}