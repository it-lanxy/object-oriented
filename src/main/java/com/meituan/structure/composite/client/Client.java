package com.meituan.structure.composite.client;


import com.meituan.structure.composite.core.Composite;
import com.meituan.structure.composite.core.Leaf;

/**
 * 将对象组合成树形结构以表示"部分-整体"的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性。
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite com = new Composite("com");
        com.add(new Leaf("Leaf XA"));
        com.add(new Leaf("Leaf XB"));

        root.add(com);

        Composite com2 = new Composite("com2");
        com2.add(new Leaf("Leaf XYA"));
        com2.add(new Leaf("Leaf XYB"));

        com.add(com2);

        root.display(1);

    }
}
