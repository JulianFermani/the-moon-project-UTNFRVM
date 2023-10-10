import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Operaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Operaciones extends Actor
{
    
    int imageWidth = 110; // Ancho en píxeles
    int imageHeight = 110   ; // altura en px
    int booleano, filaATrabajar, columnaATrabajar, fila1, fila2, booleanoObjeto1Aux;
    Integer filaSupuesta = null;
    Zero_One objeto, objeto1, objeto2, aux;
    int bandera = 0;
    boolean esperando = false; // Bandera para controlar si se espera la tecla "D"
    int booleanoDelObjeto;
    String ultimaTecla = "";
    Map <String, Integer> mapaFilas = new HashMap<>(){
        {
            put("d", 1); //La fila D tiene asignada la fila 1;
            put("c", 2); //La fila C tiene asignada la fila 2;
            put("b", 3); //La fila B tiene asignada la fila 3;
        }
    };
    
    
    /**
     * Act - do whatever the Operaciones wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Operaciones ()
    {
        GreenfootImage image = getImage();
        image.setTransparency(0); // Establecer la transparencia al 0 para que no sea visible
        setImage(image);
    }
    public void act()
    {
        checkKeys();
    }
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("1"))
        {
            columnaATrabajar = 7; // Se sabe que la columna a trabajar es igual a coordenadaX.
            filaATrabajar = elegirFila();
            if (esperando) // Solo entra si se toco alguna tecla de interes.
            {
              bandera = 0;
              for (int i = 0; i <= 3; i++)
              {
                  // Toma el objeto de interes y le saca el booleano.
                  objeto = buscarObjetoEnCoordenadas(columnaATrabajar, filaATrabajar);
                  booleanoDelObjeto = objeto.booleano;

                  if (booleanoDelObjeto == 1)
                  {
                    if (bandera == 0)
                    {
                        // Si es cero cambia su valor de booleano a 0 y le cambia la imagen.
                        objeto.booleano = 0;
                        objeto.setImage("art_8.png");
                        GreenfootImage image = objeto.getImage();
                        image.scale(imageWidth, imageHeight);
                        // Decrementa para ir al objeto de su izquierda.
                        columnaATrabajar -= 1;
                    }
                  }else if (booleanoDelObjeto == 0)
                    {
                      // Si es cero el valor del booleano quiere decir que llegamos al limite
                      // entonces cambiamos su valor a 1 y activamos la bandera.
                      bandera = 1;
                      objeto.booleano = 1;
                      objeto.setImage("art_7.png");
                      GreenfootImage image = objeto.getImage();
                      image.scale(imageWidth, imageHeight);
                    }
              }
            }           
        }
        else if (Greenfoot.isKeyDown("2"))
        {
            columnaATrabajar = 7; // Se sabe que la columna a trabajar es igual a coordenadaX.
            filaATrabajar = elegirFila();
            // Solo entra si se toco alguna tecla de interes.
            if (esperando)
            {
              bandera = 0;
              for (int i = 0; i <= 3; i++)
              {
                  // Toma el objeto de interes y le saca el booleano.
                  objeto = buscarObjetoEnCoordenadas(columnaATrabajar, filaATrabajar);
                  booleanoDelObjeto = objeto.booleano;

                  if (booleanoDelObjeto == 0)
                  {
                    if (bandera == 0)
                    {
                        // Si es cero cambia su valor de booleano a 1 y le cambia la imagen.
                        objeto.booleano = 1;
                        objeto.setImage("art_7.png");
                        GreenfootImage image = objeto.getImage();
                        image.scale(imageWidth, imageHeight);
                        // Decrementa para ir al objeto de su izquierda.
                        columnaATrabajar -= 1;
                    }
                  }else if (booleanoDelObjeto == 1)
                    {
                      // Si es uno el valor del booleano quiere decir que llegamos al limite
                      // entonces cambiamos su valor a 0 y activamos la bandera.
                      bandera = 1;
                      objeto.booleano = 0;
                      objeto.setImage("art_8.png");
                      GreenfootImage image = objeto.getImage();
                      image.scale(imageWidth, imageHeight);
                    }
              }
            }
        }else if (Greenfoot.isKeyDown("3")){
        
        }else if (Greenfoot.isKeyDown("4")){
        
        }else if (Greenfoot.isKeyDown("5")){
            // Se le da al usuario la opcion de elegir las filas a mover.
            fila1 = elegirFila();
            fila2 = elegirFila();
            for (int i=7; i > 3; i--){
                // Se obtienen los dos objetos de interes por fila y columna.
                objeto1 = buscarObjetoEnCoordenadas(i, fila1);
                objeto2 = buscarObjetoEnCoordenadas(i, fila2);
                // Se le cambian los valores del objeto1 por los del objeto2. 
                objeto1.booleano = objeto2.booleano;
                objeto1.setImage(objeto2.getImage());
        }
        }else if (Greenfoot.isKeyDown("6")){
            columnaATrabajar = 7; // Se sabe que la columna a trabajar es igual a coordenadaX.
            while (true) // While true para que el programa se quede esperando una tecla.
            {
              // En cada if se setea la fila a la que pertenece la letra.
              if (Greenfoot.isKeyDown("D"))
              {
                esperando = true;
                filaATrabajar =  1;
                break;
              }
              else if (Greenfoot.isKeyDown("C"))
              {
                esperando = true;
                filaATrabajar = 2;
                break;
            }
              else if (Greenfoot.isKeyDown("B"))
              {
                esperando = true;
                filaATrabajar = 3;
                break;
              }
            }
            if (esperando)
            {
              bandera = 0;
              for (int i = 0; i <= 3; i++)
              {
                  // Toma el objeto de interes y le saca el booleano.
                  objeto = buscarObjetoEnCoordenadas(columnaATrabajar, filaATrabajar);
                  booleanoDelObjeto = objeto.booleano;
                  if (bandera == 0){
                      if (booleanoDelObjeto == 0){
                          // En caso de ser 0 quiere decir que esta apagado, entonces basicamente lo prendo cambiandole el valor booleano y seteandole la imagen
                        objeto.booleano = 1; // Cambio el valor booleano del objeto, como estaba apagado (0) lo cambio a prendido (1)
                        objeto.setImage("art_7.png");
                        GreenfootImage image = objeto.getImage();
                        image.scale(imageWidth, imageHeight); // seteo la dimension de la imagen
                        columnaATrabajar -= 1; // Resto una columna lo cual hace que pase al elemento de la izquierda y asi sucesivamente
                      }else if (booleanoDelObjeto == 1){
                          // En caso de ser 1 quiere decir que esta prendido, entonces basicamente lo prendo cambiandole el valor booleano y seteandole la imagen
                        objeto.booleano = 0;  // Cambio el valor booleano del objeto, como estaba prendido (1) lo cambio a apagado (0)
                        objeto.setImage("art_8.png");
                        GreenfootImage image = objeto.getImage();
                        image.scale(imageWidth, imageHeight);  // seteo la dimension de la imagen
                        columnaATrabajar -= 1; // Resto una columna lo cual hace que pase al elemento de la izquierda y asi sucesivamente
                      }
                }
              }
        }else if (Greenfoot.isKeyDown("7")){
        
        }else if (Greenfoot.isKeyDown("8")){
        
        }
    }
}
    public Zero_One buscarObjetoEnCoordenadas(int xObjetivo, int yObjetivo)
                {
                    World mundo = getWorld(); // Obtén una referencia al mundo actual
                    List<Zero_One> objetos = mundo.getObjects(Zero_One.class); // Obtiene todos los objetos de la clase Zero_One en el mundo
                    
                    for (Zero_One objeto : objetos)
                    {
                        if (objeto.getX() == xObjetivo && objeto.getY() == yObjetivo)
                        {
                            return objeto; // Devuelve el objeto encontrado en las coordenadas X e Y específicas
                        }
                    }
                    
                    return null; // Si no se encuentra ningún objeto en las coordenadas especificadas, devuelve null
                }
    public int elegirFila()
    {
        while (true)
        {
            ultimaTecla = Greenfoot.getKey(); // Esta funcion de greenfoot obtiene la ultima tecla apretada.
            if (ultimaTecla != "1" || ultimaTecla != "2"|| ultimaTecla != "3"|| ultimaTecla != "4"|| ultimaTecla != "5"|| ultimaTecla != "6"|| ultimaTecla != "7"|| ultimaTecla != "8") // Si es distinto de alguna de las teclas del principio. 
            {
                filaSupuesta = mapaFilas.get(ultimaTecla);
                if (filaSupuesta != null)
                {
                    filaATrabajar = filaSupuesta.intValue();
                    esperando = true;
                    break;
                }
            }
        }
        return filaATrabajar;
    }
            
}
