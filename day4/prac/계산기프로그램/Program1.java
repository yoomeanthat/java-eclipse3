package day4.prac.계산기프로그램;

import java.util.Scanner;

//계산기프로그램
//사용자가 입력한 두 수를 더해주는 프로그램
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		int su1, su2;
		
		System.out.println("두 수 입력 하세요 .. 계산해 드릴게요");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		
		//
		int total;
		total = su1 + su2;
		
		
		System.out.println(total);
		
	}

}
