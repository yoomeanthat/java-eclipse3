package day1prac.라이브러리만들기;




public class WjyLib {

	

	void printStar() {
		System.out.print("* * *");
	}
	
	void printChar(char a) {
		System.out.printf("%c %c %c",a,a,a);
	}
		
	
	//라이브러리를 제공할 때 
	//결정할 수 없는 코드가 생김  =>
	//인터페이스활용함  (라이브러를 제공하는 사람이)
	
	// interface  코드 {    void run();  }
	
	public  void runCode( 코드 code  ) {
		
		for( int i=1; i<=3 ; i++) {
			//System.out.println( i);
			code.run();
		}
		
	}
	
}
