package com.itheima.testthis;

public class Son extends Parent {
	public void init(){
		super.init();
		System.out.println("3 son init");
		this.demo();
	}
	public void demo(){
		System.out.println("4 son demo");
	}
}
