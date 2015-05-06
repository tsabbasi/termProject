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
    createLevel level2 = new createLevel("comet",165,550,'e');
    Exit exit = new Exit();
    /**
     * Constructor for objects of class EL2.
     * 
     */
    public EL2()
    {
        populate(level2);
        addObject(clueTwo, 100, 400);
    }
    
    public void act(){
        super.act();
        if(level2.winner() == true){
            
            addObject(continuebutton, 400, 301);
            addObject(exit,250,301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new EL3());
        }
    }
    
}
