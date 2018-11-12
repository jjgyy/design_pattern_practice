package 创建模式.singleton;

import 创建模式.singleton.singleton.SingletonSyncInit;

public class Main {

    public static void main(String[] args) {
        SingletonSyncInit.getInstance();
        SingletonSyncInit.getInstance();
        SingletonSyncInit.getInstance();
        SingletonSyncInit.getInstance();
    }
}
