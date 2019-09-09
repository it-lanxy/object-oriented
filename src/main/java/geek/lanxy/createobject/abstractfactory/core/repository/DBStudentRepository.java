package geek.lanxy.createobject.abstractfactory.core.repository;

/**
 * @author: lanxinyu@meituan.com
 * @Description:
 * @Date: 2018-09-13 下午8:27
 */
public class DBStudentRepository implements StudentRepositoryI {
    @Override
    public void add() {
        System.out.println("「DB」add student.");
    }
}
