import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Or extends Operaciones
{
    public Or()
    {
        setImage("OR.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth,imageHeight);
    }
 
   public void act()
    {
        checkKeys();
    }
    public void checkKeys()
    {
         if (Greenfoot.isKeyDown("7")) {
            fila1 = elegirFila();
            fila2 = elegirFila();
            imageWidth = 110;
            imageHeight = 110;
            for (int i = 7; i > 3; i--) {
                // Se obtienen los dos objetos de interés por fila y columna.
                objeto1 = buscarObjetoEnCoordenadas(i, fila1);
                objeto2 = buscarObjetoEnCoordenadas(i, fila2);

                if (objeto1.booleano == 1 || objeto2.booleano == 1) {
                    objeto1.booleano = 1;
                    objeto1.setImage("art_7.png"); // Cambiar a la imagen correspondiente a verdadero
                } else {
                    objeto1.booleano = 0;
                    objeto1.setImage("art_8.png"); // Cambiar a la imagen correspondiente a falso
                }
                GreenfootImage image = objeto1.getImage();
                image.scale(imageWidth, imageHeight);
        }
    }
}
}