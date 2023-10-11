import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

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
    
    public Operaciones ()
    {
        GreenfootImage image = getImage();
        image.setTransparency(0); // Establecer la transparencia al 0 para que no sea visible
        setImage(image);
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
