package com.idrilling.designpatterns.charptereight;

/**
 * Created by mrwang on 16-7-4.
 */
public class NvWa {
    public static void main(String[] args){
        //声明八卦炉
        AbstractHumanFactory YinYangLu = new HumanFactory();
        //女娲第一次造人，火候不足，于是拜仁产生了
        System.out.println("--造出第一批人是白色人种--");
        Human whiteHuman = YinYangLu.creatHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //女娲第二次造人，火候过足，于是产生了黑色人种
        System.out.println("\n--造出的第二批人事黑色人种--");
        Human blackHuman = YinYangLu.creatHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //女娲第三次造人，火候刚刚好，于是黄色人种产生了
        System.out.println("\n--早出的第三批人是黄色人种！--");
        Human yellowHuman = YinYangLu.creatHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
