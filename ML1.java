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
     Exit exit = new Exit();
    /**
     * Constructor for objects of class ML1.
     * 
     */
    public ML1()
    {
        populate(level1);
    }
    
    public void act(){
        super.act();
        if(level1.winner() == true){
            Exit exit = new Exit();
            addObject(continuebutton, 400, 301);
            addObject(exit,250,301);
           
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new ML2());
        }
    }
}
