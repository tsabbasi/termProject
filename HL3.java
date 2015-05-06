import greenfoot.*;

/**
 * Write a description of class HL3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HL3 extends HardLevel
{
    Exit exitbutton = new Exit();
    createLevel level3 = new createLevel("SuperNova",43,550,'h');
    /**
     * Constructor for objects of class HL3.
     * 
     */
    public HL3()
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
