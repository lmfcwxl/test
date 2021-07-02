package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        map.put(4,"ddd");
        for (Integer i : map.keySet()){
            System.out.println("key = " + i + "," + "values = " + map.get(i));
        }

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry + ", ");
        }
    }
}
