package pay_train_weekind.class07;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        Calendar cal=Calendar.getInstance();
        /*System.out.print(cal.get(Calendar.YEAR)+"年 ");
        System.out.print(cal.get(Calendar.MONTH)+1+"月 ");
        System.out.print(cal.get(Calendar.DAY_OF_MONTH)+"日 ");
        System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"时 ");
        System.out.print(cal.get(Calendar.MINUTE)+"分 ");
        System.out.print(cal.get(Calendar.SECOND)+"秒 ");*/
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入生产日期：");
        String proday=reader.nextLine();
        System.out.println("请输入保质日期：");
        int bzday=reader.nextInt();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
        Date prodate=sdf.parse(proday);
        cal.setTime(prodate);
        cal.add(Calendar.DATE,bzday);
        System.out.println("产品过期日期："+cal.getTime());
        cal.add(Calendar.DATE,-7);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        System.out.println("产品促销日期："+cal.getTime());
    }
}
