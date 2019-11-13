package com.design.builder;

/**
 * @author xiao儿
 * @date 2019/8/29 22:54
 * @Description MechanicalEngineer
 * 导演类
 */
public class MechanicalEngineer {
    private CarBuilder carBuilder;

    public MechanicalEngineer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar() {
        return carBuilder.getCar();
    }

    public void buildCar() {
        carBuilder.buildBase();
        carBuilder.buildWheels();
        carBuilder.buildEngine();
        carBuilder.buildRoof();
        carBuilder.buildMirrors();
        carBuilder.buildLights();
        carBuilder.buildInterior();
    }
}
