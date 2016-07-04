package com.idrilling.designpatterns.chapterfive;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args){
		//产生一个女生群体
		List<Girl> listGitls = new ArrayList<Girl>();
		for(int i = 0; i < 20; i++){
			listGitls.add(new Girl());
		}
		Teacher teacher = new Teacher();
		teacher.commond(new GroupLeader(listGitls));
	}
}
