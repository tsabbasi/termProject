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
    Pocket queue = new Pocket(540,460);
    //WordBox
    
    //Stacks
    Rocket stack1 = new Rocket(105,190);
    Rocket stack2 = new Rocket(263,280);
    Rocket stack3 = new Rocket(415,180);
    Rocket[] rockets = {stack1,stack2,stack3};
    
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
         int index;
         // This for loop will construct letters.
         //Why do stacks overflow.
   for(int i = 0; i < genLetters.length;i++){
       index = randGen.nextInt(3);
 
            if(i < word.length()){
                
                genLetters[i] = new Letter(word.charAt(i), rockets[index]);
                rockets[index].stack.push(genLetters[i].setLetterHolder((LetterHolder) rockets[index]));
            }else{
            genLetters[i] = new Letter(alphabet[randGen.nextInt(26)], rockets[index]);
            rockets[index].stack.push(genLetters[i].setLetterHolder((LetterHolder) rockets[index]));
        }
        //This will push the letter to the stack
        /*
       switch(genLetters[i].stack){
           case 0:
           stack1.stack.push(genLetters[i]);
           break;
           case 1:
           stack2.stack.push(genLetters[i]);
           break;
           case 2:
           stack3.stack.push(genLetters[i]);
           break;
        }
        */
            
        }

}
  
        

    
    public void act() 
    {   
        // If something drops on any queue
        // This will add things to the actual stacks and queues.
    if (!stack1.stack.isEmpty()){
        stack1.stack.peek().dropOnQueue(queue,stack1);
        stack1.top();
    }
    if (!stack2.stack.isEmpty()){
        stack2.stack.peek().dropOnQueue(queue,stack2);
        stack2.top();
    }
    if (!stack3.stack.isEmpty()){
       stack3.stack.peek().dropOnQueue(queue,stack3);
        stack3.top();
    }
    // if drops on queue
     if (!queue.myQueue.isEmpty()){  
    queue.myQueue.peek().dropOnStack(stack1,queue);
}
   if (!queue.myQueue.isEmpty()){  
    queue.myQueue.peek().dropOnStack(stack2,queue);
}
   if (!queue.myQueue.isEmpty()){  
    queue.myQueue.peek().dropOnStack(stack3,queue);
}
}
}
    
        
        
        
    

