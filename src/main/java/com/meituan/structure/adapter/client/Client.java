package com.meituan.structure.adapter.client;

import com.meituan.structure.adapter.core.Adapter;
import com.meituan.structure.adapter.core.Target;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午6:33
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 客户端想使用 Adaptee.specificRequest()方法，但是暴露给客户端的只有Target接口
         * Adapter适配器解决了客户端不能调用Adaptee的问题。
         */
        Target target = new Adapter();
        target.request();
    }
}
