package com.idrilling.designpatterns.charpterseven;

/**
 * Created by mrwang on 16-7-4.
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    private Singleton(){

    }

    public Singleton getSingleton(){
        return singleton;
    }

    public static void  doSomething(){

    }
}
