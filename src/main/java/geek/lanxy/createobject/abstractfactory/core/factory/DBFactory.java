package geek.lanxy.createobject.abstractfactory.core.factory;


import geek.lanxy.createobject.abstractfactory.core.repository.DBStudentRepository;
import geek.lanxy.createobject.abstractfactory.core.repository.DBUserRepository;
import geek.lanxy.createobject.abstractfactory.core.repository.StudentRepositoryI;
import geek.lanxy.createobject.abstractfactory.core.repository.UserRepositoryI;

/**
 * @author: lanxinyu@meituan.com
 *
 * @Date: 2018-09-13 下午5:39
 *
 * @Description: 具体的工厂，创建具有特定实现『mysql』的 类 对象
 */
public class DBFactory implements Factory {
    @Override
    public UserRepositoryI getUser() {
        return new DBUserRepository();
    }

    @Override
    public StudentRepositoryI getStudent() {
        return new DBStudentRepository();
    }
}
