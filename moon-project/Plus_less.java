import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

public class Plus_less extends Operaciones
{
    String[] rutasImagenes = {"D.png", "C.png", "B.png", "mas.png", "menos.png"};
    int multiplicador = 16, acum1 = 0, i, varBooleano, puntero = 4, punteroSigno = 5, x = 5, resultado = 0, intento = 0;
    List<Zero_One> vectorObjetosFila = new ArrayList<Zero_One>();
    NumerosYLetras objeto, objetoSigno;
    
    String imagen;
    public Plus_less()
    {
        setImage("PLUS_LESS.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth, imageHeight);
    }

    public void act()
    {
        checkKeys();
    }

    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("s"))
        {
            int fila1 = elegirFila();
            colocarRegistro(fila1);
            sumaResta();
            colocarMasMenos();
            fila1 = elegirFila();
            colocarRegistro(fila1);
            sumaResta();
            colocarMasMenos();
            fila1 = elegirFila();
            colocarRegistro(fila1);
            sumaResta();
        }
        }
    public void colocarRegistro(int fila1){
        World mundo = getWorld();
        vectorObjetosFila = obtenerVectorObjetos(filaATrabajar);
        if (mundo != null) {
                if (fila1 == 1)
                {
                    NumerosYLetras letraD = new NumerosYLetras(rutasImagenes[0]);
                    mundo.addObject(letraD, puntero, 4);
                }
                else if (fila1 == 2)
                {
                    NumerosYLetras letraC = new NumerosYLetras(rutasImagenes[1]);
                    mundo.addObject(letraC, puntero, 4);
                }
                else if (fila1 == 3)
                {
                    NumerosYLetras letraB = new NumerosYLetras(rutasImagenes[2]);
                    mundo.addObject(letraB, puntero, 4);
                }
                acum1 = 0;
                multiplicador = 16;
                for (i = 0; i < vectorObjetosFila.size(); i++){
                    multiplicador = multiplicador/2;
                    varBooleano = vectorObjetosFila.get(i).booleano;
                    acum1 += varBooleano * multiplicador; 
                }
                
            }
        puntero += 2;
    }
    public void colocarMasMenos(){
        String signo1 = elegirSigno();
        World mundo = getWorld();
            if (mundo != null){
                if (signo1 == "+"){
                    NumerosYLetras signoMas = new NumerosYLetras(rutasImagenes[3]);
                    mundo.addObject(signoMas, punteroSigno, 4);
                }else if(signo1 == "-"){
                    NumerosYLetras signoMenos = new NumerosYLetras(rutasImagenes[4]);
                    mundo.addObject(signoMenos, punteroSigno, 4);
                }
            }
        punteroSigno+=2;
    }
    public void sumaResta(){
        if(intento>0){
            objetoSigno = buscarImagenes(x,4);
            imagen= objetoSigno.getImage().toString();
            imagen = imagen.substring(17,24);
            if (imagen.equals("mas.png")){
                resultado += acum1;
            }else{
                resultado -= acum1;
        }
        x += 2;
    } else if(intento == 0){
        resultado += acum1;
        intento += 1;
    }
    }
    public NumerosYLetras buscarImagenes(int xObjetivo, int yObjetivo)
    {
        World mundo = getWorld(); // Obtén una referencia al mundo actual
        List<NumerosYLetras> objetos = mundo.getObjects(NumerosYLetras.class); // Obtiene todos los objetos de la clase Zero_One en el mundo
                    
        for (NumerosYLetras objeto : objetos)
        {
            if (objeto.getX() == xObjetivo && objeto.getY() == yObjetivo)
            {
                return objeto; // Devuelve el objeto encontrado en las coordenadas X e Y específicas
            }
        }
                    
        return null; // Si no se encuentra ningún objeto en las coordenadas especificadas, devuelve null
    }
    }