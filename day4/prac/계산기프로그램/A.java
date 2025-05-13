package day4.prac.계산기프로그램;

public class A implements Calculator{

	@Override
	public int add(int su1, int su2) {
		
		System.out.println("A 계산기");
		return su1 + su2;
	}

}
