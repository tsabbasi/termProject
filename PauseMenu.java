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
    static boolean infoShown = false;
    
    /*VolumeDown volumedown = new VolumeDown();
    VolumeUp volumeup = new VolumeUp();
    BackToGame backtogame = new BackToGame();
    Exit exit = new Exit();*/
    /**
     * Constructor for objects of class PauseMenu.
     * 
     */
    public PauseMenu(String[] option, World inWorld)
    {   
        super(600, 600, 1); 
        //prepare();
        setBG(); // prepares the background image
        toWorld = inWorld; // save world to return to
        // Create the option objects
        for (int i = 0; i < option.length; i++)
        { // for each menu option
            int x = getWidth() / 2; // set x to center of world
            int y = (i + 1) * (getHeight() - 80) / (1 + option.length) + 80; // set y to be evenly spaced with the other options
            addObject(new Option(option[i], i), x, y); // add the option to the world
        }
    }

    private void setBG()
    {
        GreenfootImage main = getBackground();
        main.setColor(Color.black);
        main.fill(); // set a flat black background
        GreenfootImage img = new GreenfootImage("Game Paused!", 48, Color.white, Color.black); // create title image
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 40); // draw title image on background centered near the top
    }
    
    public void act() {
        // Returns to MainWorld if an Option object was selected
        if (Option.selected > -1) Greenfoot.setWorld(toWorld);
    }
        
    /*private void prepare()
    {
        addObject(volumedown, 158, 276);
        addObject(volumeup, 245, 276);
        addObject(backtogame, 332, 276);
        addObject(exit, 416, 276);

    }*/
}
