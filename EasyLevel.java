import greenfoot.*;

/**
 * Write a description of class EasyLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasyLevel extends Level
{
        createLevel level = new createLevel("eggs");
    /**
     * Constructor for objects of class EasyLevel.
     * 
     */
    public EasyLevel()
    {
         populate(level);
        for(Letter l: level.genLetters)
        System.out.println(l);
    }
}
