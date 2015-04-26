import greenfoot.*;

/**
 * Write a description of class ML1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ML1 extends MediumLevel
{
    private boolean isLevelComplete = false;
    Continue continuebutton = new Continue();
    createLevel level1 = new createLevel("eggs",150,550);
    /**
     * Constructor for objects of class ML1.
     * 
     */
    public ML1()
    {
        populate(level1);
        playMusic(this);
    }
    
    public void boop(){
        isLevelComplete = true;
    }
    
    public void act(){
        if(isLevelComplete == true){
            addObject(continuebutton, 301, 301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new ML2());
        }
    }
}
