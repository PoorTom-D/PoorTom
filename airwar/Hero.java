package pay_train_weekind.airwar;

public class Hero extends FlyingObject{
    private int score=0,shoot_index=0;

    public Hero(){
        super(190,500,Main.hero0);
        super.setBlood(3);
    }

    private int count = 0;

    @Override
    public void move() {
        count++;
        if(count % 2 == 0){
            this.setImg(Main.hero0);
        }else{
            this.setImg(Main.hero1);
        }
    }
    public Bullet[] shoot() {
        Bullet[] bs;
       if (shoot_index==0){
           bs = new Bullet[1];
           bs[0] = new Bullet(this.getX() + this.getWidth()/2,
                   this.getY());
       }
       else {
           bs = new Bullet[2];
           bs[0] = new Bullet(this.getX() + this.getWidth()/4,
                   this.getY());
           bs[1] = new Bullet(this.getX() + this.getWidth()/4*3,
                   this.getY());
           shoot_index--;
       }
        return bs;
    }

    public int getScore() {
        return score;
    }

    public void setScore(Enemy enemy) {
        this.score +=enemy.getScore();
    }

    public void addBlood() {
        this.setBlood(this.getBlood()+1);
    }

    public void dounleFire() {
        shoot_index+=20;
    }
}
