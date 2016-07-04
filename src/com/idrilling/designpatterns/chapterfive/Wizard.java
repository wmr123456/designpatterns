package com.idrilling.designpatterns.chapterfive;

import java.util.Random;

public class Wizard {
	private Random rand = new Random(System.currentTimeMillis());
	
	//第一步
	private int first(){
		System.out.println("执行第一个方法...");
		return rand.nextInt(100);
	}
	
	//第二部
	private int secend(){
		System.out.println("执行第二个方法...");
		return rand.nextInt(100);
	}
	
	//第三部
	private int third(){
		System.out.println("执行第三个方法...");
		return rand.nextInt(100);
	}
	
	public void installWizard(){
		int first  = this.first();
		if(first > 50){
			int secend = this.secend();
			if(secend > 50){
				int third = this.third();
				if(third > 50){
					this.first();
				}
			}
		}
	}
}
