import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelPicker extends MainMenu
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
    }
}
