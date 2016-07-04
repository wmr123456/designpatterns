package com.idrilling.designpatterns.charpterseven;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by mrwang on 16-7-4.
 */
public class Emperor {
    /*private static final Emperor emperor = new Emperor();
    private Emperor(){
        //世俗和道德约束你，目的就是不希望产生第二个皇帝
    }

    public static Emperor getInstance(){
        return emperor;
    }

    public static void say(){
        System.out.println("我就是皇帝啦啦啦................!");
    }*/


    //扩展皇帝类：固定数量的皇帝类
    //定义最多能产生的实例个数
    private static int maxNumOfEmperor = 2;
    //每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<String>();
    //定义一个列表来容纳所有皇帝类实例
    private static ArrayList<Emperor> emperorsList = new ArrayList<Emperor>();
    //当前皇帝类序号
    private static int countNumOfEmperor = 0;
    //产生所有的对象
    static{
        for(int i = 0; i < maxNumOfEmperor; i++){
            emperorsList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }

    private Emperor(String name){
        nameList.add(name);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        //随机拉出一个皇帝，只要是精神领袖就成。
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorsList.get(countNumOfEmperor);
    }

    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }
}