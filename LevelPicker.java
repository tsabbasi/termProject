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
        prepare();
    }

    public void act() {
<<<<<<< HEAD
       MouseInfo mouse = Greenfoot.getMouseInfo();
       if (mouse != null && Greenfoot.mouseClicked(easyButton)) { 
            Greenfoot.setWorld(new EasyLevel());
            return;
       }
       if (mouse != null && Greenfoot.mouseClicked(mediumButton)) {
            Greenfoot.setWorld(new MediumLevel());
            return;
       }
       if (mouse != null && Greenfoot.mouseClicked(hardButton)) {             
           Greenfoot.setWorld(new HardLevel());
=======
        
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
>>>>>>> 825a89674a22b57ed7e707e0d27b83306e2389f4
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
