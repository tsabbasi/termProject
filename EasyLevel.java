import greenfoot.*;

/**
 * Write a description of class EasyLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasyLevel extends Level
{

    createLevel level = new createLevel("eggs");
    Pause pauseButton = new Pause();

    GreenfootSound music = new GreenfootSound("EasyModeEdit.mp3");

    /**
     * Constructor for objects of class EasyLevel.
     * 
     */
    public EasyLevel()
    {
        populate(level);
        addObject(pauseButton, 50, 550);
    }
    
    public void act() {
        // Proceed to MenuWorld if mouse was clicked
        if (Greenfoot.mouseClicked(pauseButton))
        {
            //String[] opts = { "Do you want to quit?", "OR" ,"Go back to helping Marvan!" }; // the menu items
            String[] opts = { "MenuButton.png","PlayButton.png" };
            Greenfoot.setWorld(new PauseMenu(opts, this)); // change to menu world
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

        music.play();

    }
    
}
