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
    World toWorld = null;
    VolumeDown volumedown = new VolumeDown();
    VolumeUp volumeup = new VolumeUp();
    /**
     * Constructor for objects of class PauseMenu.
     * 
     */
    public PauseMenu(String[] option, World inWorld)
    {   
        super(600, 600, 1); 
        addObject(volumedown, 225, (getHeight() / 2));
        addObject(volumeup, 373, (getHeight() / 2));
        addObject(new Option(option[0], 0), getWidth() / 2, 250);
        addObject(new Option(option[1], 1), getWidth() / 2, 350);
        setBG(); // prepares the background image
        toWorld = inWorld; // save world to return to
      
    }

    private void setBG()
    {
        GreenfootImage main = getBackground();
        GreenfootImage img = new GreenfootImage("PlutonianRevenge-MarvanPAUSE.png");
        main.drawImage(img, 0, 0);

    }
    
    public void act() {
        // Returns to MainWorld if an Option object was selected
        if (Option.selected > -1) Greenfoot.setWorld(toWorld);
    }
}
