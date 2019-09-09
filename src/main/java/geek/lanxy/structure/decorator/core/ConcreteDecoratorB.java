package geek.lanxy.structure.decorator.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-18 下午2:05
 * @Description:
 */
public class ConcreteDecoratorB extends AbstractDecorator {

    /**
     * 本类的独有功能，以区别于{@link ConcreteDecoratorA}
     */
    private void addBehavior() {}

    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰对象，ConcreteDecoratorB 的operation操作。 ");
    }
}
