package pay_train_weekind.homework_theSecondSemesterOfMyJuniorYear.class_02;
public class Hero extends FlyingObject {
    private int blood;
    private int score;
    private Bullet[] bullet;

    public Hero() {
        this.blood = 3;
        this.score = 0;
        img = Main.hero;
        width = getImg().getWidth();
        height = getImg().getHeight();
        x = 200;
        y = 200;
    }

    @Override
     void move() {

    }
}
