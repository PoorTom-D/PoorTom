package pay_train_weekind.airwar;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends JPanel {
    public static final int WIDTH = 480, HEIGHT = 800, LOCX = 560, LOCY = 40;
    public final int START=0, RUNNING=1,PAUSE=2,GAMEOVER=3,FLYINGINDEX=30,BULLETINDEX=10;
    public int now=START;
    public static BufferedImage bg,airplane,bee,bigplane,hero0,hero1,bullet,start,pause,game_over;
    private int FLYINGNUMB=0,BULLETNUMB=0;
    private ArrayList<FlyingObject>  flyings=new ArrayList<>();
    private ArrayList<Bullet>  bullets=new ArrayList<>();
    Hero h=new Hero();

    static {
        try {
            bg= ImageIO.read(Main.class.getResourceAsStream("pic/background.png"));
            airplane= ImageIO.read(Main.class.getResourceAsStream("pic/airplane.png"));
            bee= ImageIO.read(Main.class.getResourceAsStream("pic/bee.png"));
            bigplane= ImageIO.read(Main.class.getResourceAsStream("pic/bigplane.png"));
            hero0= ImageIO.read(Main.class.getResourceAsStream("pic/hero0.png"));
            hero1=ImageIO.read(Main.class.getResourceAsStream("pic/hero1.png"));
            bullet= ImageIO.read(Main.class.getResourceAsStream("pic/bullet.png"));
            start= ImageIO.read(Main.class.getResourceAsStream("pic/start.png"));
            pause= ImageIO.read(Main.class.getResourceAsStream("pic/pause.png"));
            game_over= ImageIO.read(Main.class.getResourceAsStream("pic/gameover.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Timer timer=new Timer();
    public void action(){
        timer.schedule(new TimerTask() {
    @Override
       public void run() {
        if (now==RUNNING){
            creatFlyingObject();
            flyingObjectMove();
            outBoundAction();
            shootAction();
            bulletSpet();
            collisionAction();
            h.move();
            repaint();
        }
       }
      },100,20);

       MouseAdapter adapter = new MouseAdapter(){

           @Override
           public void mouseClicked(MouseEvent e) {
               if (now==START) {
                   now = RUNNING;
                   repaint();
               }
               else if (now==GAMEOVER) {
                   now = START;
                   repaint();
               }
           }

           @Override
           public void mouseEntered(MouseEvent e) {
               if (now==PAUSE) {
                   now = RUNNING;
                   repaint();
               }
           }

           @Override
           public void mouseExited(MouseEvent e) {
               if (now==RUNNING) {
                   now = PAUSE;
                   repaint();
               }
           }

           @Override
           public void mouseMoved(MouseEvent e) {
               if (now==RUNNING){
                   int mouse_x = e.getX();
                   int mouse_y = e.getY();
                   h.setX(mouse_x-48);
                   h.setY(mouse_y-62);
                   repaint();
               }
           }
       };
       this.addMouseMotionListener(adapter);
       this.addMouseListener(adapter);
    }

    private void collisionAction(){
     for(int a=0;a<flyings.size();a++){
         for (int b=0;b<bullets.size();b++){
             FlyingObject fly=flyings.get(a);
             Bullet bs=bullets.get(b);
             if (fly.getBlood()<=0){
                 if (fly instanceof Enemy){
                     Enemy enemy=(Enemy) fly;
                     h.setScore(enemy);
                 }
                 if (fly instanceof Award){
                     Award award=(Award) fly;
                     if (award.getAwardType()==Award.DOUBLE_BULLET)  h.dounleFire();
                     else if (award.getAwardType()==Award.BLOOD) h.addBlood();
                 }
                 flyings.remove(a);  a--;  break;
             }
             if (bs.getBlood()<=0){
                 bullets.remove(b);  b--;  break;
             }
             if (bs.getX()>=fly.getX()
                     &&bs.getY()>=fly.getY()
                     &&bs.getY()<=(fly.getY()+fly.getHeight())
                     &&bs.getX()<=(fly.getX()+fly.getWidth())
                     ){
                 bs.setBlood(bs.getBlood()-1);
                 fly.setBlood(fly.getBlood()-1);
             }
         }
     }
     for (int c=0;c<flyings.size();c++){
         FlyingObject fly=flyings.get(c);
         if (fly.getBlood()<=0){
             flyings.remove(c);  c--;  break;
         }
         if (h.getBlood()<=0){
             now=GAMEOVER;  break;
         }
         if (h.getX()>=fly.getX()
                 &&h.getY()>=fly.getY()
                 &&h.getY()<=(fly.getY()+fly.getHeight())
                 &&h.getX()<=(fly.getX()+fly.getWidth())
//                 &&(h.getX()+h.getWidth())>=fly.getX()
//                 &&(h.getX()+h.getWidth())<=(fly.getX()+fly.getWidth())
//                 &&(h.getY()+h.getHeight())>=fly.getY()
//                 &&(h.getY()+h.getHeight())<=(fly.getY()+fly.getHeight())
         ){
             h.setBlood(h.getBlood()-1);
             fly.setBlood(0);
         }
     }
    }

    private void bulletSpet() {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet bs = bullets.get(i);
            bs.move();
        }
    }

    private void shootAction(){
        BULLETNUMB++;
        if (BULLETNUMB%BULLETINDEX==0){
            Bullet[] bs=h.shoot();
            for (int i=0;i< bs.length;i++)
                bullets.add(bs[i]);
        }
    }

    private void outBoundAction(){
        for (int i=0;i<flyings.size();i++){
            FlyingObject fly=flyings.get(i);
            if (fly.getY()>=Main.HEIGHT){
                flyings.remove(i);
                i--;
            }
        }
        for (int i=0;i<bullets.size();i++) {
            Bullet bs = bullets.get(i);
            if (bs.getY() <= 0) {
                bullets.remove(i);
                i--;
            }
        }
    }

    private void flyingObjectMove(){
        FlyingObject fly;
        for (int i=0;i<flyings.size();i++){
            fly=flyings.get(i);
            fly.move();
        }
    }

    private void creatFlyingObject(){
        FLYINGNUMB++;
        if (FLYINGNUMB%FLYINGINDEX==0){
            int ran=(int)(Math.random()*20);
            FlyingObject fly;
            if (ran>=0&&ran<14){ fly=new AirPlane(); }
            else if (ran>=14&&ran<18){ fly=new BigPlane(); }
            else {  fly=new Bee();  }
            flyings.add(fly);
        }
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(bg,0,0,this);
        g.drawImage(h.getImg(),h.getX(),h.getY(),this);
        g.drawString("得分："+h.getScore()+"  生命×"+h.getBlood(),10,30);
        printFlyingObject(g);
        printBullets(g);
        printNow(g);
    }

    private void printFlyingObject(Graphics g){
        for (int i=0;i<flyings.size();i++){
            FlyingObject fly = flyings.get(i);
            g.drawImage(fly.getImg(),fly.getX(),fly.getY(),this);
        }
    }

    private void printBullets(Graphics g){
        for (int i=0;i<bullets.size();i++){
            Bullet bs = bullets.get(i);
            g.drawImage(bs.getImg(),bs.getX(),bs.getY(),this);
        }
    }

    private void printNow(Graphics g){
        switch (now){
            case START:g.drawImage(start,27,75,this);break;
            case PAUSE:g.drawImage(pause,0,0,480,852,this);break;
            case GAMEOVER:g.drawImage(game_over,0,0,480,852,this);break;
        }
    }

    public static void main(String[] args) {
        JFrame window=new JFrame();
        Main p=new Main();
        window.add(p);
        window.setVisible(true);
        window.setDefaultCloseOperation(3);
        window.setSize(WIDTH,HEIGHT);
        window.setLocation(LOCX,LOCY);
        p.action();
    }
}
