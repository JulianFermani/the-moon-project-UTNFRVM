import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class And here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class And extends Operaciones
{
    public And()
    {
        setImage("AND.png");
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(imageWidth,imageHeight);
    }
    public void act()
    {
        
    }
    // Evitar la respuesta a eventos de clic del mouse
    public void onMousePress() {
        // No realizar ninguna acción al hacer clic en el objeto
    }
    

}
