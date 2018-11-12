package 创建模式.factory.factory.impl;

import 创建模式.factory.factory.service.Factory;
import 创建模式.factory.impl.SmsSender;
import 创建模式.factory.service.Sender;

public class SmsSenderFactory implements Factory {

    @Override
    public Sender produce() {
        return new SmsSender();
    }

}
