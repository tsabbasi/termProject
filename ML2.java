import greenfoot.*;

/**
 * Write a description of class ML2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ML2 extends MediumLevel
{
    private boolean isLevelComplete = false;
    Continue continuebutton = new Continue();
    createLevel level2 = new createLevel("planet");
    /**
     * Constructor for objects of class ML2.
     * 
     */
    public ML2()
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
            Greenfoot.setWorld(new ML3());
        }
    }
}