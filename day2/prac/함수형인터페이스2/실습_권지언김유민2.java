package day2.prac.함수형인터페이스2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 실습_권지언김유민2 {

	public static void main(String[] args) {

		//
		Runnable r = () -> {

			System.out.println("오늘의 날짜 찾기입니다");
		};
		
		r.run();

		//
		Consumer<String> c = (month) -> {
			System.out.println(month + "스케줄입니다");
		};

		c.accept("4월 ");

		//
		Consumer<Integer> c1 = (week) -> {
			System.out.println("이번주는 4월의 "+ week + "번째 주 입니다");
		};

		c1.accept(4);

		ArrayList<String> details = new ArrayList<>();
		details.add("4월21일");
		details.add("4월22일");
		details.add("4월23일");
		details.add("4월24일");
		details.add("4월25일");
		details.add("4월26일");
		details.add("4월27일");
		

		details.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {

				System.out.println(s + "이 이번주에 있습니다");

			}

		});

		Supplier<String> s = () -> {

			System.out.println("오늘은 ");

			return "4월25일";
		};

		String date = s.get();
		System.out.println(date);

		//
		Predicate<String> p = (schedule) -> {

			if (schedule.equals(date)) {
				return true;
			}
			return false;
		};
		
		
		boolean judgeDate = p.test("4월25일");
		if(judgeDate == true) {
			System.out.println("오늘이 맞아요!!");
		}else {
			System.out.println("타임머신을 타고 오셨군요");
		}

	}

}
