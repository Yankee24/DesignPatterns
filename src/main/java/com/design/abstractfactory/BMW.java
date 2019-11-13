package com.design.abstractfactory;

/**
 * @author xiao儿
 * @date 2019/8/29 21:06
 * @Description BMW
 */
public class BMW extends Car {
    @Override
    public Parts getWheels() {
        return new Parts("BMW Wheels");
    }

    @Override
    public Parts getMirrors() {
        return new Parts("BMW Mirrors");
    }

    @Override
    public Parts getEngine() {
        return new Parts("BMW Engine");
    }

    @Override
    public Parts getBody() {
        return new Parts("BMW Body");
    }
}
