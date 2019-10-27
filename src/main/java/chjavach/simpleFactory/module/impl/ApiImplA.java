package chjavach.simpleFactory.module.impl;

import chjavach.simpleFactory.module.Api;

public class ApiImplA implements Api {
    @Override
    public String operation(String msg) {

        return "implA: " + msg;
    }
}
