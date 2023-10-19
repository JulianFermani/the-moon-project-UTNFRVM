import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Vida extends Actor
{
    public String Vidas[] = {"corazonlleno.png", "corazonsemivacio.png", "corazonmediovacio.png","corazonunpocovacio.png","corazonvacio.png"};
    public int imageWidth = 110; // Ancho en píxeles
    public int imageHeight = 100; // Altura en px

    public Vida(int porcentaje) {
        setImage(Vidas[porcentaje]);
        GreenfootImage image = getImage();
        image.scale(imageWidth, imageHeight);
        setImage(image);
    }
}
