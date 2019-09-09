package geek.lanxy.createobject.singleton.client;

import geek.lanxy.createobject.singleton.core.MultiThreadSingleton;
import geek.lanxy.createobject.singleton.core.SimpleSingleton;
import geek.lanxy.createobject.singleton.core.StaticSingleton;

/**
 * @author: lanxinyu@meituan.com
 * @Description: 客户端
 * @Date: 2018-09-14 上午10:33
 */
public class Client {


    public static void main(String[] args) {
        MultiThreadSingleton multiThreadSingleton1 = MultiThreadSingleton.getInstance();
        MultiThreadSingleton multiThreadSingleton2 = MultiThreadSingleton.getInstance();
        System.out.println("MultiThreadSingleton equals :" + multiThreadSingleton1.equals(multiThreadSingleton2));

        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();
        System.out.println("SimpleSingleton equals :" + simpleSingleton1.equals(simpleSingleton2));

        StaticSingleton staticSingleton1 = StaticSingleton.getInstance();
        StaticSingleton staticSingleton2 = StaticSingleton.getInstance();
        System.out.println("StaticSingleton equals :" + staticSingleton1.equals(staticSingleton2));
    }
}
