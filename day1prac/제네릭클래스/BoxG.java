package day1prac.제네릭클래스;

public class BoxG<T> {

	
	T item;

	
	
	//넣기
	public void setItem(T item) {
		this.item = item;
	}
	
	
	
	//꺼내기
	public T getItem() {
		return item;
	}
	
	
}
