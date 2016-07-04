package com.idrilling.designpatterns.charptereight;

/**
 * Created by idrilling on 16-7-4.
 *
 * 具体工厂类
 */
public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product)Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){
            //异常处理
        }
        return (T) product;
    }
}
