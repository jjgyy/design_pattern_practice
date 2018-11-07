package factory.factory.impl;

import factory.factory.service.Factory;
import factory.impl.SmsSender;
import factory.service.Sender;

public class SmsSenderFactory implements Factory {

    @Override
    public Sender produce() {
        return new SmsSender();
    }

}
