package day4.prac.실습;

import java.util.Scanner;

public class InfoWarrior {

	public void printInfo() {
		Scanner sc = new Scanner(System.in);

		// 전사 장비
		String hat, top, bottom;

		System.out.println("전사의 모자를 골라주세요");
		hat = sc.nextLine();
		System.out.println("전사의 상의를 골라주세요");
		top = sc.nextLine();
		System.out.println("전사의 바지를 골라주세요");
		bottom = sc.nextLine();

		// 전사 스킬
		String skillName1, skillName2;

		System.out.println("전사의 스킬을 입력하세요");
		skillName1 = sc.nextLine();
		skillName2 = sc.nextLine();

		System.out.println("전사의 장비는 " + hat + " " + top + " " + bottom + " 입니다");
		
		Warrior w = new Warrior();
		w.use(skillName1, skillName2);
		System.out.println(skillName1 + "와(과) " + skillName2 + "을(를) 사용한다");

	}

	public static void main(String[] args) {

		InfoWarrior info = new InfoWarrior();
		info.printInfo();

	}

}
