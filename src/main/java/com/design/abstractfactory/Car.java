package com.design.abstractfactory;

/**
 * @author xiao儿
 * @date 2019/8/29 20:58
 * @Description Car
 */
public abstract class Car {
    public abstract Parts getWheels();
    public abstract Parts getMirrors();
    public abstract Parts getEngine();
    public abstract Parts getBody();
}
