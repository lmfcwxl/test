package singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {

        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance.equals(instance2));
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
        System.out.println("instance.hashCode() = " + instance.hashCode());
    }
}

//饿汉式（静态变量）
class Singleton{
    //1.构造器私有化,private声明之后外部就不能new了
    private Singleton(){

    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    //3.提供一个静态的公有方法返回对象实例
    public static Singleton getInstance(){
        return instance;
    }
}
