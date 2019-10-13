package sort;

public class InsertSort {
	/**
	 * �¼����Ӷ�O(n^2)
	 * @param arr
	 */
	public  void sort(int[] arr)
	{
	    int i, j;
	    int n = arr.length;
	    int target;
	 
	    //����㷨�����ݹ��ɷ�����
	    //�ٶ���һ��Ԫ�ر��ŵ�����ȷ��λ����
	    //�������������1 - n-1
	    //������n��ʱ���������ǰn-1���Ѿ�ʱ������ˡ�
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
