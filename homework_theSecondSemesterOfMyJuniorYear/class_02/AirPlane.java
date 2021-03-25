package pay_train_weekind.homework_theSecondSemesterOfMyJuniorYear.class_02;
public class AirPlane extends FlyingObject  {
    private int blood;
    private int speed;

    public AirPlane(){
        img = Main.airplane;
        width = img.getWidth();
        height = img.getHeight();
        x = (int)(Math.random()*400);
        y = 300;
    }

    @Override
    void move() {

    }
}

