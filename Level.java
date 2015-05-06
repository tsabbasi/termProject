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
    private VolumeDown volumedown;
    private VolumeUp volumeup;
    private GreenfootSound music;
    private int volume;
    private Pause pauseButton;
    private StopWatch timer;

    //THIS IS A TEST MAP. THESE LETTER POSITIONS SHOULD BE USED.********************************
    //First Spaceship
    /**
     * Constructor for objects of class level.
     * 
     */
    public Level(GreenfootSound music)
    {  
        super(600, 600, 1);
        this.music = music;
        this.music.setVolume(50);
        playMusic();
        volumedown = new VolumeDown();
        volumeup = new VolumeUp();
        timer = new StopWatch(120);
        volume = 60;
        pauseButton = new Pause();
    }

    public void pause(){
        // Proceed to MenuWorld if mouse was clicked
        if (Greenfoot.mouseClicked(pauseButton))
        {
            //String[] opts = { "Do you want to quit?", "OR" ,"Go back to helping Marvan!" }; // the menu items
            stopMusic();
            Greenfoot.setWorld(new PauseMenu( this)); // change to menu world
        }
        // If a menu item was clicked on, Option.getSelected should return the value of the button, else its value should be -1
        switch (Option.getSelected()) // gets the value of 'selected' in the Option class
        {
            // 'Quit' was clicked
            case 0: Greenfoot.stop(); // quit the scenario
            break;
            // Either 'Cancel' was clicked or no Option object was clicked on
            default: break; // do nothing
        }

       // music.play();
        //Volume();

    }

    public void populate(createLevel l){  

        // This will place the objects.
        addObject(l, 300, 570);
        addObject(l.stack1, 103, 155);
        addObject(l.stack2, 260, 240);
        addObject(l.stack3, 415, 140);
        addObject(l.queue,510,460);

        addObject(l.box, 300, 550);
        addObject(volumedown, 570, 100);
        addObject(volumeup, 570, 30);

        placeLetters(l);
        addObject(pauseButton, 30, 550);
        addObject(timer,240,60);

       
    }

    public void Volume(){

        if (volume < 100 && Greenfoot.mouseClicked(volumeup)) { 
            // guards against a null pointer exception and does short circuit evaluation to prevent a null
            volume+=5;
            music.setVolume(volume);

        }
        if (volume>0 && Greenfoot.mouseClicked(volumedown)) { 
            // guards against a null pointer exception and does short circuit evaluation to prevent a null
            volume-=5;
            music.setVolume(volume);

        }
    }
    
    //This will place the letters in the world randomly and push it into the stack.
    public void placeLetters(createLevel level){

        //genLetters contains all the letter objects that were created/
        for(int i = 0; i < level.genLetters.length;i++){
            if(level.genLetters[i].getContainer() == level.stack1){
                level.genLetters[i].x = 105; // This is the X coordinate for anything in stack1
                level.genLetters[i].y = level.stack1.getY();
                addObject(level.genLetters[i], 105, level.stack1.yCoord);
                level.stack1.updateY(); // The y is deceremented to add the next object on top of another.

            }else if(level.genLetters[i].getContainer() == level.stack2){
                level.genLetters[i].x = 263; //This is the X coordinate for anything in stack2
                level.genLetters[i].y = level.stack2.getY();
                addObject(level.genLetters[i], 263, level.stack2.yCoord);
                level.stack2.updateY();

            }else if (level.genLetters[i].getContainer() == level.stack3){
                level.genLetters[i].x = 415; //This is the X coordinate for anything in stack3
                level.genLetters[i].y = level.stack3.yCoord; // This is the y

                addObject(level.genLetters[i], 415, level.stack3.yCoord);
                level.stack3.updateY();
            }else if(level.genLetters[i].getContainer() == level.box){
                level.genLetters[i].x = level.box.xCoord; //This is the X coordinate for anything in stack3
                level.genLetters[i].y = 550; // This is the y

                addObject(level.genLetters[i], level.box.xCoord+45, 550);
                level.box.updateX();

            }
              
        
        }
        level.stack1.removedItem();
        level.stack2.removedItem();
        level.stack3.removedItem();
    }
    
    public void playMusic()
    {
        music.play();
    }
    
    public void started()
    {
        playMusic();
    }
    
    public void stopMusic()
    {
         music.stop();
    }
    
    public void stopped()
    {
        stopMusic();
    }
    public void act() {
        // Proceed to MenuWorld if mouse was clicked
        pause();

        Volume();
        
    }

}
    

