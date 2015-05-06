import greenfoot.*;

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Buttons
{
    public void act() {
        if (Greenfoot.mouseClicked(this)){
             Greenfoot.setWorld(new MainMenu(true));
        }
    }
}
