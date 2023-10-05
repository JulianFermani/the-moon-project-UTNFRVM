import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Numeros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numeros extends Actor
{
    /**
     * Act - do whatever the Numeros wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int imageWidth = 120; // Ancho en píxeles
    int imageHeight = 120; // Altura en px
    //imageArray[] = new GreenfootImage[4];
    private String[] rutasImagenes = {"ocho.png","cuatro.png","dos.png","cuatro.png"}; 
    public Numeros(String rutaImagen){
        GreenfootImage imagen = new GreenfootImage(rutaImagen);
        setImage(imagen);
        imagen.scale(imageWidth,imageHeight);

    }
    public void act()
    {
        // Add your action code here
    }
}
