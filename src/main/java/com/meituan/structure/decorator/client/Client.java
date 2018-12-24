package com.meituan.structure.decorator.client;


import com.meituan.structure.decorator.core.ConcreteComponent;
import com.meituan.structure.decorator.core.ConcreteDecoratorA;
import com.meituan.structure.decorator.core.ConcreteDecoratorB;

public class Client {

    /**
     * 装饰模式是利用 setAbstractComponent 来对对象进行包装的。这样每个装饰对象的实现就和如何使用这个对象分离开了，
     * 每个装饰对象只关心自己的功能，不需要关心如何被添加到对象链当中。
     * @param args
     */
    public static void main(String[] args) {

        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorA ca = new ConcreteDecoratorA();
        ConcreteDecoratorB cb = new ConcreteDecoratorB();

        ca.setAbstractComponent(cc);
        cb.setAbstractComponent(ca);

        cb.operation();
    }
}
