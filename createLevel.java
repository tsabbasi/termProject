import greenfoot.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/**
 * Write a description of class createLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class createLevel extends Actor
{   
    
    // Queue
    Pocket queue = new Pocket(575,460);
    
    WordBox box;
    //Stacks
    Rocket stack1 = new Rocket(105,190);
    Rocket stack2 = new Rocket(263,280);
    Rocket stack3 = new Rocket(415,180);
    
    //List<Rocket> rockets = new ArrayList<Rocket>();
    
    Rocket[] rockets = {stack1,stack2,stack3}; // These are the rocketships in the game.
    
    // All Letters in the alphabet to use for stars.
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    //Letters
    Letter[] genLetters = new Letter[12]; // Maximum of 12 letters on the map.
    
    //MISC
     Random randGen = new Random();
     
    String word = " ";
    //WordBox
    // Work on this.
    
    /**
     * Act - do whatever the createLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // I changed the entire createlevel
    public createLevel(String word){
        this.word = word;
        box = new WordBox(word,130,550);
        
        
         
        
         //this will add the word.
         List<Rocket> rockets1 = new ArrayList(Arrays.asList(stack1, stack2,stack3));
         int index;
         int i = 0;
         // This for loop will construct letters.
        
         while (i <genLetters.length){
            index = randGen.nextInt(rockets1.size()); 
            if(rockets1.get(index).stack.size()>3){
                rockets1.remove(rockets1.get(index)); // If the rocket is full remove it from the rockets to be added to.
                continue;
            }
            else{
                if(i<word.length() ){
                genLetters[i] =  new Letter(word.charAt(i), rockets1.get(index));
                rockets1.get(index).stack.push(genLetters[i]);
                
            }
            else {
             genLetters[i] = new Letter(alphabet[randGen.nextInt(26)], rockets1.get(index));
             rockets1.get(index).stack.push(genLetters[i]);
             
            
            
        }
        i++;
    }
    
   
}
  }
  public boolean winner(){
      if(box.choice[box.choice.length-1] == box.answer[box.choice.length-1]){
          return true;
        }
      return false;
    }       
    
   public void act() 
    {   
        // If something drops on any queue
        // This will add things to the actual stacks and queues.
        for (Rocket rocket : rockets){
            // If anything drops on the queue it will add it to the stack!
            if (!queue.myQueue.isEmpty()&& queue.myQueue.peek().getContainer() == rocket){     
                queue.myQueue.peek().dropOnStack(rocket,queue); 
            }
                // If anything drops on the stack it will add it to the queue!
                 if (!rocket.stack.isEmpty() && queue.myQueue.size() < 3){
                     rocket.stack.peek().dropOnQueue(queue,rocket);
                     
    }
    
    if (!rocket.stack.isEmpty()){
                     rocket.stack.peek().dropOnWordBox(queue,rocket,box);
        }
        
   
    
  
}
}
}
