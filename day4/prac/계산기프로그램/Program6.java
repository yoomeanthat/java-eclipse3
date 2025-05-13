package day4.prac.계산기프로그램;

import java.util.Scanner;

public class Program6 {
	Calculator calculator;

	
	// 생성자주입 Program6이 생성될 때 매개변수로 계산기 객체를 받음
	public Program6(Calculator calculator) {
		this.calculator = calculator;
	}


	public void run() {
		//
		System.out.println("프로그램 시작 VER6");

		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력하시오");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();

		int total = calculator.add(su1, su2);
		System.out.println(total);
		
	}

	
	public static void main(String[] args) {

//		Program6 p = new Program6(new A()); // 계산기 객체 주입
//		p.run();
		
		
		Program6 p = new Program6(new B()); // 계산기 객체 주입
		p.run();

	}

}
