package com.design.factory;

/**
 * @author xiao儿
 * @date 2019/8/28 0:09
 * @Description 工厂方法模式实现，并展示对象创建逻辑
 */
public class PetFactory {
    public Pet getPet(String petType) {
        Pet pet = null;
        // 工厂实例化对象的基本逻辑
        if ("Bow".equals(petType)) {
            pet = new Dog();
        } else if ("Meaw".equals(petType)) {
            pet = new Cat();
        }
        return pet;
    }
}
