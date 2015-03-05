package com.wei.pattern;
import com.wei.*;

/**
 * Created by liwei on 15-3-3.
 */
public class FruitFactory{
//    public static Fruit getApple() {
//        return new Apple();
//    }
//
//    public static Fruit getBanana() {
//        return new Banana();
//    }

    /*
      get方法，获得所有产品对象
     */
//    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException {
//        if(type.equalsIgnoreCase("apple")) {
//            return Apple.class.newInstance();
//        } else if (type.equalsIgnoreCase("banana")) {
//            return Banana.class.newInstance();
//        } else {
//            System.out.println("找不到相应的实例化类");
//            return null;
//        }
//    }

    public static Fruit getFruit(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class fruit = Class.forName(type);
        return (Fruit)fruit.newInstance();
    }
}
