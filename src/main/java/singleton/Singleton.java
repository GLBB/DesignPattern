package singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    static {
        System.out.println("类被加载");
    }
    private Singleton(){
        System.out.println("singleton 被实例化");
    }

    public static Singleton getInstance(){
        return singleton;
    }


}
