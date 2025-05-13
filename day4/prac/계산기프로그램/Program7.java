package day4.prac.계산기프로그램;

import java.util.Scanner;

public class Program7 {

	
	//직접생성하지 않고 외부에서 생성된 계산기 객체 주입받기
	//세터주입
	Calculator calculator;
	
	
	
	
	
	//세터주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
	public Program7() {
		// TODO Auto-generated constructor stub
	}
	
	
	


	public void run() {
		
		
		System.out.println("프로그램 시작 ver 7");
		System.out.println("두 수를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		
		int total = calculator.add(su1, su2);
		
		System.out.println(total);
		
	}
	
	
	public static void main(String[] args) {
		
		
		Program7 p = new Program7();
		p.setCalculator(new A());
		p.setCalculator(new B());
		p.run();
	}





	

}
