package com.meituan.structure.adapter.core;

/**
 * 客户端所期待的接口
 */
public interface Target {
    default void request(){
        System.out.println("普通请求");
    }
}
