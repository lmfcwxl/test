package collection;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        arr.add("ddd");
        for (String str : arr){
            System.out.println("str = " + str);
        }

        Iterator<String> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //arraylist根据构造器初始化是使用arrays.asList
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(112,45,85,45,23,96,12,74));
        Integer size = list.size();
        Integer t;
        //冒泡排序，从小到大排序
//        for (int i = 0 ; i < size - 1; i++)
//            for (int j = 0 ; j < size - 1 - i; j++){
//                if (list.get(j) > list.get(j+1)){
//                    t = list.get(j);
//                    list.set(j, list.get(j+1));
//                    list.set(j+1,t);
//                }
//            }
        //集合工具提供的排序方法
        Collections.sort(list);

        System.out.println(list);
        System.out.println("最小值：" + list.get(0) + "," + "最大值：" + list.get(size-1));

        //ArrayList转为数组
        Integer[] array = (Integer[])list.toArray(new Integer[size]);
        //判断是否转化成功
        System.out.println(array.getClass().isArray());
        for (Integer i : array){
            System.out.println(i);
        }

    }
}
