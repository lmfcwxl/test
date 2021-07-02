package formattest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    //打印当期时间,时间格式为2021年06月24日 11:02:22.850
    public static void main(String[] args) {
        Date date = new Date();
        //指定格式化格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss.S");
        System.out.println(sdf.format(date));
    }
}
