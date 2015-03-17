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

	private static void insertSort(int[] a) {
		int n = a.length;
		int i, j;
		// i = 1,可以理解为a0默认就在有序序列中了
		for (i = 1; i < n; i++) {
			// a[i] 就是即将要插入的元素 如果这个元素小于a[i-1]，那么不用动了，继续进行下一个元素的插入
			if (a[i] < a[i - 1]) {
				int temp = a[i];
				// 查找a[i] 也就是a[j+1]要插入的位置
				for (j = i - 1; j >= 0 && a[j] > temp; j--) {
					a[j + 1] = a[j];
				}
				// 位置找到 进行插入
				a[j + 1] = temp;
			}
		}
	}

}
