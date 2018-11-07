package factory_simple;

import factory_simple.factory.SenderFactory;
import factory_simple.service.Sender;

public class Main {

    public static void main(String[] args) {

        Sender sender = SenderFactory.produceMailSender();
        sender.send();

    }
}
