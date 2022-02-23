package selectSort;

public class SelectSort {
	
	public static void swapElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;	
	}
	
	/*
	 * start�κ��� �����ϴ� �ּڰ��� ��ġ�� ã�� �迭�� ������ ��ġ�� ����
	 */
	public static int indexLoewst(int[] array, int start) {
		
		int lowIndex = start;
		for(int i = start ; i < array.length ; i++) {
			if(array[i] < array[lowIndex]) {
				lowIndex = i;
			}
		}
		
		return lowIndex;
	}
	
	/*
	 * ���� ������ ����Ͽ� ��� ����
	 */
	public static void slectionSort(int[] array) {
		for(int i = 0 ; i < array.length ; i++) {
			int j = indexLoewst(array, i);
			swapElements(array, i, j);
		}
		
	}
}
