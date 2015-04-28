import greenfoot.*;

/**
 * Write a description of class HL1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HL1 extends HardLevel
{
    Continue continuebutton = new Continue();
    createLevel level1= new createLevel("Meteor",140,550);
    /**
     * Constructor for objects of class HL1.
     * 
     */
    public HL1()
    {
        populate(level1);
        playMusic(this);
    }
    
    public void act(){
        if(level1.winner() == true){
            addObject(continuebutton, 301, 301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new HL2());
        }
        pause();
    }
}
