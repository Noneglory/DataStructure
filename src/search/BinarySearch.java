package search;

import sort.QuickSort;

public class BinarySearch {
	/**
	 * ����arr������ģ���С����
	 * @param arr
	 * @param num Ĭ�ϵ��Ƿ���0��0��ʾû�ҵ�
	 * @return
	 */
	public int search(int[] arr,int num)
	{
		int start=0;
		int end = arr.length-1;
		
		while(start<=end) 
		{
			int middle=(start+end)/2;
			if(arr[middle]>num) 
			{
				end=middle-1;
			}else if(arr[middle]<num)
			{
				start=middle+1;
			}else 
			{
				return middle+1;
			}	
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int arr[] = { 1,2,3,4,5,6 };
		System.out.println(binarySearch.search(arr,4));
		
	}
	
	
	
	}




