package day4.prac.계산기프로그램;

import java.util.Scanner;

public class Program2 {

	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력... 계산해 드립니다 ver2");
		
		int su1, su2;
		
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		int total;
		
		AcornCalculator cal = new AcornCalculator();
		total = cal.add(su1, su2);
		
		
		System.out.println("두 수의 결과" + total);
		

	}

}
