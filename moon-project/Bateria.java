import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bateria extends Actor
{
    public String Baterias[] = {"bateriallena.png", "bateriamedia.png", "bateriavacia.png"};
    public int imageWidth = 50; // Ancho en píxeles
    public int imageHeight = 100; // Altura en px

    public Bateria(int etapas) {
        setImage(Baterias[etapas]);
        GreenfootImage image = getImage();
        image.scale(imageWidth, imageHeight);
        setImage(image);
    }
}
