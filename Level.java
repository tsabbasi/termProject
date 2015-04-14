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
    WordBox box = new WordBox("Apple");


    //THIS IS A TEST MAP. THESE LETTER POSITIONS SHOULD BE USED.********************************
    //First Spaceship

    /**
     * Constructor for objects of class level.
     * 
     */
    public Level()
    {  
        super(600, 600, 1);
        //To determine where the letter lands on the line... 

        //setPaintOrder(Panel.class, Letter.class, WordBox.class);
        populate();
        /*
        //regular Letter
        addObject(a1, 105, 185);//a
        addObject(p2, 105, 155);//p
        addObject(d3, 105, 125);//d
        addObject(p1, 263, 270);//p
        addObject(l1, 263, 240);//l
        addObject(e1, 415, 170);//e
        addObject(l2, 415, 140);//l
        addObject(e2, 415, 110);//e
        addObject(box, 300, 570); // WordBox
        //Adding numbers

        box.stack.stack3.push(e1);
        box.stack.stack3.push(l2);
        box.stack.stack3.push(e2);

        box.stack.stack1.push(a1);
        box.stack.stack1.push(p2);
        box.stack.stack1.push(d3);

        //Second______________________

        box.stack.stack2.push(p1);
        box.stack.stack2.push(l1);

        //Third________________

        //WORDBOX
        
            
        prepare();
    }
    //Need to make a populate method that will create maps based on word size, difficulty selected, etc..

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

}
  public void populate(){
       placeLetters();
       
    }
    int[][] x = {{105, 105, 105, 105, 105},{263, 263, 263, 263, 263}, {415, 415, 415, 415, 415}};
    int[][] y = {{125,155,185,215,245},{240, 270, 220, 200, 210}, {170,140,110,215,245}};
    // 125 155 185
    //This will place the letters in the world randomly.
   public void placeLetters(){
       int s1 = 0;
       int s2 = 0;
       int s3 = 0;
       addObject(box, 300, 570); // WordBox
       for(int i = 0; i < box.genLetters.length;i++){
       if(box.genLetters[i].stack == 0){
           
           
           addObject(box.genLetters[i], box.x[0][s1], box.y[0][s1]);
           box.stack.stack1.push(box.genLetters[i]);
           s1++;
        }else if(box.genLetters[i].stack == 1){
              addObject(box.genLetters[i], box.x[1][s2], box.y[1][s2]);
              box.stack.stack2.push(box.genLetters[i]);
              s2++;
            
        }else{

              addObject(box.genLetters[i], box.x[2][s3], box.y[2][s3]);
              box.stack.stack3.push(box.genLetters[i]);
           s3++;
        
        
    }
}

       
    }
}
