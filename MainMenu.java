import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    GreenfootSound music = new GreenfootSound("Alien Music.mp3");
    MainMenuPlayButton playButton = new MainMenuPlayButton();
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        super(600, 600, 1);
        //GreenfootSound music = new GreenfootSound("Alien Music.mp3");
        //music.playLoop();
        prepare();
        
        //Greenfoot.playSound("Alien Music.mp3");
    }
   
    private void prepare() {
        addObject(playButton, 299, 302);

    }
    
    public void act() {  
        //music.play();

        if (Greenfoot.mouseClicked(playButton)) { 
            // guards against a null pointer exception and does short circuit evaluation to prevent a null
            Greenfoot.setWorld(new LevelPicker());
            
        }
    }
}
