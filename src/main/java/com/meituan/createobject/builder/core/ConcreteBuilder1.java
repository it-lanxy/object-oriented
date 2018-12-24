package com.meituan.createobject.builder.core;

/**
 * @author: lanxinyu@meituan.com
 * @Description: 具体建造者类
 * @Date: 2018-09-14 下午4:33
 */
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件1A");
    }

    @Override
    public void buildPartB() {
        product.add("部件1B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
