package geek.lanxy.createobject.builder.core;

/**
 * @author: lanxinyu@meituan.com
 * @Description: 抽象建造者类
 * @Date: 2018-09-14 下午4:31
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
