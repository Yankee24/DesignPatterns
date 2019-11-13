package com.design.builder;

/**
 * @author xiao儿
 * @date 2019/8/29 22:42
 * @Description LowPriceCarBuilder
 * 生成器第一个实现（具体生成器）
 */
public class LowPriceCarBuilder implements CarBuilder {
    private Car car;

    public LowPriceCarBuilder() {
        car = new Car();
    }

    @Override
    public void buildBase() {
        car.setBase("Low priced base");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Cheap Tyres");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Low Quality Engine");
    }

    @Override
    public void buildRoof() {
        car.setRoof("No flexible roof");
    }

    @Override
    public void buildMirrors() {
        car.setMirrors("Cheap Mirrors");
    }

    @Override
    public void buildLights() {
        car.setLights("Cheap Lights");
    }

    @Override
    public void buildInterior() {
        car.setInterior("Cheap Interior");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
