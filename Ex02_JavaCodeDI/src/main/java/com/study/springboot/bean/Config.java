package com.study.springboot.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class Config {
	// 빈(bean) : Spring이 IoC 방식으로 관리하는 객체
	// 빈 팩토리 (BeanFactory) : 스프링의 IoC를 담당하는 핵심 컨테이
	// 어플리케이션 컨텍스트 (ApplicationContext) : 빈 팩토리를 확장한 IoC 컨테이
	
	@Bean
	public Member member1() {
		// Setter Injection (Setter 메서드를 이용한 의존성 주입)
		Member member1 = new Member();
		member1.setName("홍길동");
		member1.setNickname("도사");
		member1.setPrinter(new PrinterA());
		
		return member1;
	}
	
	@Bean(name="hello") // 별도의 명칭으로 bean등록 할수있음
	public Member member2() {
		// Constructor Injection (생성자를 이용한 의존성 주입)
		return new Member("전우치 ", "도사 ", new PrinterA());
	}
	
	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}
	
	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
	
}
