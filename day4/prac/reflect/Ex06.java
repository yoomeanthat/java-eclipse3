package day4.prac.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex06 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		Class clazz = Class.forName("day4.prac.reflect.Member");
		
		Member m = (Member) clazz.getDeclaredConstructor().newInstance(args);
		
		
		//printInfo
		//Member m = new Member();
		//m.printInfo();
		//printInfo();	//객체정보 전달됨
		//m.printSquare(5);
		
		
		Method method = clazz.getDeclaredMethod("printInfo");
		method.invoke(m);
		
		
		
		//printSquare
		
		Method method2 = clazz.getDeclaredMethod("printSquare", int.class);
		//
		
		//매서드 호출
		method2.invoke(m, 5);

	}

}
