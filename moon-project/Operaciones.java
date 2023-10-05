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
    
    int imageWidth = 70; // Ancho en píxeles
    int imageHeight = 70; // altura en px
    int booleano;
    Zero_One objeto;
    private int contadorEspera = 0; // Contador para la espera después de presionar "1"
    private boolean esperandoD = false; // Bandera para controlar si se espera la tecla "D"
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
            //ESTO NO FUNCIONA CORRECTAMENTE, VER LA FORMA DE QUE CUANDOS SE INGRESE EL 1 ESPERE A QUE SU SIGUIENTE TECLA SEA UNA D.
            
            contadorEspera++; // Incrementa el contador de espera
            for (int i = 0; i <= 12000; i++) // Espera durante 60 ciclos (ajusta según sea necesario)
            {
                if (Greenfoot.isKeyDown("D"))
                {
                    esperandoD = true; // Activa la bandera para esperar "D"    
                }
                
            }
            
            if (esperandoD)
            {
                
                objeto = buscarObjetoEnCoordenadas(7, 1);
                booleano = objeto.booleano;
                
                if (booleano == 0)
                {
                    booleano = 1;
                    objeto.setImage("art_7.png");
                    GreenfootImage image = objeto.getImage();
                    image.scale(imageWidth,imageHeight);
                }
            }            
        }else if (Greenfoot.isKeyDown("2")){
        
        }else if (Greenfoot.isKeyDown("3")){
        
        }else if (Greenfoot.isKeyDown("4")){
        
        }else if (Greenfoot.isKeyDown("5")){
        
        }else if (Greenfoot.isKeyDown("6")){
        
        }else if (Greenfoot.isKeyDown("7")){
        
        }else if (Greenfoot.isKeyDown("8")){
        
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

}
