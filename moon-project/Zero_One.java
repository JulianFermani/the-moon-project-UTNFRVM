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
    int booleano;
    public Zero_One ()
    {   
        aleatorio = Greenfoot.getRandomNumber(2);
        if (aleatorio == 0){
            setImage("art_8.png");
            booleano = 0;
        }else{
            setImage("art_7.png");
            booleano = 1;
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
