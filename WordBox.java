import greenfoot.*;
import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class WordBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//This class is used to interact with the letters. When an item touches the word box it will move
//to the first open position...
//for the algorithm take the string and generate letter objects into an array. Take first letter of word. Random letter. Second one of word...Etc but in a way to fit the board.
public class WordBox extends Actor
{
    //This will be used to store the letters that have been moved to the WordBox
    ArrayList<Letter> choice = new ArrayList<Letter>();
    
    int attempts = 4;
    LetterStack stack = new LetterStack();
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    //This will be used to place set the location on the letters in the array
    int[][] x = {{105, 105, 105, 105, 105},{263, 263, 263, 263, 263}, {415, 415, 415, 415, 415}};
    int[][] y = {{125,155,185,215,245},{240, 270, 300, 330, 360}, {125,155,185,215,245}};
    Letter[] genLetters = new Letter[10];
    Random randGen = new Random();
    String word = " ";
    

    
    
      /**
     * Act - do whatever the WordBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Here the random letters are generated.
    public WordBox(String word){
        this.word = word;
        int letterFromWordCount = word.length();
            for(int i = 0; i < genLetters.length;i++){
            if(i < word.length()){
            genLetters[i] = new Letter(word.charAt(i), randGen.nextInt(3));
        }else
            genLetters[i] = new Letter(alphabet[randGen.nextInt(26)], randGen.nextInt(3));
        
            
        }
        
        }
        //This will generate random letters at 3, 6, and 9 currently and create letters that are from the word backwards.
            
        

        //This method will set location for letters according to their stack in order and push them to the stack
 
      



    public void act(){ 
         Level level = (Level) getWorld(); 
       
        if(WordBox.this.isTouching(Letter.class)){
            
        }
    }            
    
    }

        
    

    
    
    



