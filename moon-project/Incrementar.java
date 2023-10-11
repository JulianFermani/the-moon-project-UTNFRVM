import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Incrementar extends Operaciones
{   
    public Incrementar()
    {
        setImage("INC.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth,imageHeight);
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
    };
}
