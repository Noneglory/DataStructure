package search;

import sort.QuickSort;

public class BinarySearch {
	/**
	 * 假设arr是有序的，从小到大
	 * @param arr
	 * @param num 默认的是返回0，0表示没找到
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




