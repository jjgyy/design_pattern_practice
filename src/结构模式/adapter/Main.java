package 结构模式.adapter;

import 结构模式.adapter.adapter.Adapter;
import 结构模式.adapter.service.Targetable;

public class Main {

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        
        targetable.methodA();
        targetable.methodB();
    }

}
