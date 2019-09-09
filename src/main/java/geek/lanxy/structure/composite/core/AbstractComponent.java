package geek.lanxy.structure.composite.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午8:41
 * @Description:
 */
public abstract class AbstractComponent {
    protected String name;
    protected AbstractComponent(String name) {
        this.name = name;
    }

    /**
     * 通常都用 「add」 和 「remove」 方法来提供增加或移除「树叶」或「树枝」的功能
     * @param c
     */
    protected abstract void add(AbstractComponent c);

    protected abstract void remove(AbstractComponent c);

    protected abstract void display(Integer depth);
}
