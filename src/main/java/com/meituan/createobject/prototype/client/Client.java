package com.meituan.createobject.prototype.client;

import com.meituan.createobject.prototype.core.ConcretePrototype;

/**
 * @author: lanxinyu@meituan.com
 * @Description: 客户端
 * @Date: 2018-09-14 上午10:33
 */
public class Client {


    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype cp1 = new ConcretePrototype(1011);
        ConcretePrototype coClone = (ConcretePrototype) cp1.cloneThis();

        System.out.println(coClone.getId());
        System.out.println(cp1.equals(coClone));
    }
}
