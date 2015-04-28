import greenfoot.*;

/**
 * Write a description of class HL3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HL3 extends HardLevel
{
    private boolean isLevelComplete = false;
    Exit exitbutton = new Exit();
    createLevel level3 = new createLevel("SuperNova",100,500);
    /**
     * Constructor for objects of class HL3.
     * 
     */
    public HL3()
    {
        populate(level3);
        playMusic(this);
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
        pause();
    }
}
