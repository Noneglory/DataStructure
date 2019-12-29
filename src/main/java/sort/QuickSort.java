package sort;

public class QuickSort {
	/**
	 * ���ڷ��ε�˼�룬 �ȰѴ���key���������ݷ���key���ұ��γ����ݼ�A������С��key�����ݷ���key����߽������ݼ�B�� ��
	 * ����ʱ�临�Ӷ�O(n^2)
	 * ƽ��ʱ�临�Ӷȣ�O(nlog(n))
	 * 
	 * 
	 * ����鲢�����ǵ��͵ķ���˼�룬������8�����ݣ��ֱ��ǰ����ĸ��ͺ���Ľ�������
	 * Ȼ�����������������кϲ�
	 * @param a
	 * @param low
	 * @param high
	 */
	public void quickSort(int[] a, int low, int high) {
		int start = low;
		int end = high;
		int key = a[low];
       
		while (end > start) {
			// �Ӻ���ǰ�Ƚ�
			while (end > start && a[end] >= key) // ���û�бȹؼ�ֵС�ģ��Ƚ���һ����ֱ���бȹؼ�ֵС�Ľ���λ�ã�Ȼ���ִ�ǰ����Ƚ�
				end--;
			if (a[end] <= key) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// ��ǰ����Ƚ�
			while (end > start && a[start] <= key)// ���û�бȹؼ�ֵ��ģ��Ƚ���һ����ֱ���бȹؼ�ֵ��Ľ���λ��
				start++;
			if (a[start] >= key) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// ��ʱ��һ��ѭ���ȽϽ������ؼ�ֵ��λ���Ѿ�ȷ���ˡ���ߵ�ֵ���ȹؼ�ֵС���ұߵ�ֵ���ȹؼ�ֵ�󣬵������ߵ�˳���п����ǲ�һ���ģ���������ĵݹ����
		}
		// �ݹ�
		if (start > low)
			quickSort(a, low, start - 1);// ������С���һ������λ�õ��ؼ�ֵ����-1
		if (end < high)
			quickSort(a, end + 1, high);// �ұ����С��ӹؼ�ֵ����+1�����һ��
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
