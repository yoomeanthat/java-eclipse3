package day4.prac.계산기프로그램;

public class B implements Calculator{

	@Override
	public int add(int su1, int su2) {
		
		System.out.println("B 계산기");
		return su1 + su2;
	}

}
