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
  for (int columna = 4; columna <= 7; columna++) { // Iterar a través de todas las columnas
    if (Greenfoot.isKeyDown("7")) {
        int estado = 0;

        while (true) {
            if (estado == 0) {
                if (Greenfoot.isKeyDown("D")) {
                    estado = 1;
                } else if (Greenfoot.isKeyDown("C")) {
                    estado = 2;
                } else if (Greenfoot.isKeyDown("B")) {
                    estado = 3;
                }
            }

            if (estado > 0) {
                if (Greenfoot.isKeyDown("B") || Greenfoot.isKeyDown("C") || Greenfoot.isKeyDown("D")) {
                    int filaATrabajar = 0; // Inicializar fila en 0

                    if (estado == 1 && Greenfoot.isKeyDown("D")) {
                        filaATrabajar = 1;
                    } else if (estado == 2 && Greenfoot.isKeyDown("C")) {
                        filaATrabajar = 2;
                    } else if (estado == 3 && Greenfoot.isKeyDown("B")) {
                        filaATrabajar = 3;
                    }

                    // Realiza la operación OR en función de filaATrabajar y columna
                    objeto = buscarObjetoEnCoordenadas(columna, filaATrabajar);

                    if (objeto != null) {
                        int booleanoDelObjeto = objeto.booleano;
                        objeto.booleano = (booleanoDelObjeto == 0) ? 1 : 0;
                        objeto.setImage((booleanoDelObjeto == 0) ? "art_7.png" : "art_8.png");
                        GreenfootImage image = objeto.getImage();
                        image.scale(imageWidth, imageHeight);
                    }

                    break; // Sal del bucle después de realizar la operación OR
                }
            }
        }
    }
}

}
}