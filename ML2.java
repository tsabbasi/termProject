import greenfoot.*;

/**
 * Write a description of class ML2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ML2 extends MediumLevel
{
    Continue continuebutton = new Continue();
    createLevel level2 = new createLevel("Satellite",43,550,'m');
    Exit exit = new Exit();
    /**
     * Constructor for objects of class ML2.
     * 
     */
    public ML2()
    {
        populate(level2);
        //playMusic(this);
    }
    
    public void act(){
        super.act();
        if(level2.winner() == true){
            
            addObject(continuebutton, 400, 301);
            addObject(exit,250,301);
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new ML3());
        }
    }
}
