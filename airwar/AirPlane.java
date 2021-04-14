package pay_train_weekind.airwar;

public class AirPlane extends FlyingObject implements Enemy{
    private int speed,score;
    public AirPlane(){
        super((int)(Math.random()*(Main.WIDTH-Main.airplane.getWidth()-9)),-100,Main.airplane);
        speed=3;
        score=1;
        super.setBlood(1);
    }

    @Override
    public void move() {
        this.setY(this.getY()+speed);
    }

    @Override
    public int getScore() {
        return score;
    }
}
