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
        Greenfoot.setWorld(new MainMenu());

        
      

}
  public void populate(createLevel l){  
       addObject(l, 300, 570);
       addObject(l.stack1, 103, 155);
       addObject(l.stack2, 260, 240);
       addObject(l.stack3, 415, 140);
       placeLetters(l);
       addObject(l.box, 300, 550);
       addObject(l.queue,510,460); // queue
       
       
       
    }

    //This will place the letters in the world randomly and push it into the stack.
   public void placeLetters(createLevel level){
       int s1 = 0;
       int s2 = 0;
       int s3 = 0;

        
       for(int i = 0; i < level.genLetters.length;i++){
       if(level.genLetters[i].stack == 0){
           level.genLetters[i].x = level.x[0][s1];
           level.genLetters[i].y = level.y[0][s1];
           addObject(level.genLetters[i], level.x[0][s1], level.y[0][s1]);
           level.stack1.stack.push(level.genLetters[i]);
           s1++;
        }else if(level.genLetters[i].stack == 1){
              level.genLetters[i].x = level.x[1][s2];
              level.genLetters[i].y = level.y[1][s2];
              addObject(level.genLetters[i], level.x[1][s2], level.y[1][s2]);
              level.stack2.stack.push(level.genLetters[i]);
              s2++;
            
        }else{
               level.genLetters[i].x = level.x[2][s3];
               level.genLetters[i].y = level.y[2][s3];
              addObject(level.genLetters[i], level.x[2][s3], level.y[2][s3]);
              level.stack3.stack.push(level.genLetters[i]);
           s3++;
        
        
    }
}

       
    }
}
