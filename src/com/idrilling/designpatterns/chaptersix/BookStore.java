package com.idrilling.designpatterns.chaptersix;

import java.text.NumberFormat;
import java.util.ArrayList;

import org.junit.Test;

public class BookStore {
	private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
	static{
		bookList.add(new OffNoveIBook("天龙八部", 3200,"金庸"));
		bookList.add(new OffNoveIBook("巴黎圣母院",5600,"雨果"));
		bookList.add(new OffNoveIBook("悲惨世界", 3500,"雨果"));
		bookList.add(new OffNoveIBook("金瓶梅",4300, "兰陵笑笑生"));
		bookList.add(new ComputerBook("Think In Java",4300,"Bruce Eckel","编程语言"));
	}
	
	//模拟书店买书
	public static void main(String[] args){
		NumberFormat formate = NumberFormat.getCurrencyInstance();
		formate.setMaximumFractionDigits(2);
		System.out.println("-----------------------书店卖出的书籍记录如下--------------------------------------");
		for(IBook book : bookList){
			System.out.println("书记名称："+ book.getName()+"\t\t书籍作者"+ book.getAuthor()+"\t\t书籍价格："+formate.format(book.getPrice()/100.0)+"元");
		}
	}
}
