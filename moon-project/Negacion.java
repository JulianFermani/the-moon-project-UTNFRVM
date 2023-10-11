import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Negacion extends Operaciones
{
    private int imageWidth = 115;
    private int imageHeight = 115;
    public Negacion()
    {
        setImage("NOT.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth,imageHeight);
    }
    
    public void act()
    {
        checkKeys();        
    }
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("6")){
            columnaATrabajar = 7; // Se sabe que la columna a trabajar es igual a coordenadaX.
            imageWidth = 110;
            imageHeight = 110;
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
            }
        }
    }
} 
