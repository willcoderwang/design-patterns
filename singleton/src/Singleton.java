public class Singleton {

    private static Singleton uniqueInstance;

//    Constructor is declared private; Only Singleton can instantiate this class!
    private Singleton() {
    }

//    getInstance() gives a way to instantiate the class and also to return an instance of it
//    By adding the synchronized keyword to getInstance(), we force every thread to wait its turn before it can enter
//    the method. That is, no two threads may enter the method at the same time
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
