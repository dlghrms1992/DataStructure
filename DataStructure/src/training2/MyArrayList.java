package training2;

import java.util.List;

public class MyArrayList<E> implements List<E> {
	int size;  			//����� ���� ����
	private E[] array;  //�������
	
	public MyArrayList() {
		array = (E[]) new Object[10];
		size=  0;
	}
	
	//��� �߰� �޼���
	public boolean add(E element) {
		if(size >= array.length) {
			// ū �迭�� ����� ��ҵ��� ����
			E[] bigElem = (E[]) new Object[array.length * 2];
			System.arraycopy(array, 0, bigElem, 0, array.length);
			array = bigElem;
		}
		array[size]= element;
		size++;
		return true;
	}
}
