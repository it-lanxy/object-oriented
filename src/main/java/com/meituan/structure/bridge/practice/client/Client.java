package com.meituan.structure.bridge.practice.client;

import com.google.common.collect.Lists;
import com.meituan.structure.bridge.practice.abstraction.AbstractFood;
import com.meituan.structure.bridge.practice.abstraction.AbstractMenu;
import com.meituan.structure.bridge.practice.abstraction.FoodWork;
import com.meituan.structure.bridge.practice.detail.CaculateFood;
import com.meituan.structure.bridge.practice.detail.CommonFood;
import com.meituan.structure.bridge.practice.detail.ConcreteMenu;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-09-17 下午6:33
 * @Description: 抽象部分与实现部分分离，使它们都可以独立地变化。
 */
public class Client {

    public static void main(String[] args) {

        AbstractMenu am = new ConcreteMenu();
        List<AbstractFood> foods = Lists.newArrayList();
        List<FoodWork> fw = Lists.newArrayList();
        fw.add(new FoodWork(1,2));
        fw.add(new FoodWork(2,1));
        foods.add(new CaculateFood("水煮鱼", 2.3D, new BigDecimal(20), new BigDecimal(30), new BigDecimal(20), fw));
        foods.add(new CommonFood("炖酸菜", new BigDecimal(20), new BigDecimal(30), fw));
        foods.add(new CommonFood("水饺", new BigDecimal(20), new BigDecimal(30), fw));
        am.setFoods(foods);
        am.setTableNum(Lists.newArrayList(103,115));

        System.out.println("------------ vip 折后金额 ------------");
        System.out.println(am.show(true));
        System.out.println();
        System.out.println();
        System.out.println("------------ 普通    金额 ------------");
        System.out.println(am.show(false));
    }
}
