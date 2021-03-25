package pay_train_weekind.homework_theSecondSemesterOfMyJuniorYear.class_02;
public class BigPlane extends FlyingObject {
    private int blood;
    private int speed;


    public BigPlane() {
        img = Main.bigplane;
        width = img.getWidth();
        height = img.getHeight();
        x = (int)(Math.random()*400);
        y = 300;
    }

    @Override
     void move() {

    }
}
