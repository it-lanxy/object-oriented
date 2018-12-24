package com.meituan.structure.bridge.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午8:16
 * @Description: 具体实现
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("「具体实现」 A 方法执行！");
    }

}
