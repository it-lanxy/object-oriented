package com.meituan.createobject.prototype.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午2:21
 * @Description: 具体原型类
 */
public class ConcretePrototype extends Prototype implements Cloneable{

    public ConcretePrototype(Integer id) {
        super(id);
    }

    @Override
    public Prototype cloneThis() throws CloneNotSupportedException {
        /**
         * 浅拷贝是一种实现，也可以自定义方法
         */
        return (Prototype) super.clone();
    }
}
