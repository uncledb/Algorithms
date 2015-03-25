package shellsort;

/**
 * 希尔排序 - 分组的直接插入排序法 选定增量，进行分组排序 实际上并没有真正的分组，而是固定间隔的几个元素 看成是一个组 进行直接插入排序
 * 增量应该按照某种规律来设定 一般有二分的 最后 增量应该为1 时间复杂度 O(n^3/2) 
 * from internet
 * 
 * @author uncle
 * 
 */
public class ShellSort {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// 希尔排序
		int d = a.length;
		while (true) {
			d = d / 2;
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < a.length; i = i + d) {
					int temp = a[i];
					int j;
					for (j = i - d; j >= 0 && a[j] > temp; j = j - d) {
						a[j + d] = a[j];
					}
					a[j + d] = temp;
				}
			}
			if (d == 1) {
				break;
			}
		}
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
