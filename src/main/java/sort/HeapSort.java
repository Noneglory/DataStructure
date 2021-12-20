package sort;

/**
 * describe:������
 * ���Ǿ����������ʵ���ȫ��������ÿ������ֵ�����ڻ���������Һ��ӽ���ֵ����Ϊ�󶥶ѣ�
 * ����ÿ������ֵ��С�ڻ���������Һ��ӽ���ֵ����ΪС����
 *
 * �󶥶ѣ�arr[i] >= arr[2i+1] && arr[i] >= arr[2i+2]
 * С���ѣ�arr[i] <= arr[2i+1] && arr[i] <= arr[2i+2]
 *
 * ˼·��
 * a.���������й�����һ���ѣ���������������ѡ��󶥶ѻ�С����;
 * b.���Ѷ�Ԫ����ĩβԪ�ؽ����������Ԫ��"��"������ĩ��;
 *c.���µ����ṹ��ʹ������Ѷ��壬Ȼ����������Ѷ�Ԫ���뵱ǰĩβԪ�أ�����ִ�е���+�������裬ֱ��������������
 *
 * ���ϣ�https://www.cnblogs.com/chengxiao/p/6129630.html
 * @author leijiang
 * @date 2021/12/20
 */

import java.util.Arrays;

public class HeapSort {
    public static void main(String []args){
        int []arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr){
        //1.�����󶥶�
        for(int i=arr.length/2-1;i>=0;i--){
            //�ӵ�һ����Ҷ�ӽ��������ϣ�������������ṹ
            adjustHeap(arr,i,arr.length);
        }
        //2.�����ѽṹ+�����Ѷ�Ԫ����ĩβԪ��
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//���Ѷ�Ԫ����ĩβԪ�ؽ��н���
            adjustHeap(arr,0,j);//���¶Զѽ��е���
        }

    }

    /**
     * �����󶥶ѣ����ǵ������̣������ڴ󶥶��ѹ����Ļ����ϣ�
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];//��ȡ����ǰԪ��i
        for(int k=i*2+1;k<length;k=k*2+1){//��i�������ӽ�㿪ʼ��Ҳ����2i+1����ʼ
            if(k+1<length && arr[k]<arr[k+1]){//������ӽ��С�����ӽ�㣬kָ�����ӽ��
                k++;
            }
            if(arr[k] >temp){//����ӽڵ���ڸ��ڵ㣬���ӽڵ�ֵ�������ڵ㣨���ý��н�����
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;//��tempֵ�ŵ����յ�λ��
    }

    /**
     * ����Ԫ��
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}