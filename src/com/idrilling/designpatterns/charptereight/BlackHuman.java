package com.idrilling.designpatterns.charptereight;

/**
 * Created by mrwang on 16-7-4.
 */
public class BlackHuman implements Human {
    public void getColor(){
        System.out.println("黑色人种的皮肤颜色是黑色！");
    }

    public void talk(){
        System.out.println("黑人会说话，一般人听不懂！");
    }
}