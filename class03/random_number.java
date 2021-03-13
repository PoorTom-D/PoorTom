package pay_train_weekind.class03;

import java.util.Scanner;

public class random_number {
    public static void main(String[] args) {
        int num=(int)(Math.random()*200+1);
        Scanner reader=new Scanner(System.in);
        int n=-1;
        while (n!=num){
             n=reader.nextInt();
            if (n>num)  System.out.println("大");
            else if (n<num)  System.out.println("小");
            else System.out.println("gg");
        }
    }
}
