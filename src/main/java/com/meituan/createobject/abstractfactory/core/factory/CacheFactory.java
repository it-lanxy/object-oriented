package com.meituan.createobject.abstractfactory.core.factory;


import com.meituan.createobject.abstractfactory.core.repository.CacheStudentRepository;
import com.meituan.createobject.abstractfactory.core.repository.CacheUserRepository;
import com.meituan.createobject.abstractfactory.core.repository.StudentRepositoryI;
import com.meituan.createobject.abstractfactory.core.repository.UserRepositoryI;

/**
 * @author: lanxinyu@meituan.com
 *
 * @Date: 2018-09-13 下午5:39
 *
 * @Description: 具体的工厂，创建具有特定实现「缓存」的 类 对象
 */
public class CacheFactory implements Factory {
    @Override
    public UserRepositoryI getUser() {
        return new CacheUserRepository();
    }

    @Override
    public StudentRepositoryI getStudent() {
        return new CacheStudentRepository();
    }
}
