package day4.prac.계산기프로그램;

import java.util.Scanner;

public class Program4 {
	
	
	
	//계산기클래스	-> KakaoCalculator 변경
	KakaoCalculator cal = new KakaoCalculator();
	//변경포인트

	// run()

	public void run() {
		System.out.println("계산기 프로그램 시작 !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력... 계산해 드립니다 ver4");

		int su1, su2;
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		int total = cal.addKakao(su1, su2);	//변경
		System.out.println(total);
	}

	public static void main(String[] args) {
		Program4 p = new Program4();
		p.run();

	}

}
