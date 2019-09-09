package geek.lanxy.createobject.builder.client;

import geek.lanxy.createobject.builder.core.Builder;
import geek.lanxy.createobject.builder.core.ConcreteBuilder2;
import geek.lanxy.createobject.builder.core.Director;
import geek.lanxy.createobject.builder.core.Product;

/**
 * @author: lanxinyu@meituan.com
 * @Description: 客户端
 * @Date: 2018-09-14 上午10:33
 */
public class Client {

    /**
     * 建造者模式是在当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时适用的模式。
     * @param args
     */
    public static void main(String[] args) {
        //Builder builder = new ConcreteBuilder1();
        Builder builder = new ConcreteBuilder2();

        Director.create(builder);
        Product product = builder.getResult();
        product.show();
    }
}
