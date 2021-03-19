package pay_train_weekind.homework_theSecondSemesterOfMyJuniorYear.day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date nowdate=new Date();
        System.out.println("当前日期:"+sdf.format(nowdate));
    }
}
