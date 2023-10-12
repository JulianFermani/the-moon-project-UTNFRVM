import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class SegundoNumero extends NumeroAFormar
{
    private int segundoNumero = numeroRandom % 10;
    public SegundoNumero(){
        setImage(Numeros[segundoNumero]);
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(imageWidth, imageHeight);
    }
}
