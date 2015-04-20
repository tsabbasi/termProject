import greenfoot.*;

/**
 * Write a description of class EL2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EL2 extends EasyLevel
{
    private boolean isLevelComplete = false;
    Continue continuebutton = new Continue();
    createLevel level2 = new createLevel("bacon");
    /**
     * Constructor for objects of class EL2.
     * 
     */
    public EL2()
    {
        populate(level2);
    }
    
    public void boop(){
        isLevelComplete = true;
    }
    
    public void act(){
        if(isLevelComplete == true){
            addObject(continuebutton, 301, 301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new EL3());
        }
    }
    
}
