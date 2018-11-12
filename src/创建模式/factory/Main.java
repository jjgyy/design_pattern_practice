package 创建模式.factory;

import 创建模式.factory.factory.impl.MailSenderFactory;
import 创建模式.factory.factory.service.Factory;
import 创建模式.factory.service.Sender;

public class Main {

    public static void main(String[] args) {
        Factory factory = new MailSenderFactory();
        Sender sender = factory.produce();
        sender.send();
    }
}
