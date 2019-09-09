package geek.lanxy.structure.facade.client;


import geek.lanxy.structure.facade.core.Facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
