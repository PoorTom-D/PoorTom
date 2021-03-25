package pay_train_weekind.homework_theSecondSemesterOfMyJuniorYear.class_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Calendar cal=Calendar.getInstance();
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入生产日期：");
        String proday=reader.nextLine();
        System.out.println("请输入保质日期：");
        int bzday=Integer.parseInt(reader.nextLine());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date prodate=sdf.parse(proday);
        cal.setTime(prodate);
        cal.add(Calendar.DAY_OF_YEAR,bzday);
        //System.out.println("产品过期日期："+cal.getTime());
        cal.add(Calendar.DAY_OF_YEAR,-14);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        prodate=cal.getTime();
        System.out.println("产品促销日期："+prodate);//cal.getTime()=prodate
        System.out.println("产品促销日期："+sdf.format(prodate));
    }
}
