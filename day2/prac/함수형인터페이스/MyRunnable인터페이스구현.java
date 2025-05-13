package day2.prac.함수형인터페이스;

public class MyRunnable인터페이스구현 {

	public static void main(String[] args) {
		
		
		//
		
		김유민 a = new 김유민();
		a.run();
		
		
		MyRunnable r = a;	//
		r.run();
		
		
		
		//2. 익명
		
		
		MyRunnable r2 = new MyRunnable() {

			@Override
			public void run() {
				System.out.println("^^집에가요!!");
				
			}
			
		};
		
		r2.run();
		
		
		
		//3. 람다식
		
		MyRunnable r3 = ()->{System.out.println("다함께 집으로 런런!!");};
		r3.run();
	}

}
