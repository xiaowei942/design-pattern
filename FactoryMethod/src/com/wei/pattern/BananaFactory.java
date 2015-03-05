package com.wei.pattern;

/**
 * Created by liwei on 15-3-3.
 */
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
