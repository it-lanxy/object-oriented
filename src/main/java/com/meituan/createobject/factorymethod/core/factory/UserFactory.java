package com.meituan.createobject.factorymethod.core.factory;

import com.meituan.createobject.factorymethod.core.repository.UserRepositoryI;

public interface UserFactory {
    /**
     * 声明工厂方法，该方法返回一个User
     * @return
     */
    UserRepositoryI getUser();
}
