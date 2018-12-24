package com.meituan.structure.decorator.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-18 下午12:07
 * @Description: 装饰抽象类，继承了{@link AbstractComponent} ，从外类来扩展 {@link AbstractComponent} 类的功能，
 * 但对于 {@link AbstractComponent} 来说，是无需知道 {@link AbstractDecorator} 的存在的
 */
public abstract class AbstractDecorator extends AbstractComponent{
    protected AbstractComponent abstractComponent;

    public void setAbstractComponent(AbstractComponent abstractComponent) {
        this.abstractComponent = abstractComponent;
    }

    @Override
    void operation() {
        if(abstractComponent != null) {
            abstractComponent.operation();
        }
    }
}
