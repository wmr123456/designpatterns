package com.idrilling.designpatterns.charptereight;

/**
 * Created by idrilling on 16-7-4.
 */
public abstract class Creator{
    /*
     *创建一个产品对象，其输入参数可以自行设置
     * 通常为String，Enum，Class等，当然也可以为空
     */

    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
