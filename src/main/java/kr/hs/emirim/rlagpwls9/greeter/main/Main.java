package kr.hs.emirim.rlagpwls9.greeter.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.emirim.rlagpwls9.greeter.config.AppContext;
import kr.hs.emirim.rlagpwls9.greeter.greeter.Greeter;

public class Main {

	public static void main(String[] args) {
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Greeter g = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter2", Greeter.class);
		
		if(g == g2) { // 두 가지 객체가 같은 객체인가?
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
		
		// GenericXmlApplicationContext : 일반적인 XML파일을 가져와 Context를 만들어 주는 것이다.
		
//		Greeter greeter = new Greeter();
//		greeter.setFormat("%s씨, 안녕하세요!");
//		String msg = greeter.greet("김나령"); //msg는 "스프링, 안녕하세요!"가 된다.
//		System.out.println(msg);
	}
}
