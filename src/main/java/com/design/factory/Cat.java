package com.design.factory;

/**
 * @author xiao儿
 * @date 2019/8/28 0:07
 * @Description 具体产品类，用实例化工厂方法模式的派生类2
 */
public class Cat implements Pet {
    @Override
    public String perSound() {
        return "Meaw Meaw ...";
    }
}
