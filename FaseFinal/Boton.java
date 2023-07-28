import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends Actor
{
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);
        
        //Al detectar un nivel avanza al nivel indicado
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new Base());
        }
    }
}
