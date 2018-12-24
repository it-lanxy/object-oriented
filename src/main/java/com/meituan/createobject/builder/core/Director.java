package com.meituan.createobject.builder.core;

/**
 * @author: lanxinyu@meituan.com
 * @Description: 指挥者类，用于构建一个使用Builder接口的对象
 * @Date: 2018-09-14 下午4:35
 */
public class Director {
    public static void create(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
