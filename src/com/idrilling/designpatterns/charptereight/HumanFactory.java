package com.idrilling.designpatterns.charptereight;

/**
 * Created by idrilling on 16-7-4.
 */
public class HumanFactory extends AbstractHumanFactory {
    public <T extends Human> T creatHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = (T)Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人中生成错误！");
        }
        return (T)human;
    }
}