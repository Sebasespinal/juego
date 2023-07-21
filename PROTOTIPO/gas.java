import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gas extends Actor
{
    /**
     * Act - do whatever the gas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-4);
        if(getX() == 0)
        {
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(400)+50);
        }  
    }
    
    public gas()
    {
        getImage().scale(getImage().getWidth()/9,getImage().getHeight()/9);
    }
}
