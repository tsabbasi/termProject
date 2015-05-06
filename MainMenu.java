import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    // music needs to be static so that the reset button does not cause an exception
    private static GreenfootSound music;  
    private MainMenuPlayButton playButton;
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        super(600, 600, 1);
        prepare();
    }
    
    public MainMenu(boolean shouldPlayMusic)
    {
        super(600, 600, 1);
        prepare();
        if (shouldPlayMusic)
        {
            playMusic();
        }
    }
    
    public void playMusic()
    {
        music = new GreenfootSound("Alien Music.mp3");
        music.play();
    }
    
    public void stopMusic()
    {
        music.stop();
    }
    
    private void prepare() {
        playButton = new MainMenuPlayButton();
        addObject(playButton, 299, 302);     
    }
    
    public void addLevelPicker()
    {
        addObject(new Easy(), 301, 252);
        addObject(new Medium(), 301, 315);
        addObject(new Hard(), 299, 375);    
    }
    
    public void started()
    {
        playMusic();
    }
    
    public void stopped()
    {
        stopMusic();
    }
    
    public void act() {  
       
    }
}
