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
    createLevel level2 = new createLevel("Spaceship",43,550,'h');
    Exit exit = new Exit();
    /**
     * Constructor for objects of class HL2.
     * 
     */
    public HL2()
    {
        populate(level2);
    }
    
    public void act(){
        super.act();
        if(level2.winner() == true){
            
            addObject(continuebutton, 400, 301);
            addObject(exit,250,301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new HL3());
        }
    }
}
