import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Buttons
{
    public void act() {
        if(Greenfoot.mouseClicked(this)) {             
            Greenfoot.setWorld(new HL1());
            return;
        }
    }
}
