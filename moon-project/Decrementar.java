import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Decrementar extends Operaciones
{
    public Decrementar()
    {
        setImage("DEC.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth,imageHeight);
    }
    
    public void act()
    {
        checkKeys();
    }
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("2"))
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
        }
    }
}
