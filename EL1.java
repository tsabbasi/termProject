import greenfoot.*;

/**
 * Write a description of class EL1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EL1 extends EasyLevel
{
    private boolean isLevelComplete = false;
    Continue continuebutton = new Continue();
    createLevel level1 = new createLevel("eggs");
    /**
     * Constructor for objects of class EL1.
     * 
     */
    public EL1()
    {
        populate(level1);
    }
    
    public void boop(){
        isLevelComplete = true;
    }
    
    public void act(){
        if(isLevelComplete == true){
            addObject(continuebutton, 301, 301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new EL2());
        }
    }
    
}