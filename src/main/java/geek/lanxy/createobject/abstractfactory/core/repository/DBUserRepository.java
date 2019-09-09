package geek.lanxy.createobject.abstractfactory.core.repository;

/**
 * @author: lanxinyu@meituan.com
 * @Description:
 * @Date: 2018-09-13 下午5:36
 */
public class DBUserRepository implements UserRepositoryI {
    @Override
    public void add() {
        System.out.println("「DB」add user.");
    }
}
