package 创建模式.factory.factory.impl;

import 创建模式.factory.factory.service.Factory;
import 创建模式.factory.service.Sender;
import 创建模式.factory.impl.MailSender;

public class MailSenderFactory implements Factory {

    @Override
    public Sender produce() {
        return new MailSender();
    }

}
