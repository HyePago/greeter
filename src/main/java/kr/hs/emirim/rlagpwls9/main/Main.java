package kr.hs.emirim.rlagpwls9.main;

import kr.hs.emirim.rlagpwls9.greeter.greeter.Greeter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter();
		greeter.setFormat("%s, 안녕하세요!");
		String msg = greeter.greet("스프링"); //msg는 "스프링, 안녕하세요!"가 된다.
		System.out.println(msg);
	}

}
