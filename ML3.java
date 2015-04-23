import greenfoot.*;

/**
 * Write a description of class ML3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ML3 extends MediumLevel
{
    private boolean isLevelComplete = false;
    Exit exitbutton = new Exit();
    createLevel level3 = new createLevel("toast");
    /**
     * Constructor for objects of class ML3.
     * 
     */
    public ML3()
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
