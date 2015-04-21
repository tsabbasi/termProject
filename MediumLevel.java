import greenfoot.*;

/**
 * Write a description of class MediumLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediumLevel extends Level
{
    GreenfootSound music = new GreenfootSound("NormalModeEdit.mp3");
    /**
     * Constructor for objects of class MediumLevel.
     * 
     */
    public MediumLevel()
    {
         music.play();
    }
}
