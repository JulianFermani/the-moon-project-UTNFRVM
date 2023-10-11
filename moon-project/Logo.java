import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Logo extends Actor
{
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
