package althgorim.maxSubsequnceSum;

/**
 * 很普通的一个解，时间复杂度为O(n^2)
 */
public class CommonSolution {
    public int maxSubsequnceSum(int arr[])
    {
        int thisSum=0,maxSum=0;
        int startposition=0,endposition=0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j<arr.length;j++){
                    thisSum+=arr[j];
                    if(thisSum>maxSum){
                        startposition=i;
                        endposition=j;
                        maxSum = thisSum;
                    }
            }
            thisSum=0;
        }
        System.out.println("从"+(startposition+1)+"到"+(endposition+1));
        return maxSum;
    }

    public static void main(String args[]){
        CommonSolution commonSolution = new CommonSolution();
        int arr[] ={4,-2,5,-4,7,10,4};
        int maxSum = commonSolution.maxSubsequnceSum(arr);
        System.out.println(maxSum);
    }
}
