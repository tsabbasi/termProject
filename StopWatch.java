import greenfoot.*;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.Color;

/**
 * Write a description of class StopWatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StopWatch extends Actor 
{

    private boolean isInReset;
    private long initialTime;
    private long currentTime;
    private long setTime;
    private GreenfootImage timeDisplay;

    public StopWatch(long setTime)
    {
        reset();
        this.setTime = setTime;
        timeDisplay = new GreenfootImage(100,50);
        timeDisplay.setColor(new Color(255,255,255));
        updateDisplay();
    }

    public void reset()
    {
        isInReset = true;
        initialTime = currentTime = 0;
    }

    public void startStop()
    {
        currentTime = Calendar.getInstance().getTimeInMillis();
        if (isInReset){
            initialTime = currentTime;
            isInReset=false;
        }
    }

    public long elapsedTime()
    {
        return setTime-(currentTime - initialTime)/1000;
    }
    
    public String toString()
    {
        long time = elapsedTime();
        if (time < 0){
            time = 0;
        }
        long hours = time / 3600;
        time %= 3600;
        long mins = time / 60;
        long secs = time % 60;
        String result = "";
        if (hours < 10){
            result += "0";
        }
        result += hours + ":";
        if (mins < 10){
            result += "0";
        }
        result += mins + ":";
        if (secs < 10){
            result += "0";
        }
        result += secs;
        return result;
    }
    
    public void updateDisplay()
    {
        timeDisplay.clear();
        timeDisplay.drawString(toString(),10,10);
        setImage(timeDisplay);
    }
    
    public void act()
    {
        startStop();
        updateDisplay();
        if (elapsedTime() <= 0){
            Greenfoot.setWorld(new MainMenu(true));
        }
    }
}
