package day2.prac.forEach;

import java.util.ArrayList;
import java.util.function.Consumer;


public class forEach사용하기 {

	public static void main(String[] args) {

		
		//
		ArrayList<Moving> list = new ArrayList<>();

		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", "문산", 90));
		list.add(new Moving("전영석", "봉평", 88));
		
		
		
		
		//출력
		
		
		for(Moving m: list) {
			System.out.println(m);
		}
		
		/*
		 
		 interface Consumer<T>
		 {
		 	void accept(T t);
		 }
		 
		 
		 interface Consumer{
		 	void accept( Object o );
		 }
		 
		 */
		
		//Consumer 인터페이스를 익명으로 구현 1) 이름있는 클래스로 구현, 2) 익명클래스 3)람다식(함수형 인터페이스만 가능!) 
		
		// Consumer 인터페이스를 익명으로 구현
		list.forEach(new Consumer() {

			@Override
			public void accept(Object t) {
				
				Moving m = (Moving) t;
				System.out.println(m.getName() + m.getAlias() + "^^^^^^");
				
			}
			
			
		});
		
		list.forEach(new Consumer<Moving>() {
			
			@Override
			public void accept(Moving t) {
				System.out.println(t.getName() + t.getAlias() + "^ㅡㅡㅡ^^^^");
			}
			
		});
		
		
		// Consumer 인터페이스를 구현하는 방법 -> 람다식으로 구현 (함수형인터페이스만 가능하다)
		list.forEach((abc) -> {System.out.println(abc.getName() + abc.getAlias() + "람다 람다 ^^");});
		
		// () -> {}
		
		list.forEach( item -> System.out.println(item.getAlias()));
	}

}
