package com.meituan.structure.composite.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午8:42
 * @Description: 叶子
 */
public class Leaf extends AbstractComponent {

    public Leaf(String name) {
        super(name);
    }


    /**
     * 由于叶子没有再增加分枝和树叶，所以add和remove方法实现它没有意义，但这样做可以消除叶节点和枝节点对象在抽象层次的区别，它们具备完全一致的接口。
     * @param c
     */
    @Override
    protected void add(AbstractComponent c) {
        System.out.println("『leaf』 cannot add!");
    }

    @Override
    protected void remove(AbstractComponent c) {
        System.out.println("『leaf』 cannot remove!");
    }

    /**
     * 叶节点的具体方法，此处是显示其名称和级别。
     * @param depth
     */
    @Override
    protected void display(Integer depth) {
        System.out.println("『leaf』" + name + " depth " + depth);
    }
}
