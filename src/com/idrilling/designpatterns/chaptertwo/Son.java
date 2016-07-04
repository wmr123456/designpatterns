package com.idrilling.designpatterns.chaptertwo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father{
	public Collection doSomething(Map map){
		System.out.println("子类被执行了！");
		return map.values();
	}
	
	public Collection doSomething(HashMap map){
		System.out.println("父类被执行了！");
		return map.values();
	}
}
