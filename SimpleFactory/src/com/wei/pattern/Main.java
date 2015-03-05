package com.wei.pattern;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//        Fruit apple = FruitFactory.getApple();
//        apple.get();
//
//        Fruit banana = FruitFactory.getBanana();
//        banana.get();

        //Fruit apple = FruitFactory.getFruit("Apple");
        Fruit banana = FruitFactory.getFruit("Banana");

        //apple.get();
        banana.get();
    }
}
