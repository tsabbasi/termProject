import greenfoot.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Write a description of class LetterQueue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pocket extends LetterHolder
{
    Queue<Letter> myQueue = new LinkedList<Letter>();
    /**
     * Act - do whatever the LetterQueue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
     public Pocket(int xCoord,int yCoord){
         super(xCoord,yCoord);
         this.myQueue = myQueue;
    
    }
    public void updateX(){
        if(this.myQueue.size()<=3){
        this.xCoord-=35;
    }
        
    }
    
    public void removeItem(){
        this.xCoord+=35;
    }
    
    public void act() 
    {
       
    }    
}
