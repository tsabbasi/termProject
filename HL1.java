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
    createLevel level1= new createLevel("Meteor",140,550,'h');
    Exit exit  = new Exit();
    /**
     * Constructor for objects of class HL1.
     * 
     */
    public HL1()
    {
        populate(level1);
    }
    
    public void act(){
        super.act();
        if(level1.winner() == true){
            
            addObject(continuebutton, 400, 301);
            addObject(exit,250,301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new HL2());
        }
    }
}
