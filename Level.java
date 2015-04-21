import greenfoot.*;
import java.util.Stack;
import java.awt.Color;
/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{

    //THIS IS A TEST MAP. THESE LETTER POSITIONS SHOULD BE USED.********************************
    //First Spaceship
    /**
     * Constructor for objects of class level.
     * 
     */
    public Level()
    {  
        
        super(600, 600, 1);
    Greenfoot.setWorld(new LevelPicker());

        
      

}
  public void populate(createLevel l){  
      
      // This will place the objects.
       addObject(l, 300, 570);
       addObject(l.stack1, 103, 155);
       addObject(l.stack2, 260, 240);
       addObject(l.stack3, 415, 140);
       addObject(l.queue,510,460);
       addObject(l.box, 300, 550);
       placeLetters(l);
       
       
       
    }

    //This will place the letters in the world randomly and push it into the stack.
    
   public void placeLetters(createLevel level){
       int s1 = 0;
       int s2 = 0;
       int s3 = 0;
        //genLetters contains all the letter objects that were created/
       for(int i = 0; i < level.genLetters.length;i++){
       if(level.genLetters[i].getContainer() == level.stack1){
           level.genLetters[i].x = 105; // This is the X coordinate for anything in stack1
           level.genLetters[i].y = level.stack1.getY();
           addObject(level.genLetters[i], 105, level.stack1.yCoord);
           level.stack1.updateY(); // The y is deceremented to add the next object on top of another.
        s1++;
           
       }else if(level.genLetters[i].getContainer() == level.stack2){
              level.genLetters[i].x = 263; //This is the X coordinate for anything in stack2
              level.genLetters[i].y = level.stack2.getY();
              addObject(level.genLetters[i], 263, level.stack2.yCoord);
              level.stack2.updateY();
              
             s2++;
            
        }else if (level.genLetters[i].getContainer() == level.stack3){
               level.genLetters[i].x = 415; //This is the X coordinate for anything in stack3
               level.genLetters[i].y = level.stack3.yCoord; // This is the y
              addObject(level.genLetters[i], 415, level.stack3.yCoord);
              level.stack3.updateY();
              
           s3++;
        
        
    }
}
level.stack1.removedItem();
level.stack2.removedItem();
level.stack3.removedItem();
       
    }
    
}
