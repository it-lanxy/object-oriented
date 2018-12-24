package com.meituan.structure.facade.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-18 下午3:03
 * @Description: 外观类，知道哪些子系统类负责处理请求，将客户的请求代理给适当的子系统对象
 */
public class Facade {

    /**
     * @tips: volatile 防止构造函数指令重排 {@url https://blog.csdn.net/chunlongyu/article/details/52425465}
     */
    private volatile SubSystemOne one ;
    private volatile SubSystemTwo two ;
    private volatile SubSystemThree three ;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
    }

    public void methodA() {
        two.methodTow();
        one.methodOne();
    }

    public void methodB() {
        two.methodTow();
        three.methodThree();
        one.methodOne();
    }

}
