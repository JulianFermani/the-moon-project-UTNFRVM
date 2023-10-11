import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zero_One extends Actor
{
    int aleatorio;
    int booleano;
    int imageWidth = 110; // Ancho en píxeles
    int imageHeight = 110; // Altura en px
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
    public int getBooleano()
    {   
        return booleano;
    }
    public void act()
    {
        // Add your action code here.
    }
}
