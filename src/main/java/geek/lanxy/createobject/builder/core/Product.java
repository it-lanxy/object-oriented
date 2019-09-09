package geek.lanxy.createobject.builder.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lanxinyu@meituan.com
 * @Description:
 * @Date: 2018-09-14 下午4:29
 */
public class Product {

    List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show() {
        for (String part : parts
             ) {
            System.out.println(part);
        }
    }
}
