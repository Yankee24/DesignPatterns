package com.design.abstractfactory;

/**
 * @author xiao儿
 * @date 2019/8/29 21:04
 * @Description BenQ
 */
public class BenQ extends Car {
    @Override
    public Parts getWheels() {
        return new Parts("BenQ Wheels");
    }

    @Override
    public Parts getMirrors() {
        return new Parts("BenQ Mirrors");
    }

    @Override
    public Parts getEngine() {
        return new Parts("BenQ Engine");
    }

    @Override
    public Parts getBody() {
        return new Parts("BenQ Body");
    }
}
