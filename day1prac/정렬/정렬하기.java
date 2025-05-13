package day1prac.정렬;

public class 정렬하기 {

	public static void main(String[] args) {
		
		
		//선택정렬 
		
		
		//int[] arr  = new int[5];
		//int[] arr= { 10,5,7,13,6};
		int[] arr=null;
		arr = new int[] { 10,5,7,13,6};
		
		
		//
		
		for( int i=0   ; i< arr.length -1 ; i++) {   // i:기준
			
			for( int j=i+1 ;  j< arr.length; j++) {  // j:비교대상
				
				if( arr[i] > arr[j]) {
					
					
					//임시변수 필요함 
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;			
					
				}				
			}
		}//for 
		
		
		//정렬후 
		System.out.print( "정렬 후");
		for( int i=0; i< arr.length ; i++) {
			System.out.print( arr[i]  +  "  ");
		}
		
		
	}

}
