import greenfoot.*;

/**
 * Write a description of class EL3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EL3 extends EasyLevel
{
    Rocketship clueThree = new Rocketship();
    Exit exitbutton = new Exit();
     createLevel level3 = new createLevel("rocketship",40,550,'e');
    /**
     * Constructor for objects of class EL3.
     * 
     */
    public EL3()
    {
        populate(level3);
        addObject(clueThree, 100, 400);
    }
    
    public void act(){
        super.act();
        if(level3.winner() == true){
            Greenfoot.setWorld(new Winner());
            addObject(exitbutton, 301, 301);
        }
        if (Greenfoot.mouseClicked(exitbutton)){
            stopped();
            Greenfoot.setWorld(new MainMenu());
        }
    }
    
}
