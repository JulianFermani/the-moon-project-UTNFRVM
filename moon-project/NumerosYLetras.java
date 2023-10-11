import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class NumerosYLetras extends Actor
{
    int imageWidth = 120; // Ancho en píxeles
    int imageHeight = 120; // Altura en px
    private String[] rutasImagenes = {"ocho.png","cuatro.png","dos.png","cuatro.png","D.png","B.png","C.png"}; 
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
