package geek.lanxy.structure.proxy.client;


import geek.lanxy.structure.proxy.core.Proxy;
import geek.lanxy.structure.proxy.core.Subject;

public class Client {

    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
