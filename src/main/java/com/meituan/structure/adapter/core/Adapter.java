package com.meituan.structure.adapter.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午6:27
 * @Description: 通过在内部包装一个Adaptee对象，把元接口转换成目标接口
 */
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();


    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
