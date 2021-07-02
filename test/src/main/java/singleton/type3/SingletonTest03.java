package singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式，线程不安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance.equals(instance2));
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
        System.out.println("instance.hashCode() = " + instance.hashCode());
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    //提供一个静态的公有方法，只有再用到该方法时才去创建对象实例
    //即懒汉式,线程不安全
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}