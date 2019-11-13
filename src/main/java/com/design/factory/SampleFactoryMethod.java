package com.design.factory;

/**
 * @author xiao儿
 * @date 2019/8/28 0:11
 * @Description 使用工厂方法模式，main类
 */
public class SampleFactoryMethod {
    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();// 创建工厂
        Pet pet = petFactory.getPet("Bow");// 工厂实例化一个对象
        // 你并不知道会创建那种对象工厂
        System.out.println(pet.perSound());
    }
}
