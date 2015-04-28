import greenfoot.*;

/**
 * Write a description of class HL2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HL2 extends HardLevel
{
    Continue continuebutton = new Continue();
    createLevel level2 = new createLevel("Spaceship",43,550);
    /**
     * Constructor for objects of class HL2.
     * 
     */
    public HL2()
    {
        populate(level2);
        playMusic(this);
    }
    
    public void act(){
        if(level2.winner() == true){
            addObject(continuebutton, 301, 301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new HL3());
        }
        pause();
    }
}
