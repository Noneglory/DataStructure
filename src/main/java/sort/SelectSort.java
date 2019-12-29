package sort;

public class SelectSort {
	public void sort(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			int minindex=i;
			int minValue=arr[i];
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]<minValue) {
					minValue=arr[j];
					minindex=j;
				}
			}
			
			int temp =arr[i];
			arr[i]=minValue;
			arr[minindex]=temp;	
		}
	}
	
	public void sort2(int arr[]) {
		for(int  i = 0; i < arr.length - 1; i++) {
			// 记录最小值的下标
			int iMinK = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[iMinK] > arr[j]) {
					iMinK = j;
				}
			}
			// 交换数据
			if(iMinK != i) {
				int temp = arr[i];
				arr[i] = arr[iMinK];
				arr[iMinK] = temp;
			}
		}
	}

	public static void main(String[] args) {
		SelectSort selectSort = new SelectSort();
		int arr[] = {5,3,4,1,5,2};
		selectSort.sort2(arr);
		for(int num:arr)
		{
			System.out.print(num);
		}
	}
	
	
}
