package pay_train_weekind.homework_theSecondSemesterOfMyJuniorYear.class_02;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main extends JPanel{
    public static BufferedImage bg;
    public static BufferedImage hero;
    public static BufferedImage bigplane;
    public static BufferedImage airplane;
    public static BufferedImage bee;

    static{
        try {
            hero = ImageIO.read
                    (Main.class.getResourceAsStream
                            ("Plane/hero0.png"));
            bigplane = ImageIO.read
                    (Main.class.getResourceAsStream
                            ("Plane/bigplane.png"));
            airplane = ImageIO.read
                    (Main.class.getResourceAsStream
                            ("Plane/airplane.png"));
            bee = ImageIO.read
                    (Main.class.getResourceAsStream
                            ("Plane/bee.png"));
            bg = ImageIO.read
                    (Main.class.
                            getResourceAsStream("Plane/background.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Hero h = new Hero();
    BigPlane big = new BigPlane();
    Bee b = new Bee();
    AirPlane air = new AirPlane();

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bg, 0, 0, this);
        g.drawImage(h.getImg(),h.getX(),h.getY(),this);
        g.drawImage(big.getImg(),big.getX(),big.getY(),this);
        g.drawImage(b.getImg(),b.getX(),b.getY(),this);
        g.drawImage(air.getImg(),air.getX(),air.getY(),this);
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("飞机大战");
        win.setSize(400,600);
        JPanel p = new Main();
        win.add(p);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
