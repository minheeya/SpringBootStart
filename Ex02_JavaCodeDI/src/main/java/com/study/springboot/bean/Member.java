package com.study.springboot.bean;

public class Member {
	// 멤버 변수 3개 
	private String name;
	private String nickname;
	private Printer printer;
	
	// 생성자 
	public Member() {}
	
	// 파라미터를 가지는 생성자
	public Member(String name, String nickname, Printer printer) {
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	
	// 3개의 setter
	public void setName(String name) {
		this.name = name;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	// 추가적인 기능 
	public void print() {
		printer.print("Hello " + name + " : " + nickname);
	}

}
