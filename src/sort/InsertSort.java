package sort;

import java.util.Arrays;

public class InsertSort {
    private static int[] array={23,42,6,2,53,7,34,68,93,4,6};

    public static void main(String[] args) {
        System.out.println("排序前数组:"+ Arrays.toString(array));
        sort(array);
        System.out.println("插入排序后的数组:"+Arrays.toString(array));
    }
    public static void sort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (a[j]<a[j-1]){
                    swap(a,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    public static void swap(int[] a,int i,int j){
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
