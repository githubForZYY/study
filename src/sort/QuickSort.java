package sort;

import java.util.Arrays;
/*
*   快速排序
* */
public class QuickSort {
    private static int[] array={23,42,6,2,53,7,34,68,93,4,6};
    public static void main(String[] args){
        //数组类对象没有重写toString方法，使用Array的toString方法进行将原数组转换成字符串
        String a= Arrays.toString(array);
        System.out.println("排序前的数组："+a);
        //快速排序函数
        quickSort(array,0,array.length-1);
        a=Arrays.toString(array);
        System.out.println("快速排序后的数组："+a);
    }
    //划分函数
    public static int  partition(int[] a,int right,int left){
        int pivot=a[right];
        while(right<left){
            while (right<left&&a[left]>=pivot){
                left--;
            }
            a[right]=a[left];
            while (right<left&&a[right]<=pivot){
                right++;
            }
            a[left]=a[right];
        }
        a[right]=pivot;
        return right;
    }
    //快速排序函数
    public static void quickSort(int[] a,int right,int left){
        if(right>=left){
            return;
        }
        int pivot=partition(a,right,left);
        quickSort(a,right,pivot-1);
        quickSort(a,pivot+1,left);
    }
}
