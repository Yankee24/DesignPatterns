package com.design.builder;

/**
 * @author xiao儿
 * @date 2019/8/29 22:40
 * @Description CarBuilder
 * 定义生成器接口
 */
public interface CarBuilder {
    public void buildBase();
    public void buildWheels();
    public void buildEngine();
    public void buildRoof();
    public void buildMirrors();
    public void buildLights();
    public void buildInterior();
    public Car getCar();
}
