package pay_train_weekind.class03;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] randomchs = getchars();
        System.out.println(randomchs);
        System.out.println("猜字母游戏开始，请输入5个字母序列：（输入：ByeBye，退出）");
        while(true) {
            String str = scan.nextLine();
            if(str.equals("ByeBye")) {
                System.out.println("退出");
                break;
            }
            str=str.toUpperCase();//字母小写转大写
            char[] mychars = str.toCharArray(); //转化字符串为字符数组
            int[] result = check(randomchs,mychars);
            if(result[1]==5) {  System.out.println("恭喜你，全部猜对了");  break;  }
            else {   System.out.println("字符正确个数为"+result[0]+",位置正确个数为"+result[1]);  }
        }
    }

    public static char[] getchars() {
        char[] randomchs = new char[5];
        char[] letters = {'A','B','C','D','E','F','G','H','I','J', 'K','L','M','N','O','P','Q','R','S','T','U','V', 'W','X','Y','Z'};
        boolean[] flags = new boolean[letters.length];
        int a;
        loop1:for(int i=0;i<randomchs.length;i++) {
            a= (int)(Math.random()*letters.length);
            randomchs[i]= letters[a];
           for (int j=0;j<i;j++){
               if (letters[a]==randomchs[j]) {  i--;break ;  }
           }
        }
        return randomchs;
    }

    public static int[] check(char[] randomchs, char[] mychars) {
        int[] result = new int[2];  //result[0]计录正确字符数，result[1]计录正确位置数。
        for(int i=0;i<randomchs.length;i++) {
            for(int j=0;j<mychars.length;j++) {
                if(randomchs[i]==(mychars[j])) {
                    result[0]++;
                    if(i==j)     result[1]++;
                    break;
                }
            }
        }
        return result;
    }
}
