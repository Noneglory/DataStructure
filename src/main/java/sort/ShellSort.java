package sort;

import java.util.Arrays;

/**
 * describe:Ï£¶ûÅÅĞò
 * ²Î¿¼£ºhttps://www.cnblogs.com/chengxiao/p/6104371.html
 *
 * @author leijiang
 * @date 2021/12/20
 */
public class ShellSort {

    public static void sort(int arr[]){
        int length=arr.length;
        for(int gap=length/2;gap>0;gap=gap/2){
            for(int i=gap;i<length;i++){
                int j=i;
                while(j-gap>=0 && arr[j-gap]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-gap];
                    arr[j-gap]=temp;
                    j=j-gap;
                }
            }
        }
    }


    public static void main(String args[]){
        int []arr ={1,4,2,7,9,8,3,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
