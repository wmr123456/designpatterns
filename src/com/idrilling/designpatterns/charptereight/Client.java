package com.idrilling.designpatterns.charptereight;

/**
 * Created by idrilling on 16-7-4.
 */
public class Client {
    public static void main(String[] args){
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.method2();
        /*
        * 继续业务处理
        */
    }
}
