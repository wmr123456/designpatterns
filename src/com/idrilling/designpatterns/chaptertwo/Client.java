package com.idrilling.designpatterns.chaptertwo;

import java.util.HashMap;


public class Client {
	public static void invoker(){
		/*Father f = new Father();
		HashMap map = new HashMap();
		f.doSomething(map);*/
		Son s = new Son();
		HashMap map = new HashMap();
		s.doSomething(map);
	}
	
	public static void main(String[] args){
		invoker();
	}
}
