package geek.lanxy.structure.bridge.client;

import geek.lanxy.structure.bridge.core.Abstraction;
import geek.lanxy.structure.bridge.core.ConcreteImplementorA;
import geek.lanxy.structure.bridge.core.ConcreteImplementorB;
import geek.lanxy.structure.bridge.core.RefinedAbstraction;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午6:33
 * @Description: 抽象部分与实现部分分离，使它们都可以独立地变化。
 */
public class Client {

    public static void main(String[] args) {

        Abstraction abstraction = new RefinedAbstraction();
        /**
         * 抽象独立地部分变化：abstraction = new RefinedAbstractionX();
         */
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();
        /**
         * 实现部分独立地变化：new ConcreteImplementorB()
         */
        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
