package sort;

public class QuickSort {
	/**
	 * 基于分治的思想， 先把大于key的所有数据放在key的右边形成数据集A，所有小于key的数据放在key的左边进行数据集B， 再
	 * 最差的时间复杂度O(n^2)
	 * 平均时间复杂度：O(nlog(n))
	 * 
	 * 
	 * 另外归并排序是典型的分治思想，例如有8个数据，分别对前面的四个和后面的进行排序，
	 * 然后对两个有序数组进行合并
	 * @param a
	 * @param low
	 * @param high
	 */
	public void quickSort(int[] a, int low, int high) {
		int start = low;
		int end = high;
		int key = a[low];
       
		while (end > start) {
			// 从后往前比较
			while (end > start && a[end] >= key) // 如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
				end--;
			if (a[end] <= key) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// 从前往后比较
			while (end > start && a[start] <= key)// 如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
				start++;
			if (a[start] >= key) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// 此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
		}
		// 递归
		if (start > low)
			quickSort(a, low, start - 1);// 左边序列。第一个索引位置到关键值索引-1
		if (end < high)
			quickSort(a, end + 1, high);// 右边序列。从关键值索引+1到最后一个
	}

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int arr[] = { 5, 3, 4, 1, 5, 2 };
		quickSort.quickSort(arr, 0, arr.length - 1);
		for (int num : arr) {
			System.out.print(num);
		}
	}

}
