import greenfoot.*;

/**
 * Write a description of class ML1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ML1 extends MediumLevel
{
    Continue continuebutton = new Continue();
    createLevel level1 = new createLevel("BlackHole",43,550,'m');
    /**
     * Constructor for objects of class ML1.
     * 
     */
    public ML1()
    {
        populate(level1);
        playMusic(this);
    }
    
    public void act(){
        if(level1.winner() == true){
            addObject(continuebutton, 330, 301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new ML2());
        }
        pause();
    }
}
