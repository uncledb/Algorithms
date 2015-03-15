package bubblesort;

/**
 * 冒泡排序法 ：两两进行比较，如果满足条件，互换位置
 * 
 * @author uncle
 * 
 */
public class BubbleSort {
	public int[] array = { 2, 4, 1, 0, 5, 8, 9, 3, 7, 6 };

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		b.sort0();
		b.sort1();
	}

	/**
	 * 拿出某个元素和其他元素比较
	 */
	public void sort0() {
		int[] arr = array.clone();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		print(arr);

	}

	/**
	 * 正宗冒泡：两两比较 每次确定一个数
	 */
	public void sort1() {
		int[] arr = array.clone();
		for (int i = 1; i < arr.length; i++) {// 这里的i只是一个计数器
			for (int j = arr.length - 1; j >= i; j--) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
			}
		}
		print(arr);
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
