package pay_train_weekind.airwar;


public class BigPlane extends FlyingObject implements Enemy,Award{
    private int speed,score;
    public BigPlane(){
      super((int)(Math.random()*(Main.WIDTH-Main.bigplane.getWidth()-5)),-100,Main.bigplane);
      speed=2;
      score=4;
      super.setBlood(4);
    }

    @Override
    public void move() {
     this.setY(this.getY()+speed);
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getAwardType() {
        int awrad=(int)(Math.random()*2);
        return awrad;
    }
}
