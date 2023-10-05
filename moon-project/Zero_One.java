import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZERO_ONE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zero_One extends Bin
{
    /**
     * Act - do whatever the ZERO_ONE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int aleatorio;
    public Zero_One ()
    {   
        aleatorio = Greenfoot.getRandomNumber(2);
        if (aleatorio == 0){
            setImage("art_8.png");
        }else{
            setImage("art_7.png");
        }
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(imageWidth,imageHeight);
    }
    public void act()
    {
        // Add your action code here.
    }
}
