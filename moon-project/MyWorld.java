 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(9, 5, 100);
        setBackground("background.png");
        int imageWidth = 70; // Ancho en píxeles
        int imageHeight = 70; // altura en px
        
        // Se añaden los objetos en el mundo con su respectiva ubicacion.
        addObject(new Incrementar (), 0, 0);
        addObject(new Decrementar (), 1, 0);
        addObject(new DespDerecha (), 1, 1);
        addObject(new DespIzquierda (), 0, 1);
        addObject(new Mover (), 0, 2);
        addObject(new Negacion (), 1, 2);
        addObject(new Or (), 0, 3);
        addObject(new And (), 1, 3);
        addObject(new Xor (), 0, 4);
        addObject(new Plus_less (), 1, 4);
        addObject(new Logo(), 2, 0);
    }
}
