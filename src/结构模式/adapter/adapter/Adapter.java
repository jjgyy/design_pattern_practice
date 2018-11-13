package 结构模式.adapter.adapter;

import 结构模式.adapter.impl.Source;
import 结构模式.adapter.service.Targetable;

public class Adapter extends Source implements Targetable {

    @Override
    public void methodB() {
        System.out.println("methodB from Adapter");
    }

}
