package com.meituan.createobject.abstractfactory.client;

import com.meituan.createobject.abstractfactory.core.factory.CacheFactory;
import com.meituan.createobject.abstractfactory.core.factory.Factory;
import com.meituan.createobject.abstractfactory.core.repository.StudentRepositoryI;
import com.meituan.createobject.abstractfactory.core.repository.UserRepositoryI;

/**
 * @author: lanxinyu@meituan.com
 * @Description: 客户端
 * @Date: 2018-09-14 上午10:33
 */
public class Client {

    /**
     * 客户端切换数据源的时候只需要修改 FactoryI factory = new DBFactory();
     * 而业务逻辑无需变化
     *
     *  StudentRepositoryI studentRepository = factory.getStudent();
     *  studentRepository.add();
     *
     *  UserRepositoryI userRepository = factory. getUser();
     *  userRepository.add();
     *
     * @param args
     */
    public static void main(String[] args) {
        Factory factory = new CacheFactory();

        StudentRepositoryI studentRepository = factory.getStudent();
        studentRepository.add();

        UserRepositoryI userRepository = factory.getUser();
        userRepository.add();
    }
}
