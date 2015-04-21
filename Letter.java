import greenfoot.*;

/**
 * Write a description of class Letters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter extends Actor
{   //The isSelected variable is so that we can see if we'ere currently holding item and lastStack is so lets can be returned to place

    private LetterHolder container;
    private LetterHolder original;
    private char letter = ' ';
    int x = 0;
    int y = 0;
    int oCoord;
    int currentState = 0;
    final int inStack = 0;
    final int inQueue = 1;
    final int inBox = 2;
    final int inSpace =3;
    boolean isTop = false;
    int[] xCoord = {200, 255, 302, 350, 395};//550 
    boolean isSelected = false;

    //^^To see if it's at the top of the stack
    /**
     * Act - do whatever the Letters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    //use lowercase letters in the parameters**THIS IS WHAT CREATES THE LETTERS AND SETS THE IMAGE*****
    public Letter(char letter,Rocket container){
        setImage("Star-"+Character.toUpperCase(letter)+".png");

        this.letter = letter;//This will be used to test if a sentence is correct
        this.container = container;//This assigns the Letter Holder it will be in
        this.original = container; // This keeps track of original stack!
        this.oCoord = this.container.xCoord;
        this.isTop = isTop;
        
        //container.stack.push(this);

    }

    public void dragAndDrop(){
        
        

        if (!isSelected && Greenfoot.mousePressed(this) && currentState != inBox && isTop) // new letter selection
        { // letter is currently unselected and mouse button pressed while over this letter
            MouseInfo mi = Greenfoot.getMouseInfo();
            x = mi.getX();
            y = mi.getY();
            isSelected = true; // flags the letter as selected
            //MouseInfo mouse = Greenfoot.getMouseInfo();

        }
        if (isSelected && Greenfoot.mouseDragged(this) ) // follow the mouse
        { // letter is currently selected and the mouse is dragging this letter
             // gets mouse information
             MouseInfo mi = Greenfoot.getMouseInfo();
            setLocation(mi.getX(), mi.getY()); // sets location of letter at location of mouse
            return; // exits current execution of this 'act' method
        }
           //When you land on an item
        if(isSelected  && Greenfoot.mouseDragEnded(this) && (Letter.this.isTouching(WordBox.class) || (Letter.this.isTouching(Rocket.class) &&this.getX()==this.oCoord) || Letter.this.isTouching(Pocket.class)))
        {
            
     
        
        if (currentState == inStack){
            
    
            if(Letter.this.isTouching(WordBox.class)){
                currentState = inBox;
            }
            if (Letter.this.isTouching(Pocket.class))//Going to queue
            { 
                currentState = inQueue;
                
  

            }

            isSelected = false; // flags the letter as unselected 
            return; 
        }
    
    

        
        if (currentState == inQueue ){
            if(Letter.this.isTouching(WordBox.class)){
                currentState = inBox;
            }
            if(Letter.this.isTouching(Rocket.class))
            { 
                currentState = inStack;
        
            }
            isSelected = false; // flags the letter as unselected 
            return;
        }
       
    }
    // This limits where the objects can be dropped
    // If they arent touching any types of the objects we created they will not stay.
    if(isSelected && Greenfoot.mouseDragEnded(this) && ((Letter.this.isTouching(Rocket.class)&&this.original.xCoord!=this.getX())||!Letter.this.isTouching(WordBox.class) || !Letter.this.isTouching(Rocket.class) || !Letter.this.isTouching(Pocket.class))){//For if you don't drag to anything 
            Letter.this.setLocation(this.container.xCoord,this.container.yCoord); //  change this so it will send it back to its containers coordinates
            isSelected = false;
            return;
            //((Letter.this.isTouching(Rocket.class) && this.original.getX()!=this.getX())
        }
    }
   
    public boolean isTouchStack(){  
        if(currentState == inStack && Letter.this.isTouching(Rocket.class) ){
        return true;
    }else
    return false;
    }
    public boolean isTouchQueue(){
       if(currentState == inQueue && Letter.this.isTouching(Pocket.class)){
        return true;
    }else{
    return false;
}
    }
    
    public void toggleTop(){
        this.isTop = false;
    }
    public LetterHolder getContainer(){
        return this.original;
    }
    
    
    public Letter setLetterHolder(LetterHolder newContainer){
        this.container =  newContainer;
        return this;
    }
    
    //This will allow you to drop letter on to the queue
        public void dropOnQueue(Pocket container,Rocket rocket){
            Letter moveLetter;
        if (!rocket.stack.isEmpty() && rocket.stack.peek().isTouchQueue() && container.myQueue.size()<3) 
        {
            
            if (container.myQueue != null)
            {
                rocket.stack.pop();
                rocket.removedItem();
                System.out.println("Letter removed from stack\n");
                container.myQueue.add(this.setLetterHolder(container));
                
                this.setLocation(this.container.xCoord,this.container.yCoord);
                System.out.println("WJFOJQWFOJWQF");
                container.updateX();
                
                System.out.println("Letter added to queue\n");
            }
        }
        
    }
    
    public void dropOnStack(Rocket rocket,Pocket pocket){
        Letter moveLetter;
        if(!pocket.myQueue.isEmpty() && pocket.myQueue.peek().isTouchStack() ){
//  && rocket.stack == this.original.stack
        {
            if (rocket.stack != null)
            {
               
               pocket.myQueue.remove();
               pocket.removeItem();
               System.out.println("Letter removed from queue\n");
               rocket.stack.peek().toggleTop();
               moveLetter =  rocket.stack.push(this.setLetterHolder(rocket));
               moveLetter.setLocation(moveLetter.container.xCoord,moveLetter.container.yCoord);
              
               rocket.updateY();
               System.out.println("Letter Pushed into Stack\n");
               
               
       
               //stack1.container.stack.push(queue.myQueue.remove());
            }
        }
        
        
    }
}  

       
    

    //THIS IS WHERE ALL THE DRAGGING AND DROPPING TAKES PLACE
    public void act() 
    {
        Level level = (Level) getWorld(); // gets a reference to the world'
         
        dragAndDrop();
       
        
        

    
    }

}
