package stringtest;

public class TestString {
    public static void main(String[] args) {
        String str1 = "just as process";
        char[] ch = str1.toCharArray();
        String res = "";
        int startPlace = 11;
        //返回字符数组中从startPlace开始包括startPlace共count个字符个数的字符串
        res = res.copyValueOf(ch,startPlace,str1.length()-startPlace);
        System.out.println("res = " + res);

        String str2 = "abc";
        String str3 = "abc";
        String str4 = new String("abc");
        String str5 = new String("abc");
        System.out.println(str2 == str3);
        System.out.println(str4 == str5);
        System.out.println(str4.equals(str5));

    }

}
