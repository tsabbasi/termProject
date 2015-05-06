import greenfoot.*;

/**
 * Write a description of class ML3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ML3 extends MediumLevel
{
    Exit exitbutton = new Exit();
    createLevel level3 = new createLevel("Interstellar",-3,550,'m');
    /**
     * Constructor for objects of class ML3.
     * 
     */
    public ML3()
    {
        populate(level3);
    }
    
    public void act(){
        super.act();
        if(level3.winner() == true){
            addObject(exitbutton, 301, 301);
            Greenfoot.setWorld(new Winner());
        }
        if (Greenfoot.mouseClicked(exitbutton)){
            stopped();
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
