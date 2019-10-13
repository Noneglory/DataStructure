package sort;

public class InsertSort {
	/**
	 * 事件复杂度O(n^2)
	 * @param arr
	 */
	public  void sort(int[] arr)
	{
	    int i, j;
	    int n = arr.length;
	    int target;
	 
	    //这个算法和数据归纳法很像，
	    //假定第一个元素被放到了正确的位置上
	    //这样，仅需遍历1 - n-1
	    //遍历第n个时，数组里的前n-1个已经时有序的了。
	    for (i = 1; i < n; i++)
	    {
	        j = i;
	        target = arr[i];
	 
	        while (j > 0 && target < arr[j - 1])
	        {
	            arr[j] = arr[j - 1];
	            j--;
	        }
	 
	        arr[j] = target;
	    }
	}

	public static void main(String[] args) {
		InsertSort insertSort = new InsertSort();
		int arr[] = {5,3,4,1,5,2};
		insertSort.sort(arr);
		for(int num:arr)
		{
			System.out.print(num);
		}
	}
	
	
}	
