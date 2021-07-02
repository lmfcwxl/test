package formattest;

import java.util.Random;

//随机生成10000的整数,如果不满5位,应该往后补0到5位,考虑String.format方式实现
public class TestFormat {
    public static void main(String[] args) {
        Random ran = new Random();
        int num = ran.nextInt(10000);
        String str1 = Integer.toString(num);
        System.out.println(str1);
        System.out.println(str1.length());
        for (int i = 0; i <= 5 - str1.length(); i++){
            str1 += "0";
        }
        System.out.println(str1);

        //format规范化
        int l = 1;
        String str3 = String.format("%05d", l);
        System.out.println(str3);
    }
}
