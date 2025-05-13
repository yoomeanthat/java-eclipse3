package day2.prac.복습실습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Moving정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Moving> list  = new ArrayList<>();
		
		
		list.add( new Moving("장주원",  "구룡포" , 100));
		list.add( new  Moving("이미현" ,"경기" , 80));
		list.add( new Moving("김두식"  ,"문산" , 90));
		list.add( new Moving("전영석",  "봉평" , 88));
		
		
		 //
		
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				
				Moving m1  =  (Moving) o1;
				Moving m2  =  (Moving) o2;
				
				return  m1.power - m2.power;
			}});
		

		 
		
		Collections.sort(list , new Comparator<Moving>() {

			@Override
			public int compare(Moving o1, Moving o2) {
				// TODO Auto-generated method stub
				return  o1.power - o2.power;   // 내림차순으로 하고 싶으면  요소비교를 반대로 함 
			}});
		
		
		
		for( Moving m : list) {
			System.out.println( m);
		}
		
		
		
		// 매서드안에서도 클래스를 작성할 수 있다 . 지역내부클래스 
		
		class A  implements Comparator<Moving>{

			@Override
			public int compare(Moving o1, Moving o2) {
				// TODO Auto-generated method stub
				return  o1.power - o2.power;
			}
			
		}
		 
		
		class B  implements Comparator{
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub				
				//
				Moving m1  = (Moving) o1;
				Moving m2  =  ( Moving) o2;
				
				return m1.alias.compareTo( m2.alias);      // 양수, 음수를 반환  (기준이 뒤에 있으면 양수가 전달됨) 
			}
			
		}
		
		
		
	 	Collections.sort(list, new  B());
		//Collections.sort(list, new  A());
	 	
	 	System.out.println( "alias 기준 ==>");
	 	for( Moving   m :  list) {
	 		
	 		System.out.println( m);
	 	}
		
	 	
	 	
	 	
		
	 	
	 	//
	 	
//	 	Collections.sort(list, new Comparator<Moving>() {});
	 	Collections.sort(list, new Comparator<Moving>() {
	 		@Override
	 		public int compare(Moving o1, Moving o2) {
	 			// TODO Auto-generated method stub
	 			return o1.power - o2.power;
	 		}
	 	});
	 	

	}

}
