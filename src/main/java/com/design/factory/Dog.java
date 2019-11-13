package com.design.factory;

/**
 * @author xiao儿
 * @date 2019/8/28 0:06
 * @Description 具体产品类，用于实例化工厂方法模式的派生类1
 */
public class Dog implements Pet {
    @Override
    public String perSound() {
        return "Bow Bow ...";
    }
}
