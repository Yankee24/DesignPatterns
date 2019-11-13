package com.design.builder;

/**
 * @author xiao儿
 * @date 2019/8/29 22:49
 * @Description HighEndCarBuilder
 * 生成器的第二个实现（具体生成器）
 */
public class HighEndCarBuilder implements CarBuilder {
    private Car car;

    public HighEndCarBuilder() {
        car = new Car();
    }

    @Override
    public void buildBase() {
        car.setBase("Quality base");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Quality Tyres");
    }

    @Override
    public void buildEngine() {
        car.setEngine("High-end Engine");
    }

    @Override
    public void buildRoof() {
        car.setRoof("Flexible roof");
    }

    @Override
    public void buildMirrors() {
        car.setMirrors("Quality Mirrors");
    }

    @Override
    public void buildLights() {
        car.setLights("Quality Lights");
    }

    @Override
    public void buildInterior() {
        car.setInterior("High-end Interior");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
