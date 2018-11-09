package singleton;

import singleton.singleton.SingletonSyncInit;

public class Main {

    public static void main(String[] args) {
        SingletonSyncInit.getInstance();
        SingletonSyncInit.getInstance();
        SingletonSyncInit.getInstance();
        SingletonSyncInit.getInstance();
    }
}
