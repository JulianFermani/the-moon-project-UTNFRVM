import greenfoot.*;

public class HowToPlayButton extends Actor {
    private int imageWidth = 120;
    private int imageHeight = 120;
    
    public HowToPlayButton() {
        setImage("codigoQR.png");
        GreenfootImage image = getImage();
        image.scale(imageWidth, imageHeight);
    }
}