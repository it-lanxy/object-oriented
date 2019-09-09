package geek.lanxy.structure.proxy.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-18 下午3:51
 * @Description: 保存一个引用，使得代理可访问实体，并提供一个与{@link Subject}的接口相同的接口，这样代理就可以代替实体
 */
public class Proxy implements Subject {

    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        realSubject.request();
    }
}
