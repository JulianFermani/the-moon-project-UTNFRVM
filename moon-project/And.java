import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class And extends Operaciones
{
    private int imageWidth = 120;
    private int imageHeight = 120;
    public And()
    {
        setImage("AND.png");
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(imageWidth,imageHeight);
    }
    public void act()
    {
        checkKeys();
    }
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("8")){
            fila1 = elegirFila();
            fila2 = elegirFila();
            imageWidth = 110;
            imageHeight = 110;
            for (int i=7; i > 3; i--){
                // Se obtienen los dos objetos de interes por fila y columna.
                objeto1 = buscarObjetoEnCoordenadas(i, fila1);
                objeto2 = buscarObjetoEnCoordenadas(i, fila2);

                if (objeto1.booleano == 1 && objeto1.booleano == objeto2.booleano){
                    objeto1.booleano = objeto2.booleano;
                    objeto1.setImage(objeto2.getImage());
                } else if (objeto1.booleano == 0 | objeto2.booleano==0 && objeto1.booleano != objeto2.booleano){
                    objeto1.booleano = 0;
                    objeto1.setImage("art_8.png");
                    GreenfootImage image = objeto1.getImage();
                    image.scale(imageWidth, imageHeight);
                }
        }
    }
    }
}
