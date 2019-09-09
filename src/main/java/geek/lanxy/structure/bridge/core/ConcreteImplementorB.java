package geek.lanxy.structure.bridge.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午8:17
 * @Description:
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operation() {
        System.out.println("「具体实现」 B 方法执行！");
    }
}
