package com.idrilling.designpatterns.charptereight;

/**
 * Created by mrwang on 16-7-4.
 */
public class WhiteHuman implements Human {
    public void getColor(){
        System.out.println("白色人中的皮肤应该是白色的！");
    }

    public void talk(){
        System.out.println("白色人中会说话，一般都是单字节！");
    }
}
