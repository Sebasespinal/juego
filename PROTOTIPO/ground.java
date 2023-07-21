import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ground extends Actor
{
    /**
     * Act - do whatever the ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ground()
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/4);
    }
    public void act()
    {
          move(-4);
        if(getX() == 0)
        {
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(300)+100);
        }
    }
}
