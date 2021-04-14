package pay_train_weekind.airwar;

public class Bullet extends FlyingObject {
    private int speed;
    public Bullet(int x,int y){
        super(x,y,Main.bullet);
        speed=6;
        super.setBlood(1);
    }
    @Override
    public void move() {
        this.setY(this.getY()-speed);
    }
}
