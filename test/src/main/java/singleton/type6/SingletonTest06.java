package singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式，线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance.equals(instance2));
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
        System.out.println("instance.hashCode() = " + instance.hashCode());
    }
}

//懒汉式（线程安全，懒加载）
class Singleton{
    private static volatile Singleton instance;

    private Singleton(){

    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，解决懒加载的问题
    //同时保证了效率
    public static synchronized Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
