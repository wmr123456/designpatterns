package com.idrilling.designpatterns.chapterfive;

import java.util.List;

public class GroupLeader {
	private List<Girl> listGirl;
	
	public GroupLeader(List<Girl> _listGrils){
		this.listGirl = _listGrils;
	}
	//女生的数量
	public void countGirl(){
		System.out.println("女生的数量：" +listGirl.size() );
	}
	
}
