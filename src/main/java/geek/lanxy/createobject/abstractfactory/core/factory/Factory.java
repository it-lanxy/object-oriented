package geek.lanxy.createobject.abstractfactory.core.factory;


import geek.lanxy.createobject.abstractfactory.core.repository.StudentRepositoryI;
import geek.lanxy.createobject.abstractfactory.core.repository.UserRepositoryI;

/**
 * 抽象工厂接口，它里面应该包含所有的对象创建的抽象方法。
 */
public interface Factory {
    StudentRepositoryI getStudent();
    UserRepositoryI getUser();
}
