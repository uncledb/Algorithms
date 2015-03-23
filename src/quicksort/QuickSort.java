package quicksort;

import java.util.Stack;

/**
 * 快速排序法 目前最优的排序算法 O(nlogn) 在数据里大的时候优势明显
 * 
 * @author uncle
 * 
 */
public class QuickSort {
	static int a[] = { 2, 4, 7, 5, 9, 0, 6, 8, 1, 3, 256, 67, 88, 12 };

	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		// q.quicksort(0, a.length-1);
		q.quickSort2(a, 0, a.length - 1);// 元素不能重复？
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	/**
	 * 递归的快速排序
	 * 
	 * @param left
	 * @param right
	 */
	public void quicksort(int left, int right) {
		int i, j, t, temp;
		if (left > right)
			return;

		temp = a[left]; // temp中存的就是基准数
		i = left;
		j = right;
		while (i != j) {
			// 顺序很重要，要先从右边开始找
			while (a[j] >= temp && i < j) {
				j--;
			}
			// 再找右边的
			while (a[i] <= temp && i < j) {
				i++;
			}
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

	/**
	 * 非递归
	 */
	public int partion(int[] root, int low, int high) {
		int part = root[low];
		while (low < high) {
			while (low < high && root[high] > part) {
				high--;
			}
			root[low] = root[high];
			while (low < high && root[low] < part) {
				low++;
			}
			root[high] = root[low];
		}
		root[low] = part;
		return low;
	}

	public void quickSort2(int[] root, int low, int high) {
		Stack<Integer> st = new Stack<Integer>();
		int k;
		if (low < high) {
			st.push(low);
			st.push(high);
			while (!st.empty()) {
				int j = st.peek();
				st.pop();
				int i = st.peek();
				st.pop();
				k = partion(root, i, j);

				if (i < k - 1) {
					st.push(i);
					st.push(k - 1);
				}
				if (k + 1 < j) {
					st.push(k + 1);
					st.push(j);
				}
			}

		}

	}
}
