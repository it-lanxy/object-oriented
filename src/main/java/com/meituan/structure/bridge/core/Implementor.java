package com.meituan.structure.bridge.core;

/**
 * 实现系统可以有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们之间的耦合。
 */
public interface Implementor {
    void operation();
}
