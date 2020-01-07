package althgorim.maxSubsequnceSum;

/**
 * 最大子列和的最优解 时间复杂度 O(n)
 */
public class OptimalSolution {
    public int maxSubsequnceSum(int arr[]) {
        int thisSum=0;
        int maxSum=0;
        for(int i=0;i<arr.length;i++)
        {
            thisSum+=arr[i]; //向右累加
            if(thisSum>maxSum){
                maxSum=thisSum; //发现更大的和则更新当前结果
            }else if(thisSum<0){ //如果当前子列和为负
                thisSum=0; //则不可能使后面的部分和增大，抛弃之
            }
        }
        return maxSum;
    }

}
