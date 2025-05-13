package day2.prac.함수형인터페이스2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 실습_김유민 {

	public static void main(String[] args) {

		//
		Runnable r = () -> {

			System.out.println("🏃‍♂️🏃‍♂️수업 째끼고🏃‍♂️🏃‍♂️ 집으로 도망🏃‍♂️🏃‍♂️가기~~🏃‍♂️🏃‍♂️");
		};

		r.run();
		
		
		
		//
		Consumer<Integer> c1 = (money)-> {
			System.out.println(money + "원 부대찌개 먹는데 다 썼음");
		};
		
		c1.accept(30000);
		
		System.out.println("==저녁은 집에서 만들어 먹어요==");
		//
		Consumer<String> c2 = (food)->{
			
			System.out.println(food+ "먹어요");
		};
		
		c2.accept("부대찌개 ");
		
		
		ArrayList<String> materials = new ArrayList<>();
		materials.add("잰슨빌 소세지");
		materials.add("스팸");
		materials.add("양파");
		materials.add("대파");
		materials.add("마늘");
		materials.add("고춧가루");
		
		materials.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {

				System.out.println(t + "(이)가 들어가요");

			}
		});
		
		
		//
		Supplier<String> s = ()->{
			
			System.out.println("오늘은 내가 요리사~ 오늘 만들 저녁은 ");
			
			return "부대찌개";
		};
		
		String dinner = s.get();
		System.out.println(dinner);
		
		
		//
		Predicate<String> p = (str)->{
			
			if(str.equals(dinner)) {
				return true;
			}else {
				return false;
			}
			
		};
		
		
		boolean judgeDinner = p.test("부대찌개");
		if(judgeDinner == true) {
			System.out.println("저녁메뉴가 맞아요");
		}else {
			System.out.println("저녁 안먹을래요");
		}
		

	}

}
