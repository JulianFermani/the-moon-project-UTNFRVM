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
        GreenfootImage incrementarImage = new GreenfootImage("operadores/INC.png");
        incrementarImage.scale(imageWidth,imageHeight);
        GreenfootImage decrementarImage = new GreenfootImage("operadores/DEC.png");
        decrementarImage.scale(imageWidth,imageHeight);
        GreenfootImage despDerechaImage = new GreenfootImage("operadores/ROL.png");
        despDerechaImage.scale(imageWidth,imageHeight);
        GreenfootImage despIzquierdaImage = new GreenfootImage("operadores/ROR.png");
        despIzquierdaImage.scale(imageWidth,imageHeight);
        GreenfootImage MoverImage = new GreenfootImage("operadores/MOV.png");
        MoverImage.scale(imageWidth,imageHeight);
        GreenfootImage NegacionImage = new GreenfootImage("operadores/NOT.png");
        NegacionImage.scale(imageWidth,imageHeight);
        GreenfootImage OrImage = new GreenfootImage("operadores/ROR.png");
        OrImage.scale(imageWidth,imageHeight);
        GreenfootImage AndImage = new GreenfootImage("operadores/AND.png");
        AndImage.scale(imageWidth,imageHeight);
        GreenfootImage XorImage = new GreenfootImage("operadores/XOR.png");
        XorImage.scale(imageWidth,imageHeight);
        GreenfootImage Plus_lessImage = new GreenfootImage("operadores/PLUS_LESS.png");
        Plus_lessImage.scale(imageWidth,imageHeight);  
        addObject(new Incrementar (), 0, 0);
        addObject(new Decrementar (), 0, 1);
        addObject(new DespDerecha (), 1, 0);
        addObject(new DespIzquierda (), 1, 1);
        addObject(new Mover (), 0, 2);
        addObject(new Negacion (), 1, 2);
        addObject(new Or (), 0, 3);
        addObject(new And (), 1, 3);
        addObject(new Xor (), 0, 4);
        addObject(new Plus_less (), 1, 4);
        
        
        ((Incrementar) getObjects(Incrementar.class).get(0)).setImage(incrementarImage);
        ((Decrementar) getObjects(Decrementar.class).get(0)).setImage(decrementarImage);
        ((DespDerecha) getObjects(DespDerecha.class).get(0)).setImage(despDerechaImage);
        ((DespIzquierda) getObjects(DespIzquierda.class).get(0)).setImage(despIzquierdaImage);
        ((Mover) getObjects(Mover.class).get(0)).setImage(MoverImage);
        ((Negacion) getObjects(Negacion.class).get(0)).setImage(NegacionImage);
        ((Or) getObjects(Or.class).get(0)).setImage(OrImage);
        ((And) getObjects(And.class).get(0)).setImage(AndImage);
        ((Xor) getObjects(Xor.class).get(0)).setImage(XorImage);
        ((Plus_less) getObjects(Plus_less.class).get(0)).setImage(Plus_lessImage);
    }
}
