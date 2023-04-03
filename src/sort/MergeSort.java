package sort;

import java.util.Arrays;

public class MergeSort {
    private static int[] array={23,42,6,2,53,7,34,68,93,4,6};
    public static void main(String[] args){
        System.out.println("归并排序前的数组："+ Arrays.toString(array));
        mergerSort(array);
        System.out.println("归并排序后的数组："+ Arrays.toString(array));
    }
    public static void  mergerSort(int[] a){
        int[] temp=new int[a.length];
        intelnalMergeSort(a,temp,0,a.length-1);
    }
    public static void intelnalMergeSort(int[] a,int[] temp,int left,int right) {
        if (left < right) {
            int mid=(left+right)/2;
            intelnalMergeSort(a,temp,left,mid);
            intelnalMergeSort(a,temp,mid+1,right);
            mergerSortedArray(a,temp,left,mid,right);
        }
    }
    public static void  mergerSortedArray(int a[],int[] temp,int left,int mid, int right){
        int i=left;
        int j=mid+1;
        int k=0;
        while (i <= mid && j <= right) {
            temp[k++]=a[i]<=a[j]?a[i++]:a[j++];
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while (j <= right) {
            temp[k++]=a[j++];
        }
        for (i = 0; i < k; i++) {
            a[left+i]=temp[i];
        }
    }
}
