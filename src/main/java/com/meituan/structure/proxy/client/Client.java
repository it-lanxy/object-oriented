package com.meituan.structure.proxy.client;


import com.meituan.structure.proxy.core.Proxy;
import com.meituan.structure.proxy.core.Subject;

public class Client {

    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
