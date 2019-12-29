package althgorim.maxSubsequnceSum;


import org.junit.Test;

public class BinaryDivideTest {

    @Test
    public  void testGetMax(){
        BinaryDivide binaryDivide = new BinaryDivide();
        System.out.println(binaryDivide.getMax(5,2,4));
    }
    @Test
    public void testmaxSumBy(){
        BinaryDivide binaryDivide = new BinaryDivide();
        int arr[] = {4,-2,1,4,5,-6,2};
        System.out.println(binaryDivide.maxSumBy(arr,4));
    }

    @Test
    public void testmaxSubsequnceSum(){
        int arr[] ={4,-2,5,-4,7,10,4};
        BinaryDivide binaryDivide = new BinaryDivide();
        int max = binaryDivide.maxSubsequnceSum(arr,0,arr.length-1);
        System.out.println(max);
    }

}
