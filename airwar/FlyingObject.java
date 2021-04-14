package pay_train_weekind.airwar;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
    private int x;
    private int y;
    private int width;
    private int height;


    private int blood;
    private BufferedImage img;
    public FlyingObject(){}
    public FlyingObject(int x,int y,BufferedImage img){
        this.x=x;
        this.y=y;
        this.img=img;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return img.getWidth();
    }

    public int getHeight() {   return img.getHeight(); }

    public int getBlood() { return blood; }

    public void setBlood(int blood) { this.blood = blood; }

    public abstract void move();

}
