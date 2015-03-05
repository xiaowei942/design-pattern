package com.wei.pattern;

/**
 * Created by liwei on 15-3-3.
 */
public class MainClass {
    public static void main(String args[]) {
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.get();

        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
        banana.get();
    }
}
