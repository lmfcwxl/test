package hashmapandarraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashmapAndArrayTest {

    public static Map<String, List<Student>> buildMap(List<Student> students) {
        //定义返回的结果变量
        Map<String, List<Student>> studentMap = new HashMap<String, List<Student>>();

        //遍历参数列表
        for (Student student : students) {
            //根据姓名获取map的“值”并装入到临时变量列表中
            List<Student> tempList = studentMap.get(student.getName());
            //如果该键不存在则新建对象列表作为值，并将该键值存到studentMap中
            if (tempList == null) {
                tempList = new ArrayList();
                tempList.add(student);
                studentMap.put(student.getName(), tempList);
            } else {
                //如果该键存在的话templist此时为该键的值
                //值为对象列表，所以直接添加该对象即可
                tempList.add(student);
            }
        }
        return studentMap;
    }

    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setId(1);
        student01.setName("Mike");

        Student student02 = new Student();
        student02.setId(2);
        student02.setName("Zed");

        Student student03 = new Student();
        student03.setId(3);
        student03.setName("Jack");

        Student student04 = new Student();
        student04.setId(4);
        student04.setName("Zed");

        List<Student> students = new ArrayList<Student>();
        students.add(student01);
        students.add(student02);
        students.add(student03);
        students.add(student04);

        Map<String, List<Student>> resultMap = buildMap(students);

        for (String str : resultMap.keySet()) {
            System.out.println("key: " + str + " , " + "value: " + resultMap.get(str));
        }
    }
}

