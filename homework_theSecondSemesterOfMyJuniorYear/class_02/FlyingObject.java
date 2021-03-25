package pay_train_weekind.homework_theSecondSemesterOfMyJuniorYear.class_02;
import java.awt.image.BufferedImage;

public abstract class FlyingObject {
    protected int x;
    protected int y;
    protected int height;
    protected int width;
    protected BufferedImage img;


    public FlyingObject(){

    }

    public FlyingObject(int x, int y, BufferedImage img){
        this.x = x;
        this.y = y;
        this.img = img;
    }


     abstract void move();

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
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }
}
