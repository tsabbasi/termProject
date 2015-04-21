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
        setBG(); // prepares the background image
        toWorld = inWorld; // save world to return to
        // Create the option objects
        for (int i = 0; i < option.length; i++)
        { // for each menu option
            int x = getWidth() / 2; // set x to center of world
            int y = (i + 1) * (getHeight()) / 2 ; // set y to be evenly spaced with the other options
            addObject(new Option(option[i], i), x, y); // add the option to the world
        }
    }

    private void setBG()
    {
        GreenfootImage main = getBackground();
        GreenfootImage img = new GreenfootImage("PlutonianRevenge-MarvanPAUSE.png");
        main.drawImage(img, 0, 0); // draw title image on background centered near the top

    }
    
    public void act() {
        // Returns to MainWorld if an Option object was selected
        if (Option.selected > -1) Greenfoot.setWorld(toWorld);
    }
}
