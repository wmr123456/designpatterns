package com.idrilling.designpatterns.charptereight;

/**
 * Created by idrilling on 16-7-4.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T creatHuman(Class<T> clazz);
}
