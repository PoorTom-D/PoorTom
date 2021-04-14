package pay_train_weekind.airwar;

public class Bee extends FlyingObject implements Award{
    private int speedy,speedx;
    public Bee(){
        super((int)(Math.random()*(Main.WIDTH-Main.bee.getWidth()-12)),-100,Main.bee);
        speedy=2;
        if ((int)(Math.random()*2)==0)  speedx=4;
        else speedx=-4;
        super.setBlood(1);
    }

    @Override
    public void move() {
        this.setY(this.getY()+speedy);
        this.setX(this.getX()+speedx);
        if (this.getX()<0||this.getX()>(Main.WIDTH-Main.bee.getWidth()-12))  speedx=-speedx;
    }

    @Override
    public int getAwardType() {
        return BLOOD;
    }
}
