import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coin extends Actor
{
    /**
     * Act - do whatever the coin wants to do. This method is called whenever
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
    
    public coin()
    {
        getImage().scale(getImage().getWidth()/12,getImage().getHeight()/12);
    }
}
