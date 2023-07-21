import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    int faceDirection = 0;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -16;
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Movement();
        collect();
        checkFall();
        
        if (getY() >= 350)
        {
            World myworld;
            myworld = getWorld();
            myworld.stopped();
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    
    public void Movement()
    {
        
        if (Greenfoot.isKeyDown("left"))
        {
          move(-6);
          if(faceDirection == 1)
          {
          getImage().mirrorHorizontally(); 
          }
          faceDirection = 0;
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
          move(6);
          if(faceDirection == 0)
          {
          getImage().mirrorHorizontally(); 
          }
          faceDirection = 1;
        }
        
        if (Greenfoot.isKeyDown("space") && onGround() == true)
        {
          vSpeed = jumpHeight;
          Greenfoot.playSound("sfxJump.mp3");
          fall();
        }
    }
    
    public car()
    {
        getImage().scale(getImage().getWidth()/14,getImage().getHeight()/14);
    }
    
    public void collect()
    {
        Actor coin;
        coin = getOneObjectAtOffset(0,0, coin.class);
        
        if (coin != null)
        {
            Greenfoot.playSound("sfxCoin.mp3");
            World myworld;
            myworld = getWorld();
            myworld.removeObject(coin);
        }
        
        Actor gas;
        gas = getOneObjectAtOffset(0,0, gas.class);
        
        if (gas != null)
        {
            Greenfoot.playSound("sfxPower.mp3");
            World myworld;
            myworld = getWorld();
            myworld.removeObject(gas);
        }
        
        
    }
    
    private void fall()
    {
        setLocation(getX(),getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/4, ground.class);
        return under != null;
        
        
    }
    public void checkFall()
        {
            if (onGround() == false)
            {
                fall();
            }
        }
}

