package com.idrilling.designpatterns.charpterseven;

/**
 * Created by mrwang on 16-7-4.
 */
public class Minister {

    /*public static void main(String[] args){
        for(int day = 0; day < 3; day++){
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }*/

    //臣子参拜皇帝的过程

    public static void main(String[] args){
        int ministerNum = 5;
        //定义5个大臣
        for(int i = 0; i < ministerNum; i++){
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+(i+1)+"个大臣参拜的是： ");
            emperor.say();
        }
    }
}
