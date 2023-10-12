import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class NumeroAFormar extends Actor {
    public String Numeros[] = {"number-0.png", "number-1.png", "number-2.png", "number-3.png", "number-4.png", "number-5.png", "number-6.png", "number-7.png", "number-8.png", "number-9.png"};
    public int imageWidth = 140; // Ancho en píxeles
    public int imageHeight = 120; // Altura en px

    public NumeroAFormar(int numero) {
        setImage(Numeros[numero]);
        GreenfootImage image = getImage();
        image.scale(imageWidth, imageHeight);
        setImage(image);
    }
}

