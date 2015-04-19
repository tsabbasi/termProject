import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelPicker extends World
{
    
    Easy easyButton = new Easy();
    Medium mediumButton = new Medium();
    Hard hardButton = new Hard();
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
        
       if(Greenfoot.mouseClicked(easyButton)) { 
            Greenfoot.setWorld(new EL1());
            return;
        }
        if(Greenfoot.mouseClicked(mediumButton)) {
            Greenfoot.setWorld(new ML1());
            return;
        }
        if(Greenfoot.mouseClicked(hardButton)) {             
           Greenfoot.setWorld(new HL1());
            return;
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addObject(easyButton, 301, 252);
        addObject(mediumButton, 301, 315);
        addObject(hardButton, 299, 375);

    }
}
