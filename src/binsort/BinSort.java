package binsort;

/**
 * 马桶上学算法一
 * 
 * @author uncle 桶排序 排序的范围有多大，就需要创建一个多大的数组， 数组下标代表的意义就是要排序的数字，
 *         数组的值代表下标对应的数字出现的次数 优点：速度块 时间复杂度小 缺点：需要内存空间大
 */
public class BinSort {
	public int[] array = { 2, 4, 1, 6, 5, 8, 9, 3, 7, 6 };

	public static void main(String[] args) {
		BinSort b = new BinSort();
		b.sort();
	}

	public void sort() {
		int[] a = getBin(array.length);

		for (int i : array) {
			a[i]++;
		}

		for (int j = 0; j < a.length; j++) {
			if (a[j] != 0) {
				print(j, a[j]);
			}
		}

	}

	private void print(int number, int times) {
		for (int i = 0; i < times; i++) {
			System.out.print(number + ",");
		}
	}

	public int[] getBin(int lengh) {
		int[] a = new int[lengh];
		return a;
	}
}
