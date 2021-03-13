package pay_train_weekind.class05;

import java.util.Scanner;

public class HospitalHotel{
    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        System.out.println("欢迎使用酒店系统！");
     while (true){
         System.out.println("请输入指令：1-入住，2-退房，3-检查房间，4-退出");
         Scanner reader=new Scanner(System.in);
         int option=reader.nextInt();
         switch (option){
             default:{System.out.println("无效指令");break;}
             case 1: {
                 System.out.println("请输入入住房间号和入住人姓名：");
                 int a=reader.nextInt(); String b=reader.next();
                 hotel.in(a,b);break;
             }
             case 2:{
                 System.out.println("请输入要退的房间号：");
                 int a=reader.nextInt();
                 hotel.out(a);break;
             }
             case 3: {hotel.check();break;}
             case 4: System.exit(0);
         }
     }
    }
}

class Hotel{
    Room[][]  rooms=new Room[6][6];
    public Hotel(){
        for (int i=0;i<rooms.length;i++){
            for (int j=0;j<rooms[i].length;j++){
                rooms[i][j]=new Room((i+1)*1000+j+1);
                rooms[i][j].guest=new Guest(null);
            }
        }
    }
    public void in(int a,String name){
                int x=a/1000-1;
                int y=a%1000-1;
                boolean f=false;
                for (int i=0;i<rooms.length;i++) {
                    for (int j = 0; j < rooms[i].length; j++) {
                        if (rooms[i][j].num == a) f = true;
                    }
                }
                    if (a < 0 || !f) {
                        System.out.println("房间号不正确");
                        return ;
                    }
                    if (rooms[x][y].guest.name == null) {
                        rooms[x][y].guest.name = name;
                        System.out.println("入住成功，欢迎" + name);
                    } else {
                        System.out.println("房间不为空");
                    }

    }
    public void out(int a){
        int x=a/1000-1;
        int y=a%1000-1;
        boolean f=false;
        for (int i=0;i<rooms.length;i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].num == a) f = true;
            }
        }
        if (a<0||!f){ System.out.println("房间号不正确");return; }
        if (rooms[x][y].guest.name==null)  { System.out.println("该房间为空房"); }
        else {
            String name=rooms[x][y].guest.name;
            rooms[x][y].guest.name=null;
            System.out.println("退房成功，欢迎"+name+"下次光临");
        }
    }
    public void check(){
        for (int i=0;i<rooms.length;i++){
            for (int j=0;j<rooms[i].length;j++){
                System.out.print(rooms[i][j].num+"  \t");
            }
            System.out.println();
            for (int j=0;j<rooms[i].length;j++){
                if (rooms[i][j].guest.name!=null) System.out.print(rooms[i][j].guest.name+"  \t");
                else System.out.print("null  \t");
            }
            System.out.println();
        }
    }
}

class Room{
    Guest guest;  int num;
    public Room(int num) {  this.num=num;  }
}

class Guest{
    String name;
    public Guest(String name) {  this.name=name;  }
}