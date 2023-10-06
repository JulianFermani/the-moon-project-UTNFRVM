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
        super(9, 5, 140);
        setBackground("background.png");
        
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
        // Se añade el logo de la UTN.
        addObject(new Logo(), 2, 0);
        
        // Se añaden los ceros o unos binarios.
        addObject(new Zero_One(), 4, 1);
        addObject(new Zero_One(), 5, 1);
        addObject(new Zero_One(), 6, 1);
        addObject(new Zero_One(), 7, 1);
        
        addObject(new Zero_One(), 4, 2);
        addObject(new Zero_One(), 5, 2);
        addObject(new Zero_One(), 6, 2);
        addObject(new Zero_One(), 7, 2);
        
        addObject(new Zero_One(), 4, 3);
        addObject(new Zero_One(), 5, 3);
        addObject(new Zero_One(), 6, 3);
        addObject(new Zero_One(), 7, 3);

        //Se añaden las imagenes de los numeros
        String[] rutasImagenes = {"ocho.png", "cuatro.png", "dos.png", "uno.png"};

        Numeros numero1     = new Numeros(rutasImagenes[0]);
        Numeros numero2 = new Numeros(rutasImagenes[1]);
        Numeros numero3 = new Numeros(rutasImagenes[2]);
        Numeros numero4 = new Numeros(rutasImagenes[3]);
        // Se añaden los 8, 4, 2 y 1.
        addObject(numero1, 4, 0);
        addObject(numero2, 5, 0);
        addObject(numero3, 6, 0);
        addObject(numero4, 7, 0);
        
        addObject(new Operaciones(), 0,0);
    }
        
        
}
