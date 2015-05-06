import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenuPlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenuPlayButton extends Buttons
{
    /**
     * Act - do whatever the MainMenuPlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) { 
            // guards against a null pointer exception and does short circuit evaluation to prevent a null
            // music.stop();
           MainMenu mainMenu = (MainMenu)getWorld();
           mainMenu.addLevelPicker();
           mainMenu.removeObject(this);
            
           // Greenfoot.setWorld(new LevelPicker());
            
        }
    }    
}
