import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Medium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medium extends Buttons
{
    public void act() {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new ML1());
            return;
        }
    }
}
