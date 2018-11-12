package 创建模式.factory_simple;

import 创建模式.factory_simple.factory.SenderFactory;
import 创建模式.factory_simple.service.Sender;

public class Main {

    public static void main(String[] args) {

        Sender sender = SenderFactory.produceMailSender();
        sender.send();

    }
}
