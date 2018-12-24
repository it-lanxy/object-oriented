package com.meituan.createobject.abstractfactory.core.repository;

/**
 * @author: lanxinyu@meituan.com
 * @Description:
 * @Date: 2018-09-13 下午5:37
 */
public class CacheUserRepository implements UserRepositoryI {
    @Override
    public void add() {
        System.out.println("「CACHE」add user.");
    }
}
