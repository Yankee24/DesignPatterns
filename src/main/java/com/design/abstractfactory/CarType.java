package com.design.abstractfactory;

/**
 * @author xiao儿
 * @date 2019/8/29 21:09
 * @Description CarType
 */
public class CarType {
    private Car car;

    public static void main(String[] args) {
        CarType type = new CarType();
        Car car = type.getCar("BMW");
        System.out.println("Wheels：" + car.getWheels().getSpecification());
        System.out.println("Mirrors：" + car.getMirrors().getSpecification());
        System.out.println("Engine：" + car.getEngine().getSpecification());
        System.out.println("Bady：" + car.getBody().getSpecification());
    }

    public Car getCar(String carType) {
        if ("BenQ".equals(carType)) {
            car = new BenQ();
        } else if ("BMW".equals(carType)) {
            car = new BMW();
        } else if ("GeneralMotors".equals(carType)) {
            car = new GeneralMotors();
        }
        return car;
    }
}
