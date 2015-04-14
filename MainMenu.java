import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    GreenfootSound music = new GreenfootSound("Alien Music.mp3");
    public MainMenu()
    {    
        super(600, 600, 1);
        //GreenfootSound music = new GreenfootSound("Alien Music.mp3");
        //music.playLoop();
        prepare();
        
        //Greenfoot.playSound("Alien Music.mp3");
    }
   
    private void prepare() {
        MainMenuPlayButton playButton = new MainMenuPlayButton();
        addObject(playButton, 299, 302);

    }
    
    public void act() {  
        music.play();

        if (Greenfoot.getMouseInfo() != null && Greenfoot.getMouseInfo().getButton() == 1) { 
            // guards against a null pointer exception and does short circuit evaluation to prevent a null
            Greenfoot.setWorld(new LevelPicker());
            
        }
    }
}
