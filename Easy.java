import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Buttons
{
  public void act() {
      if(Greenfoot.mouseClicked(this)) {
            getWorld().stopped();
            Greenfoot.setWorld(new EL1());
            return;
        }
    }
}
