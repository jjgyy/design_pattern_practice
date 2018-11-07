package factory;

import factory.factory.impl.MailSenderFactory;
import factory.factory.service.Factory;
import factory.service.Sender;

public class Main {

    public static void main(String[] args) {
        Factory factory = new MailSenderFactory();
        Sender sender = factory.produce();
        sender.send();
    }
}
