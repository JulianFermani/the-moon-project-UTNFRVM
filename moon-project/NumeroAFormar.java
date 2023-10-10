import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class NumeroAFormar extends Actor
{
    private int numeroRandom;
    private String Numeros[] = {"0.png", "1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", "9.png"};
    int imageWidth = 50; // Ancho en píxeles
    int imageHeight = 50; // Altura en px

public NumeroAFormar()
    {
        // Generacion de los dos numeros aleatorios del 0 al 9.
        numeroRandom = Greenfoot.getRandomNumber(10);
    
        setImage(Numeros[numeroRandom]);
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(imageWidth,imageHeight);
    }
}
