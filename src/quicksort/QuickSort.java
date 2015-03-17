package quicksort;

/**
 * 快速排序法 目前最优的排序算法 O(nlogn)
 * 
 * @author uncle
 * 
 */
public class QuickSort {
	static int a[] = { 2, 4, 7, 5, 2, 9, 0, 6, 8, 1, 3 };
	int n;// 定义全局变量，这两个变量需要在子函数中使用

	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		q.quicksort(0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void quicksort(int left, int right) {
		int i, j, t, temp;
		if (left > right)
			return;

		temp = a[left]; // temp中存的就是基准数
		i = left;
		j = right;
		while (i != j) {
			// 顺序很重要，要先从右边开始找
			while (a[j] >= temp && i < j)
				j--;
			// 再找右边的
			while (a[i] <= temp && i < j)
				i++;
			// 交换两个数在数组中的位置
			if (i < j) {
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		// 最终将基准数归位
		a[left] = a[i];
		a[i] = temp;

		quicksort(left, i - 1);// 继续处理左边的，这里是一个递归的过程
		quicksort(i + 1, right);// 继续处理右边的 ，这里是一个递归的过程
	}
}
