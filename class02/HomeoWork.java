package pay_train_weekind.class02;

import java.util.Scanner;

class Rabbit{
    int month;
    public Rabbit() { month=0; }
    public void update() { month++; }
}

public class HomeoWork {
    public static void main(String[] args){
        System.out.println("第一题：");
        System.out.println("请输入月份：");
        Scanner reader = new Scanner(System.in);
        int month = reader.nextInt();
        if (month==1) System.out.println("第1个月兔子总数：2");
        else if (month==2) {
            System.out.println("第1个月兔子总数：2");
            System.out.println("第2个月兔子总数：2");
        }
        else if (month>2) {
            System.out.println("第1个月兔子总数：2");
            System.out.println("第2个月兔子总数：2");
            int  previousMonth= 1, total = 1, lastMonth;
            for (int i = 3; i <= month; i++) {
                lastMonth = total;//f起到传递的作用
                total += previousMonth;//total为当前月份兔子总数
                previousMonth = lastMonth;//f1为当前月份兔子数量，下一轮循环用
                System.out.println("第" + i + "个月的兔子总数：" + total*2);
            }

        }
        else System.out.println("无效输入");
        System.out.println("第二题：");
        int n=0;
        for(int i=101;i<=200;i++){
            boolean flag=false;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=false;
                    break;
                } else{
                    flag=true;
                }
            }
            if(flag){
                n++;
                System.out.println(i);
            }
        }
        System.out.println("101-200之间的素数共有："+n+"个");
    }

}
