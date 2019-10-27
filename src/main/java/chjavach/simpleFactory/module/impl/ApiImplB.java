package chjavach.simpleFactory.module.impl;

import chjavach.simpleFactory.module.Api;

public class ApiImplB implements Api {
    @Override
    public String operation(String msg) {
        return "implB: " + msg;
    }
}
