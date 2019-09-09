package geek.lanxy.structure.facade.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-18 下午3:04
 * @Description: 子系统，被{@link Facade}控制，对客户端不可知
 */
public class SubSystemTwo {

    public void methodTow() {
        System.out.println("「method tow」exe.");
    }
}
