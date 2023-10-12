import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class PrimerNumero extends NumeroAFormar
{
    private int primerNumero = numeroRandom / 10;
    public PrimerNumero(){
        setImage(Numeros[primerNumero]);
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(imageWidth, imageHeight);
    }
}
