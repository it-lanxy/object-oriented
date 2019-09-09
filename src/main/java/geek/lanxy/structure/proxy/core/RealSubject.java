package geek.lanxy.structure.proxy.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-18 下午3:50
 * @Description: 定义了{@link Proxy}所代表的真实实体
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
