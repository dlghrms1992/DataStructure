package selectSort;

public class SelectSort {
	
	public static void swapElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;	
	}
	
	/*
	 * start로부터 시작하는 최솟값의 위치를 찾고 배열의 마지막 위치로 변경
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
	 * 선택 정렬을 사용하여 요소 정렬
	 */
	public static void slectionSort(int[] array) {
		for(int i = 0 ; i < array.length ; i++) {
			int j = indexLoewst(array, i);
			swapElements(array, i, j);
		}
		
	}
}
