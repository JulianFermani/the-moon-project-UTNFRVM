import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mover extends Operaciones
{
    private int imageWidth = 115;
    private int imageHeight = 115;
    
    public Mover()
    {
        setImage("MOV.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth,imageHeight);
    }
    public void act()
    {
        checkKeys();
    }
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("5")){
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
        }
    }
}
