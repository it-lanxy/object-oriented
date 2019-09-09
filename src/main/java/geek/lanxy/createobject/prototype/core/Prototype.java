package geek.lanxy.createobject.prototype.core;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午2:11
 * @Description: 原型类
 */
public abstract class Prototype {

    public Prototype(Integer id) {
        this.id = id;
    }

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *抽象类的关键是有这样一个Clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    protected abstract Prototype cloneThis() throws CloneNotSupportedException;
}
