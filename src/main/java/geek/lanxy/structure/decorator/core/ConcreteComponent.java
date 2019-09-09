package geek.lanxy.structure.decorator.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-18 下午12:06
 * @Description: 定义了一个具体的对象，也可以给这个对象添加一些职责。
 */
public class ConcreteComponent extends AbstractComponent {
    @Override
    void operation() {
        System.out.println("具体的对象, ConcreteComponent 的operation操作。");
    }
}
