import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/*public class SegundoNumero extends NumeroAFormar
{
    private int segundoNumeroRandom;
    
    public SegundoNumero(){
        segundoNumeroRandom = verificarNumero();
    }
    
    public int verificarNumero(){    
        if (numeroRandom == 4){
            segundoNumeroRandom = Greenfoot.getRandomNumber(6);
        } else {
            segundoNumeroRandom = Greenfoot.getRandomNumber(10);
        }
        
        setImage(Numeros[segundoNumeroRandom]);
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(imageWidth, imageHeight);
        
        return (segundoNumeroRandom);
    }
}*/

public class SegundoNumero extends NumeroAFormar {
    private int segundoNumeroRandom;

    public SegundoNumero() {
        segundoNumeroRandom = verificarNumero();
        setImage(Numeros[segundoNumeroRandom]);
        GreenfootImage image = getImage();
        image.scale(imageWidth, imageHeight);
    }

    private int verificarNumero() {
        if (numeroRandom != 4) {
            segundoNumeroRandom = Greenfoot.getRandomNumber(10);
        } else {
            segundoNumeroRandom = Greenfoot.getRandomNumber(6);
        }
        return segundoNumeroRandom;
    }
}
