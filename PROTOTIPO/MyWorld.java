import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public GreenfootSound bgmusic = new GreenfootSound("Music.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        bgmusic.playLoop();
        prepare();
    }
    public void stopped()
    {
         bgmusic.stop();
    }
     
    public void started()
    {
        bgmusic.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        car car = new car();
        addObject(car,100,300);

        coin coin = new coin();
        addObject(coin,200,300);

        coin coin2 = new coin();
        addObject(coin2,300,300);

        coin coin3 = new coin();
        addObject(coin3,400,300);

        gas gas = new gas();
        addObject(gas,500,300);

        ground ground = new ground();
        addObject(ground,76,379);

        ground ground2 = new ground();
        addObject(ground2,346,289);

        car.setLocation(224,331);
        ground ground3 = new ground();
        addObject(ground3,382,369);

        ground ground4 = new ground();
        addObject(ground4,526,307);
        car.setLocation(216,331);

        car.setLocation(72,335);
        coin.setLocation(155,318);
        coin2.setLocation(231,200);
        ground2.setLocation(248,280);
        coin3.setLocation(279,210);
        ground2.setLocation(207,285);
        car.setLocation(140,320);
        coin2.setLocation(180,247);
        coin3.setLocation(234,204);
        ground3.setLocation(343,189);
        gas.setLocation(438,124);
        coin3.setLocation(308,134);
        coin2.setLocation(194,222);
        car.setLocation(42,316);
        ground2.setLocation(255,379);
        
        coin[] Coinss = new coin[10];
        for (int i= 0; i < Coinss.length; i++)
        {
            Coinss[i] = new coin();
            int coinPosX = Greenfoot.getRandomNumber(getWidth());
            int coinPosY = Greenfoot.getRandomNumber(getHeight());
            addObject(Coinss[i], coinPosX, coinPosY);
        }
        
    }
}
