package pay_train_weekind.homework_theSecondSemesterOfMyJuniorYear.class_02;
public class Bee extends FlyingObject {
    private int speed;
    private int blood;

    public Bee() {
        img = Main.bee;
        width = img.getWidth();
        height = img.getHeight();
        x = (int)(Math.random()*400);
        y = 300;
    }

    @Override
    void move() {
        //x增加,y增加
        //x增加到最大值,x开始减小,y继续增大
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
}
