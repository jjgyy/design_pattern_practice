package factory_simple.factory;

import factory_simple.impl.MailSender;
import factory_simple.impl.SmsSender;
import factory_simple.service.Sender;

public class SenderFactory {

    public static Sender produceMailSender() {
        return new MailSender();
    }

    public static Sender produceSmsSender() {
        return new SmsSender();
    }

}
