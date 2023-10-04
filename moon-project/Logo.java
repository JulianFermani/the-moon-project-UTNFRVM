import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Logo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Logo extends Actor
{
    /**
     * Act - do whatever the Logo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int imageWidth = 110; // Ancho en píxeles
    int imageHeight = 50; // altura en px
    public Logo ()
    {
        setImage("UTNB.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth,imageHeight);
    }
    public void act()
    {
        // Add your action code here.
    }
}
