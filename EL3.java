import greenfoot.*;

/**
 * Write a description of class EL3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EL3 extends EasyLevel
{
    private boolean isLevelComplete = false;
    Exit exitbutton = new Exit();
    createLevel level3 = new createLevel("toast");
    /**
     * Constructor for objects of class EL3.
     * 
     */
    public EL3()
    {
        populate(level3);
    }
    
    public void boop(){
        isLevelComplete = true;
    }
    
    public void act(){
        if(isLevelComplete == true){
            addObject(exitbutton, 301, 301);
        }
        if (Greenfoot.mouseClicked(exitbutton)){
            Greenfoot.setWorld(new MainMenu());
        }
    }
    
}