package 创建模式.factory_simple.factory;

import 创建模式.factory_simple.impl.MailSender;
import 创建模式.factory_simple.impl.SmsSender;
import 创建模式.factory_simple.service.Sender;

public class SenderFactory {

    public static Sender produceMailSender() {
        return new MailSender();
    }

    public static Sender produceSmsSender() {
        return new SmsSender();
    }

}
