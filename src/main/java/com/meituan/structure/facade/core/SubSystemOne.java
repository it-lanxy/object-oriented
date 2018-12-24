package com.meituan.structure.facade.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-18 下午3:04
 * @Description: 子系统，被{@link Facade}控制，处理{@link Facade}指派的任务，对客户端不可知
 */
public class SubSystemOne {

    public void methodOne() {
        System.out.println("「method one」exe.");
    }
}
