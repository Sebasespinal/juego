import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fin extends World
{
    public static int money = 0;
    /**
     * Constructor for objects of class Fin.
     * 
     */
    public Fin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act()
    {
        showText("" + money, 350, 225);
    }
    private void prepare()
    {
        Boton Boton = new Boton();
        addObject(Boton,329,217);
        Boton.setLocation(341,230);
        Boton.setLocation(329,285);
    }
}
