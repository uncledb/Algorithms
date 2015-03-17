package selectionsort;

/**
 * 简单选择排序 选择排序是不稳定的算法 时间复杂度O(n²)
 * 
 * @author uncle
 * 
 */
public class SimpleSeletionSort {
	public int[] array = { 2, 4, 1, 0, 5, 8, 9, 3, 7, 6 };

	public static void main(String[] args) {
		SimpleSeletionSort s = new SimpleSeletionSort();
		s.sort();
	}

	/**
	 * 比较次数和冒泡相同 但是数据交换的次数少 (每次i的循环 都只进行一次数据交换 这一轮找完了 才进行交换操作) 性能上优于冒泡排序法
	 */
	public void sort() {
		int[] a = array.clone();
		int min;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			if (i != min) {
				swap(a, i, min);
			}
		}
		print(a);
	}

	public void print(int[] a) {
		for (int i : a) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

	public void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
