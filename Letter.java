import greenfoot.*;

/**
 * Write a description of class Letters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter extends Actor
{   //The isSelected variable is so that we can see if we'ere currently holding item and lastStack is so lets can be returned to place
    private boolean isSelected = false;
    public int stack = 0;
    private char letter = ' ';
    int x = 0;
    int y = 0;
    int currentState = 0;
    final int inStack = 0;
    final int inQueue = 1;
    final int inBox = 2;
    boolean isTop = false;
    int[] xCoord = {200, 255, 302, 350, 395};//550 

    
    //^^To see if it's at the top of the stack
    /**
     * Act - do whatever the Letters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    //use lowercase letters in the parameters**THIS IS WHAT CREATES THE LETTERS AND SETS THE IMAGE*****
    public Letter(char letter,int stack){
        switch(letter){
            case 'a':
            setImage("Star-A.png");
            break;            case 'b':
            setImage("Star-B.png");
            break;            case 'c':
            setImage("Star-C.png");
            break;            case 'd':
            setImage("Star-D.png");
            break;            case 'e':
            setImage("Star-E.png");
            break;            case 'f':
            setImage("Star-F.png");
            break;            case 'g':
            setImage("Star-G.png");
            break;            case 'h':
            setImage("Star-H.png");
            break;            case 'i':
            setImage("Star-I.png");
            break;            case 'j':
            setImage("Star-J.png");
            break;            case 'k':
            setImage("Star-K.png");
            break;            case 'l':
            setImage("Star-L.png");
            break;            case 'm':
            setImage("Star-M.png");
            break;            case 'n':
            setImage("Star-N.png");
            break;            case 'o':
            setImage("Star-O.png");
            break;            case 'p':
            setImage("Star-P.png");
            break;            case 'q':
            setImage("Star-Q.png");
            break;            case 'r':
            setImage("Star-R.png");
            break;            case 's':
            setImage("Star-S.png");
            break;            case 't':
            setImage("Star-T.png");
            break;            case 'u':
            setImage("Star-U.png");
            break;            case 'v':
            setImage("Star-V.png");
            break;            case 'w':
            setImage("Star-W.png");
            break;            case 'x':
            setImage("Star-X.png");
            break;            case 'y':
            setImage("Star-Y.png");
            break;             case 'z':
            setImage("Star-Z.png");
            break;

        }
        this.letter = letter;//This will be used to test if a sentence is correct
        this.stack = stack;//This assigns the stack it will be in
    }

    
    

    //THIS IS WHERE ALL THE DRAGGING AND DROPPING TAKES PLACE
    public void act() 
    {
        Level level = (Level) getWorld(); // gets a reference to the world
        
        if (!isSelected && Greenfoot.mousePressed(this) && currentState != inBox && isTop) // new letter selection
        { // letter is currently unselected and mouse button pressed while over this letter
             isSelected = true; // flags the letter as selected
             MouseInfo mouse = Greenfoot.getMouseInfo();

        
        }
        
        if (isSelected && Greenfoot.mouseDragged(this) ) // follow the mouse
        { // letter is currently selected and the mouse is dragging this letter
            MouseInfo mi = Greenfoot.getMouseInfo(); // gets mouse information
            setLocation(mi.getX(), mi.getY()); // sets location of letter at location of mouse
            return; // exits current execution of this 'act' method
        }
        
        if (isSelected && Greenfoot.mouseDragEnded(this) && currentState == inStack && Letter.this.isTouching(WordBox.class)){ //in Stack and touching wordbox
            currentState = inBox;
            
            isSelected = false; // flags the letter as unselected 
            return; // exits current execution of this 'act' method
        
        }
        
        if (isSelected && Greenfoot.mouseDragEnded(this) && currentState == inStack && Letter.this.isTouching(LetterQueue.class))//in stack and touching queue
        { //Took out the setLocation for this because it needs to be updated in the level folder
            currentState = inQueue;
            
            isSelected = false; // flags the letter as unselected 
            return; // exits current execution of this 'act' method
        
        }
        if (isSelected && Greenfoot.mouseDragEnded(this) && currentState == inQueue && (Letter.this.isTouching(WordBox.class))){//in inque and touching wordbox
            isSelected = false; // flags the letter as unselected 
            return;
        }
        if (isSelected && Greenfoot.mouseDragEnded(this) && currentState == inQueue && Letter.this.isTouching(LetterStack.class))//in que and touching stack
        { //Took out the setLocation for this because it needs to be updated in the level folder
            
            isSelected = false; // flags the letter as unselected 
            return; // exits current execution of this 'act' method
        
        }
        
        if(isSelected && Greenfoot.mouseDragEnded(this) && currentState == inStack){//For if you don't drag to anything 
            Letter.this.setLocation(x,y);
            isSelected = false;
            return;
        }
    
}


}
