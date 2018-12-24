package com.meituan.createobject.singleton.core;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午2:56
 * @Description: 多线程的单例 + 双重锁定
 */
public class MultiThreadSingleton {
    private static MultiThreadSingleton instance;
    private static final ReadWriteLock lock =  new ReentrantReadWriteLock();
    private MultiThreadSingleton() {}

    public static MultiThreadSingleton getInstance() {
        if(instance == null) {

            /**
             * 当多线程情况下，instance == null 使多个线程在锁等待。
             */
            lock.writeLock().lock();
            try {
                /**
                 * 第一个线程创建了实例，如果没有这个if(instance == null)判断，后面进来的线程会继续创建对象，此为伪单例。
                 */
                if(instance == null) {
                    instance = new MultiThreadSingleton();
                }
            } finally {
                lock.writeLock().unlock();
            }
        }

        return instance;
    }
}
