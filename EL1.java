import greenfoot.*;

/**
 * Write a description of class EL1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EL1 extends EasyLevel
{
    Galaxy clueOne = new Galaxy();
    Continue continuebutton = new Continue();
    createLevel level1 = new createLevel("galaxy",140,550,'e');
    Exit exit = new Exit();
 
    /**
     * Constructor for objects of class EL1.
     * 
     */
    public EL1()
    {
        populate(level1);
        addObject(clueOne, 100, 400);
    }
    
    public void act(){
        super.act();
        if(level1.winner() == true){
       
            addObject(continuebutton, 400, 301);
            addObject(exit,250,301);
           
            
           
        }
        if(Greenfoot.mouseClicked(continuebutton)){
            Greenfoot.setWorld(new EL2());
        }
      
    }
    
}
