 import greenfoot.*;
import java.util.Stack;
/**
 * Write a description of class LetterStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends LetterHolder
{
    
    Stack<Letter> stack = new Stack();
    
    public Rocket(int xCoord,int yCoord){
        super(xCoord,yCoord);
        this.stack = stack;
        this.yCoord = yCoord; // This should be the top lettter object on the stacks y coordinate.
        this.xCoord = xCoord;
        
    }
    /**
     * Act - do whatever the LetterStack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Stack<Letter> getStack(){
        return stack;
    }
    public void top(){
        if(stack.isEmpty()){
        return;
    }
        else{
        stack.peek().isTop = true;
    }
    }
    
    public int getRocketX(){
        return this.xCoord;
    }
    
    public int getRocketY(){
        return this.yCoord;
    }
    
    public void updateY(){
        this.yCoord-=30;
    }
    public void removedItem(){
        this.yCoord +=30;
    }
    
    
    
    public boolean touching(){
        if (Rocket.this.isTouching(Letter.class)){
            return true;
        }
        else{
            return false;
        }
    }

    public void act() 
    {
        //Level level = (Level) getWorld();
        top();
        
        //System.out.println(stack.peek());
       
     
        
    } 
    
    
}
