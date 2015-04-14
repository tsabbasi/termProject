import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelPicker extends World
{
/* if(Greenfoot.getKey() == "M" && music.isPlaying())           
        {
            music.pause();
        }
        else if(Greenfoot.getKey() == "M" && !music.isPlaying())
        {
            music.playLoop();
        }*/
    /**
     * Constructor for objects of class LevelPicker.
     * 
     */
    public LevelPicker() {
        super(600,600,1);
        prepare();
    }

    public void act() {
        
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Easy easyButton = new Easy();
        addObject(easyButton, 301, 252);
        Medium mediumButton = new Medium();
        addObject(mediumButton, 301, 315);
        Hard hardButton = new Hard();
        addObject(hardButton, 299, 375);

    }
}
