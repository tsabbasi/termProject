import greenfoot.*;

/**
 * Write a description of class LevelCompleted here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelCompleted extends World
{

    /**
     * Constructor for objects of class LevelCompleted.
     * 
     */
    public LevelCompleted()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
     private void prepare()
    {
        Continue continuebutton = new Continue();
        addObject(continuebutton, 301, 252);
        Exit exitbutton = new Exit();
        addObject(exitbutton, 301, 315);
    }
}
