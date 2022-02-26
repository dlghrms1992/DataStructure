package training2;

import java.util.List;

public class MyArrayList<E> implements List<E> {
	int size;  			//요소의 개수 추적
	private E[] array;  //요소저장
	
	public MyArrayList() {
		array = (E[]) new Object[10];
		size=  0;
	}
	
	//요소 추가 메서드
	public boolean add(E element) {
		if(size >= array.length) {
			// 큰 배열을 만들고 요소들을 복사
			E[] bigElem = (E[]) new Object[array.length * 2];
			System.arraycopy(array, 0, bigElem, 0, array.length);
			array = bigElem;
		}
		array[size]= element;
		size++;
		return true;
	}
}
