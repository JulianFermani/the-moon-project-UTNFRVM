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
    public int numeroRandom;
    public MyWorld()
    {    
        super(9, 5, 140);
        setBackground("fondo.png");
        
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
        String[] rutasImagenes = {"ocho.png","cuatro.png","dos.png","uno.png","D.png","C.png","B.png"};

        NumerosYLetras numero1 = new NumerosYLetras(rutasImagenes[0]);
        NumerosYLetras numero2 = new NumerosYLetras(rutasImagenes[1]);
        NumerosYLetras numero3 = new NumerosYLetras(rutasImagenes[2]);
        NumerosYLetras numero4 = new NumerosYLetras(rutasImagenes[3]);
        NumerosYLetras letraD = new NumerosYLetras(rutasImagenes[4]);
        NumerosYLetras letraC = new NumerosYLetras(rutasImagenes[5]);
        NumerosYLetras letraB = new NumerosYLetras(rutasImagenes[6]);
        
        //Se agregan las imagenes de la bateria
        Bateria bateria1 = new Bateria(0);
        addObject(bateria1,9,1);
        Bateria bateria2 = new Bateria(0);
        addObject(bateria2,9,2);
        Bateria bateria3 = new Bateria(0);
        addObject(bateria3,9,3);
        
        //Imagenes de las vidas
        Vida vidas = new Vida(0);
        addObject(vidas, 9,0);
        // Se añaden los 8, 4, 2 y 1.
        addObject(numero1, 4, 0);
        addObject(numero2, 5, 0);
        addObject(numero3, 6, 0);
        addObject(numero4, 7, 0);
        
        // Se añade la D,B y C.
        addObject(letraD, 3, 1);
        addObject(letraC, 3, 2);
        addObject(letraB, 3, 3);
        
        addObject(new Operaciones(), 0,0);

        
        numeroRandom = Greenfoot.getRandomNumber(46); // Calcula un número aleatorio entre 0 y 44
        addObject (new PrimerNumero(numeroRandom / 10), 2, 4);
        addObject (new SegundoNumero(numeroRandom % 10), 3, 4);

        
        addObject(new HowToPlayButton(), 3,0);
        
        // Esta parte añade el marco del codigo QR con su misma clase.
        GreenfootImage marcoQR = new GreenfootImage("fondoQR.png");
        marcoQR.scale(133, 133);
        Actor imagenActor = new HowToPlayButton();
        imagenActor.setImage(marcoQR);
        addObject(imagenActor, 3, 0);

    }
    public int getNumeroRandom(){
        return numeroRandom;
    }
}
