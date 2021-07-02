package singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        //测试
        String a = new String("123");
        String b = new String("123");
        System.out.println("懒汉式，线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance.equals(instance2));
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println(a.equals(b));
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    //提供一个静态的公有方法，加入了同步处理的代码
    //即懒汉式,线程安全
    public static synchronized Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}