package com.meituan.createobject.factorymethod.client;

import com.meituan.createobject.factorymethod.core.factory.ConcreteUserFactory;
import com.meituan.createobject.factorymethod.core.factory.UserFactory;
import com.meituan.createobject.factorymethod.core.repository.UserRepositoryI;

/**
 * @author: lanxinyu@meituan.com
 * @Description: 客户端
 * @Date: 2018-09-14 上午10:33
 */
public class Client {


    public static void main(String[] args) {
        UserFactory userFactory = new ConcreteUserFactory();
        UserRepositoryI userRepositoryI = userFactory.getUser();
        userRepositoryI.add();
    }
}
