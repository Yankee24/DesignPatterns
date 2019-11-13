package com.design.abstractfactory;

/**
 * @author xiao儿
 * @date 2019/8/29 21:08
 * @Description GeneralMotors
 */
public class GeneralMotors extends Car {
    @Override
    public Parts getWheels() {
        return new Parts("GeneralMotors Wheels");
    }

    @Override
    public Parts getMirrors() {
        return new Parts("GeneralMotors Mirrors");
    }

    @Override
    public Parts getEngine() {
        return new Parts("GeneralMotors Engine");
    }

    @Override
    public Parts getBody() {
        return new Parts("GeneralMotors Body");
    }
}
