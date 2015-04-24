import greenfoot.*;

/**
 * Write a description of class HL2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HL2 extends HardLevel
{
    private boolean isLevelComplete = false;
    Continue continuebutton = new Continue();
    createLevel level2 = new createLevel("nextword");
    /**
     * Constructor for objects of class HL2.
     * 
     */
    public HL2()
    {
        populate(level2);
        playMusic(this);
    }
    
    public void boop(){
        isLevelComplete = true;
    }
    
    public void act(){
        if(isLevelComplete == true){
            addObject(continuebutton, 301, 301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new HL3());
        }
    }
}
