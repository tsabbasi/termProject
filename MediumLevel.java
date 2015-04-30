import greenfoot.*;

/**
 * Write a description of class MediumLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediumLevel extends Level
{
    
    VolumeDown volumedown = new VolumeDown();
    VolumeUp volumeup = new VolumeUp();
    /**
     * Constructor for objects of class MediumLevel.
     * 
     */
    public MediumLevel()
    {
        super(new GreenfootSound("NormalModeEdit.mp3"));
       
         //music.play();
    }

}
