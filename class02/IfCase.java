package pay_train_weekind.class02;

import java.util.Scanner;

public class IfCase {
    public static void main(String[] args){
        int age;
        Scanner reader=new Scanner(System.in);
        age=reader.nextInt();
        if (age%400==0 || age%4==0&&age%100!=0)  System.out.println(366);
        else System.out.println("不是闰年");
    }
}

/* swith(int)  限于byte char shot int,default()  */