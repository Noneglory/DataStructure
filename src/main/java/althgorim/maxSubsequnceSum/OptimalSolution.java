package althgorim.maxSubsequnceSum;

/**
 * ������к͵����Ž� ʱ�临�Ӷ� O(n)
 */
public class OptimalSolution {
    public int maxSubsequnceSum(int arr[]) {
        int thisSum=0;
        int maxSum=0;
        for(int i=0;i<arr.length;i++)
        {
            thisSum+=arr[i]; //�����ۼ�
            if(thisSum>maxSum){
                maxSum=thisSum; //���ָ���ĺ�����µ�ǰ���
            }else if(thisSum<0){ //�����ǰ���к�Ϊ��
                thisSum=0; //�򲻿���ʹ����Ĳ��ֺ���������֮
            }
        }
        return maxSum;
    }

}
