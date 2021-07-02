import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("tom")));
        //集合类中涉及自设类时需要重写自设类的equals方法
        System.out.println(coll.contains(new Person("Jerry",20)));

        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

//        coll.remove(1234);
//        System.out.println(coll);
//        coll.remove(new Person("Jerry",20));
//        System.out.println(coll);

        Collection coll1 = Arrays.asList(123,789);
        coll.removeAll(coll1);
        System.out.println(coll);

    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

//        Collection coll1 = Arrays.asList(123,789);
//
//        coll.retainAll(coll1);
//        System.out.println(coll);

        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("tom"));
        coll1.add(false);
        coll1.add(new Person("Jerry",20));

        System.out.println(coll.equals(coll1));

    }
}
