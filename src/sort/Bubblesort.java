package sort;

public class Bubblesort {
	/**
	 * 事件复杂读O(n^2)
	 * @param arr
	 */
		public void sort(int arr[])
		{
			//进行n次取最大值放在右边
			for(int i=0;i<arr.length-1;i++)
			{
				//内层进行取出最好的一个值来放在右边
				for(int j=0;j<arr.length-1;j++)
				{
					if(arr[j]>arr[j+1]) {
						int temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		
		/**
		 * 方法优化
		 * @param args
		 */
		
		public void sort2(int arr[])
		{
			for(int i=0;i<arr.length-1;i++)
			{
				//这个地方因为已经确定最后边的数是最大的了，就可以不再比较他们，只需比较其他的。
				//第一次循环结束后确定右边倒数第一个数 ，此时i=1
				//第二次循环结束后确定右边倒数第二个数，此时i=2
				for(int j =0;j<arr.length-i-1;j++)
				{
					if(arr[j]>arr[j+1]) {
						int temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		
		public static void main(String[] args) {
			Bubblesort butoBubblesort = new Bubblesort();
			int arr[] = {5,3,4,1,5,2};
			butoBubblesort.sort2(arr);
			for(int num:arr)
			{
				System.out.print(num);
			}
		}
}
