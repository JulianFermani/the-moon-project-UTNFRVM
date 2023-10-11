import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class NumerosYLetras extends Actor
{
    /**
     * Act - do whatever the Numeros wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int imageWidth = 140; // Ancho en píxeles
    int imageHeight = 140; // Altura en px
    //imageArray[] = new GreenfootImage[4];
    private String[] rutasImagenes = {"number-0.png","number-1.png","number-0.png",}; 
    public NumerosYLetras(String rutaImagen){
        GreenfootImage imagen = new GreenfootImage(rutaImagen);
        setImage(imagen);
        imagen.scale(imageWidth,imageHeight);

    }
    public void act()
    {
        // Add your action code here
    }
}
