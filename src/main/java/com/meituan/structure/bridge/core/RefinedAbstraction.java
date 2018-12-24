package com.meituan.structure.bridge.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午8:15
 * @Description: 被提炼的抽象
 */
public class RefinedAbstraction extends Abstraction{

    @Override
    public void operation() {
        implementor.operation();
    }
}
