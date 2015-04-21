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
    /**
     * Constructor for objects of class LevelPicker.
     * 
     */
    public LevelPicker() {
        super(600,600,1);
        addObject(easyButton, 301, 252);
        addObject(mediumButton, 301, 315);
        addObject(hardButton, 299, 375);
        //prepare();
    }

    public void act() {
           if(Greenfoot.mouseClicked(easyButton)) { 
            Greenfoot.setWorld(new EasyLevel());
            return;
        }
        if(Greenfoot.mouseClicked(mediumButton)) {
            Greenfoot.setWorld(new MediumLevel());
            return;
        }
        if(Greenfoot.mouseClicked(hardButton)) {             
           Greenfoot.setWorld(new HardLevel());
            return;
        }
    }
       /*
       MouseInfo mouse = Greenfoot.getMouseInfo();
       if (mouse != null && Greenfoot.mouseClicked(easyButton)) { 
            Greenfoot.setWorld(new EL1());
            return;
       }
       if (mouse != null && Greenfoot.mouseClicked(mediumButton)) {
            Greenfoot.setWorld(new ML1());
            return;
       }
       if (mouse != null && Greenfoot.mouseClicked(hardButton)) {             
           Greenfoot.setWorld(new HL1());
       }
    }
    */

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    
    private void prepare()
    {
        
    }
}
