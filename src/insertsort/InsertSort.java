package insertsort;

/**
 * 插入排序法 - 插入排序是适用于少量数据的排序，稳定的排序
 * 
 * @author uncle
 * 
 */
public class InsertSort {
	static int[] arr = { 2, 4, 7, 5, 2, 9, 0, 6, 8, 1, 3 };

	public static void main(String[] args) {
		insertSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	private static void insertSort(int[] _arr) {
		int[] a = _arr.clone();
		int n = a.length;
		int i, j;
		for (i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {
				int temp = a[i];
				for (j = i - 1; j >= 0 && a[j] > temp; j--) {
					a[j + 1] = a[j];
				}
				a[j + 1] = temp;
			}
		}
		arr = a;
	}

}
