package 创建模式.factory_simple.impl;

import 创建模式.factory_simple.service.Sender;

public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("sms send!");
    }
}
