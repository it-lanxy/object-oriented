package geek.lanxy.createobject.factorymethod.core.factory;


import geek.lanxy.createobject.factorymethod.core.repository.DBUserRepository;
import geek.lanxy.createobject.factorymethod.core.repository.UserRepositoryI;

/**
 * @author: lanxinyu@meituan.com
 * @Description:
 * @Date: 2018-09-13 下午5:39
 */
public class ConcreteUserFactory implements UserFactory{
    @Override
    public UserRepositoryI getUser() {
        return new DBUserRepository();
    }
}
