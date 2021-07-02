package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        for (String str : set){
            System.out.println("str = " + str);
        }

        //获取迭代器
        Iterator<String> it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        
        set.remove("aaa");

        System.out.println("=======");

        for (String str : set){
            System.out.println("str = " + str);
        }
    }
}
