package com.design.builder;

/**
 * @author xiao儿
 * @date 2019/8/29 22:57
 * @Description Main
 */
public class Main {
    public static void main(String[] args) {
        CarBuilder lowPriceCarBuilder = new LowPriceCarBuilder();
        MechanicalEngineer engineer = new MechanicalEngineer(lowPriceCarBuilder);
        engineer.buildCar();
        Car car = engineer.getCar();
        System.out.println("Builder Constructed Car：" + car);
    }
}
