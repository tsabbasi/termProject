import greenfoot.*;

/**
 * Write a description of class HardLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardLevel extends Level
{
    createLevel level1= new createLevel("expansion");
    createLevel level2 = new createLevel("nextWord");
    createLevel level3 = new createLevel("nextNextWord");
    /**
     * Constructor for objects of class HardLevel.
     * 
     */
    public HardLevel()
    {
        populate(level1);
        //changeLevel(level2)
        //changeLevel(level3)
    }
}
