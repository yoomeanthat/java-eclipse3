package day4.prac.reflect;

import java.lang.reflect.InvocationTargetException;

public class EX04 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		
		
		//1. 클래스 정보 얻어오기
		//Class.forName() 사용하기
		
		
		Class clazz = Class.forName("day4.prac.reflect.Member");
		
		Member m = (Member) clazz.getDeclaredConstructor(String.class, String.class).newInstance("kjiun", "0000");
		
		m.printInfo();
	}

}
