import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Incrementar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Incrementar extends Operaciones
{
    /**
     * Act - do whatever the Incrementar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public Incrementar()
    {
        setImage("INC.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth,imageHeight);
    }
}
