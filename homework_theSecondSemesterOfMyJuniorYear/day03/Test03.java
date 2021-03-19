package pay_train_weekind.homework_theSecondSemesterOfMyJuniorYear.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入生日(格式为yyyy-MM-dd)：");
        String birthday=reader.nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
        Date birthdate=sdf.parse(birthday);
        Date nowdate=new Date();
        long weeks=(nowdate.getTime()-birthdate.getTime())/(1000*60*60*24*7);
        System.out.println("经过了"+weeks+"周");
    }
}
