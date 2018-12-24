package com.meituan.createobject.singleton.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午3:57
 * @Description: 静态初始化
 * btw 这种静态初始化的方式是在被加载时就将自己实例化，所以被形象的称之为饿汉式单例类
 */

/**
 * final 禁止派生，派生类可能增加新的实例
 */
public final class StaticSingleton {

    /**
     * 在第一次引用类的任何成员时创建实例。公共语言运行库负责处理变量初始化。
     */
    private static StaticSingleton instance = new StaticSingleton();

    private StaticSingleton(){}

    public static StaticSingleton getInstance() {
        return instance;
    }
}
