package day1prac.정렬;

public class MyArrays {
	
	
	
	//
	public static void sort( Object[] arr  , MyComparator  c) {		
		
		//선택 
		
		for( int i=0; i< arr.length-1 ; i++) {
			
			//
			for( int j=i+1; j< arr.length ; j++) {
				
				
				 if(  c.compare( arr[i], arr[j])   >0) {   //양수이면  두 개 자리를 교환한다 
					 Object temp;
					 temp =arr[i];
					 arr[i] = arr[j];
					 arr[j]= temp;					 
				 }
			}
			
		}
	}
	
	
	
	// MyComparable
	public static  void sort( Object[] arr ) {
		
		
		// 정렬하기
		
		for( int i=0; i< arr.length-1 ; i++) {   // i
			
			//
			for( int j= i+1 ; j< arr.length; j++) {  //j
				
				//if(  )
				
			  MyComparable obj  = (MyComparable) arr[i];	 // 
			  
			  if( obj.compareTo(arr[j])  > 0) {
				  
				  // 두 개 요소 교환 
				  
				  Object temp;
				  temp= arr[i];
				  arr[i] =arr[j];
				  arr[j]= temp;
				  
				  
			  } 
				 
				
			}
				
		}
		
		
	}

}
