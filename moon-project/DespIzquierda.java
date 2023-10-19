import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class DespIzquierda extends Operaciones
{
    Zero_One objeto;
    List<Zero_One> vectorObjetosFila = new ArrayList<Zero_One>();
    int i, booleanoUltimo;
    GreenfootImage imagenUltimo, imagen;
    public DespIzquierda()
    {
        setImage("ROR.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth,imageHeight);
    }
    public void act()
    {
        checkKeys();
    }
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("3"))
        {
            columnaATrabajar = 7; // Se sabe que la columna a trabajar es igual a coordenadaX.
            filaATrabajar = elegirFila();
            
            if (esperando) // Solo entra si se toco alguna tecla de interes.
            {
              vectorObjetosFila = obtenerVectorObjetos(filaATrabajar);
              booleanoUltimo= vectorObjetosFila.get(0).booleano;
              imagenUltimo = vectorObjetosFila.get(0).getImage();
              for (i = 0; i < vectorObjetosFila.size() - 1; i++)
              {
                vectorObjetosFila.get(i).booleano = vectorObjetosFila.get(i+1).booleano;
                imagen = vectorObjetosFila.get(i+1).getImage();
                vectorObjetosFila.get(i).setImage(imagen); 
                
              }
              vectorObjetosFila.get(vectorObjetosFila.size() - 1).booleano = booleanoUltimo;
              vectorObjetosFila.get(vectorObjetosFila.size() - 1).setImage(imagenUltimo);
            }           
        }    
    }
}
