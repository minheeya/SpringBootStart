package com.study.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.bean.Config;
import com.study.springboot.bean.Member;
import com.study.springboot.bean.Printer;

// @SpringBootApplication -> 자동으로 설정되고 등록됨 
public class Ex02JavaCodeDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Ex02JavaCodeDiApplication.class, args);
		
		// 1. IoC 컨테이너 생성 
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		// 2. Member Bean 가져오기 
		Member member1 = (Member)context.getBean("member1"); // 가져온 후 형 변환 
		member1.print();
		
		// 3. Member Bean 가져오기 
		Member member2 = context.getBean("hello", Member.class); // 가져올 때 클래스 명으로 지정해서 가져옴 
		member2.print();
		
		// 4. PrinterB Bean 가져오기 
		Printer printer = context.getBean("printerB", Printer.class);
		member1.setPrinter(printer);   // member1의 printer에 주입 시킴 
		member1.print();
		
		// 5. 싱글톤인지 확인 = 서로 같은 객체인지 다른 객체인지 확인 
		if (member1 == member2) {
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("서로 다른 객체입니다.");
		}
	}

}
