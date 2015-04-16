import greenfoot.*;

import java.util.Random;

/**
 * Write a description of class createLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class createLevel extends Actor
{   
    
    // Queue
    LetterQueue queue = new LetterQueue();
    //WordBox
    
    //Stacks
    LetterStack stack1 = new LetterStack();
    LetterStack stack2 = new LetterStack();
    LetterStack stack3 = new LetterStack();
    //Data
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    int[][] x = {{105, 105, 105, 105, 105},{263, 263, 263, 263, 263}, {415, 415, 415, 415, 415}};
    int[][] y = {{190, 160, 130, 100, 70},{280, 250, 220, 190, 160}, {180,150,120,90, 60}};
    //Letters
    Letter[] genLetters = new Letter[10];

    //MISC
     Random randGen = new Random();
    String word = " ";
    WordBox box = new WordBox(word);
    /**
     * Act - do whatever the createLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public createLevel(String word){
        this.word = word;
        
        
         //this will add the word.
   for(int i = 0; i < genLetters.length;i++){
 
            if(i < word.length()){
                genLetters[i] = new Letter(word.charAt(i), randGen.nextInt(3));
        }else
            genLetters[i] = new Letter(alphabet[randGen.nextInt(26)], randGen.nextInt(3));
        
            
        }

}
 
            
            
        

    
    public void act() 
    {
        
        
        }
        
    }    

