package com.meituan.structure.decorator.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-18 下午12:10
 * @Description: 具体的装饰对象，起到给{@link AbstractComponent} 添加职责的功能
 */
public class ConcreteDecoratorA extends AbstractDecorator{

    /**
     * 本类的独有功能，以区别于{@link ConcreteDecoratorB}
     */
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "new state.";
        System.out.println("具体装饰对象，ConcreteDecoratorA 的operation操作。 ");
    }
}
