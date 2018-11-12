package 创建模式.factory.impl;

import 创建模式.factory.service.Sender;

public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("sms send!");
    }
}
