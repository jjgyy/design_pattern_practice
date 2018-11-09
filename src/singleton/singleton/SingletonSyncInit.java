package singleton.singleton;

public class SingletonSyncInit {

    private static SingletonSyncInit instance = null;

    private int getInstanceCount;

    //创建实例时保证同步，保证只生成一个实例
    private SingletonSyncInit() {
        this.getInstanceCount = 0;
    }

    private static synchronized void syncInit() {
        instance = new SingletonSyncInit();
        System.out.println("instance init");
    }

    public static SingletonSyncInit getInstance() {
        if (instance == null) {
            syncInit();
        }
        instance.getInstanceCount ++;
        System.out.println("get instance " + instance.getInstanceCount + " time");
        return instance;
    }

}
