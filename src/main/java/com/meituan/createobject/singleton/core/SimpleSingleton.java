package com.meituan.createobject.singleton.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午2:41
 * @Description: 单例
 * btw: 在第一次被引用时，才会将自己实例化，所以就被称为懒汉式单例类
 */

public class SimpleSingleton {
    private static SimpleSingleton instance;

    /**
     * 构造方法private，这就堵死了外界通过new 创建此类实例的可能。
     */
    private SimpleSingleton(){

    }

    public static SimpleSingleton getInstance() {
        if(instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
