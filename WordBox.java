import greenfoot.*;
import java.util.ArrayList;
/**
 * Write a description of class WordBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//This class is used to interact with the letters. When an item touches the word box it will move
//to the first open position...
//for the algorithm take the string and generate letter objects into an array. Take first letter of word. Random letter. Second one of word...Etc but in a way to fit the board.
public class WordBox extends LetterHolder
{
   //This will store the letters when a letter meets the wordBox
   char[] choice;
   // .get() ArrayList indexing
   
   
   int index = 0;
   public char currentLetter;
   char answer[];
   
    
    
      /**
     * Act - do whatever the WordBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Here the random letters are generated.
    
    public WordBox(String word,int xCoord, int yCoord){
     super(xCoord,yCoord);
     setImage(word+".png");
     this.xCoord = xCoord;
     this.yCoord = yCoord;
     choice = new char[word.length()];
     this.answer  = word.toCharArray(); // This creates an array of chars that are the correct answer
     this.currentLetter = answer[index]; // Current letter is the letter the word box is looking for 
     
         
    
    }
    
    public void checkLetter(){
        if(this.currentLetter == choice[index] && index+1 <choice.length ){ // if current letter is equal choice's index then index is incremented
            
            index++;
            currentLetter = answer[index]; // currentLetter is updated
    }
}
    
    public void updateX(){
        this.xCoord +=45;
    }
    
        
        //This will generate random letters at 3, 6, and 9 currently and create letters that are from the word backwards.
            
        

        //This method will set location for letters according to their stack in order and push them to the stack
 
     


    
    public void act(){ 
        checkLetter();
        
   
    }            
    
    }

        
    

    
    
    



