package sort;

public class Bubblesort {
	/**
	 * �¼����Ӷ�O(n^2)
	 * @param arr
	 */
		public void sort(int arr[])
		{
			//����n��ȡ���ֵ�����ұ�
			for(int i=0;i<arr.length-1;i++)
			{
				//�ڲ����ȡ����õ�һ��ֵ�������ұ�
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
		 * �����Ż�
		 * @param args
		 */
		
		public void sort2(int arr[])
		{
			for(int i=0;i<arr.length-1;i++)
			{
				//����ط���Ϊ�Ѿ�ȷ�����ߵ����������ˣ��Ϳ��Բ��ٱȽ����ǣ�ֻ��Ƚ������ġ�
				//��һ��ѭ��������ȷ���ұߵ�����һ���� ����ʱi=1
				//�ڶ���ѭ��������ȷ���ұߵ����ڶ���������ʱi=2
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

		//���㷨��������ʱ�临�Ӷ�ΪO(n)
		public void bubbleSort(int arr[]) {
			boolean didSwap;
			for(int i = 0, len = arr.length; i < len - 1; i++) {
				didSwap = false;
				for(int j = 0; j < len - i - 1; j++) {
					if(arr[j + 1] < arr[j]) {
						int temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
						didSwap = true;
					}
				}
				if(didSwap == false)
					return;
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
