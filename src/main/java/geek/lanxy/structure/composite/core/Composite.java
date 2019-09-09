package geek.lanxy.structure.composite.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午8:55
 * @Description:
 */
public class Composite extends AbstractComponent {

    /**
     * 子对象集合，用来存储下属的枝节点，和叶节点
     */
    private List<AbstractComponent> children = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }


    @Override
    public void add(AbstractComponent c) {
        children.add(c);
    }

    @Override
    public void remove(AbstractComponent c) {
        children.remove(c);
    }

    @Override
    public void display(Integer depth) {
        System.out.println(depth + name);
        for (AbstractComponent c:children
                ) {
            c.display(depth + 2);
        }
    }
}
