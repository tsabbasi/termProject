import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackToGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackToGame extends Buttons
{
    Level toWorld = null;
    /**
     * Act - do whatever the BackToGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public BackToGame(Level inWorld) {
        this.toWorld = inWorld;
    }
    
    public void act() {      
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(toWorld);
        }
    }  
}


