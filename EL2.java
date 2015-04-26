import greenfoot.*;

/**
 * Write a description of class EL2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EL2 extends EasyLevel
{
    Comet clueTwo = new Comet();
    Continue continuebutton = new Continue();
    
    createLevel level2 = new createLevel("Comet",165,550);
    /**
     * Constructor for objects of class EL2.
     * 
     */
    public EL2()
    {
        populate(level2);
        playMusic(this);
        addObject(clueTwo, 100, 450);
    }
    
    public void act(){
        if(level2.winner() == true){
            addObject(continuebutton, 301, 301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new EL3());
        }
    }
    
}
