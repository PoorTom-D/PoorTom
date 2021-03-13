package pay_train_weekind.class04;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("输入半径：");
        int a=reader.nextInt();
        Circle s1=new Circle(a);
        s1.printarea();
        s1.printgirth();
        Circle[] s2=new Circle[5];
        for (int i=0;i<s2.length;i++){
            a=(int)(Math.random()*15+5);
            //s2[i]=new Circle((int)(a);
            s2[i]=new Circle((int)(Math.random()*15+5));
            s2[i].printarea();
        }
    }
}
class Circle
{
    int radius;
    public Circle(int radius)   {  this.radius=radius;  System.out.println("I'm a circle,my radius is "+radius);  }
    public void printgirth()   {  System.out.println("My girth is "+Math.PI*radius*2);  }
    public void printarea()   {  System.out.println("My area is "+Math.PI*Math.pow(radius,2));  }
}

/* 数组的复制
   创建了新的数组 Arrays.copyOf(src,newLength);
   System.arraycopy(src,srcPost,pos,posPost,length);
 */