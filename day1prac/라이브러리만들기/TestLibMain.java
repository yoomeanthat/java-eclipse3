package day1prac.라이브러리만들기;

public class TestLibMain {

	public static void main(String[] args) {
		 
		
		TestLib   lib = new TestLib();
		lib.printStar();		
		lib.printChar('&');
		
		System.out.println();
		
		lib.runCode(  new 코드() {

			@Override
			public void run() {
				
				
				
				System.out.println("hi run");
				
			}});

		
		
		lib.runCode(  new AAA());
	}

}
