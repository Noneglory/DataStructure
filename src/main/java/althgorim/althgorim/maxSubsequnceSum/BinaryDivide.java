package althgorim.maxSubsequnceSum;

/**
 * ���ڷ��ε�˼����в�ֺ�,ʱ�临�Ӷ�O(nlogn)
 */
public class BinaryDivide {


    public int maxSubsequnceSum(int arr[],int start,int end){

        if(start==end){return arr[start];}

        int middle =(start+end)/2;
        int num1=0,num2=0,num3=0;
        //ȡ���ߵ����ֵ
        if(middle>start){
             num1=maxSubsequnceSum(arr,start,middle-1);
        }
        //ȡ�Ұ�ߵ����ֵ
        if(middle<end){
             num2 = maxSubsequnceSum(arr,middle+1,end);
        }
        //ȡ��Խ�м�middle�����ֵ
        num3=maxSumBy(arr,middle);
        return  getMax(num1,num2,num3);
    }

    /**
     * ��middle��Ϊ�ָ��ߣ�ȡ��middle��ߺ͵����ֵ��ȡ��middle�ұߺ͵����ֵ����Ϊ��ʼ��Ϊ0��ֻ�е�>0ʱ�Żᷢ���仯����
     * ��ֱ�ӷ������ֵΪarray[middle]+leftmaxSum+rightmaxSum
     * @param arr
     * @param middle
     * @return
     */
    public int maxSumBy(int[] arr, int middle) {
        int maxSum = arr[middle];
        int leftSum =0;
        int leftMaxSum=0;
        int rightSum=0;
        int rightMaxSum =0;
        if(middle==0){
            leftMaxSum=0;
        }else{
            for(int left=middle-1;left>=0;left--){
                leftSum+=arr[left];
                if(leftSum>leftMaxSum){
                    leftMaxSum=leftSum;
                }
            }
        }

        if(middle==arr.length-1){
            rightMaxSum=0;
        }else{
            for(int right=middle+1;right<=arr.length-1;right++){
                rightSum+=arr[right];
                if(rightSum>rightMaxSum){
                    rightMaxSum =rightSum;
                }
            }
        }
        return maxSum+leftMaxSum+rightMaxSum;
    }

    public  int getMax(int num1,int num2,int num3){
         int num4 = num1>num2?num1:num2;
         return  num4>num3?num4:num3;
    }

}
