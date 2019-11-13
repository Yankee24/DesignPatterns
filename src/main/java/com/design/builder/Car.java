package com.design.builder;

/**
 * @author xiao儿
 * @date 2019/8/29 22:36
 * @Description Car
 * 如果使用了抽象类，那就是对抽象类进行扩展
 */
public class Car implements CarPlan {
    private String basename;
    private String wheels;
    private String engine;
    private String roof;
    private String mirrors;
    private String lights;
    private String interior;

    @Override
    public void setBase(String basename) {
        this.basename = basename;
    }

    @Override
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setMirrors(String mirrors) {
        this.mirrors = mirrors;
    }

    @Override
    public void setLights(String lights) {
        this.lights = lights;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }
}
