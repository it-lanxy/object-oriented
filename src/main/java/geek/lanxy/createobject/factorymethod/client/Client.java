package geek.lanxy.createobject.factorymethod.client;

import geek.lanxy.createobject.factorymethod.core.factory.ConcreteUserFactory;
import geek.lanxy.createobject.factorymethod.core.factory.UserFactory;
import geek.lanxy.createobject.factorymethod.core.repository.UserRepositoryI;

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
