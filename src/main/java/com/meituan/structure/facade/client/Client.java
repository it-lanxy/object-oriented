package com.meituan.structure.facade.client;


import com.meituan.structure.facade.core.Facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
