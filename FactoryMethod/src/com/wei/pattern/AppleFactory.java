package com.wei.pattern;

/**
 * Created by liwei on 15-3-3.
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
