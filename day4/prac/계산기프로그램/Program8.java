package day4.prac.계산기프로그램;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Scanner;

public class Program8 {

	
	//직접생성하지 않고 외부에서 생성된 계산기 객체 주입받기
	//세터주입
	Calculator calculator;
	
	
	
	
	 
	//세터주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public Program8() {
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		
		
		System.out.println("프로그램 시작 ver 8");
		System.out.println("두 수를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		
		int total = calculator.add(su1, su2);
		
		System.out.println(total);
		
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		
//		Program8 p = new Program8();
////		p.setCaculator(new A());
////		p.run();
		
		
		
		Properties properties = new Properties();
		properties.load( new FileReader("src/day4/prac/계산기프로그램/config.txt"));
		String name = (String) properties.get("Calculator");
		
		
		Class clazz = Class.forName(name);
		Calculator calculator = (Calculator)clazz.getDeclaredConstructor().newInstance();
		
		
		
		
		Program8 p = new Program8();
		p.setCalculator(calculator);
		p.run();
	}





	

}
