import greenfoot.*;

public class HowToPlayButton extends Actor {
    private int imageWidth = 120;
    private int imageHeight = 120;
    
    public HowToPlayButton() {
        setImage("howToPlay.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth, imageHeight);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            World world = getWorld();
            world.showText("¡Las instrucciones se encuentran en la carpeta 'Documentacion' del proyecto!", 5, 4);
            Greenfoot.delay(300);
            world.showText("",5,4);
        }
    }
}