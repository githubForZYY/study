package sort;

import java.util.Arrays;

public class CountSort {
    private static int[] array={23,42,6,2,53,7,34,68,93,4,6};
    public static void main(String[] args){
        System.out.println("计数排序前的数组"+Arrays.toString(array));
        countSort(array);
        System.out.println("计数排序后的数组"+Arrays.toString(array));
    }
    //计数排序函数
    public static void countSort(int[] array){
        int max=array[0];
        int min=array[0];
        //找出数组中的最大最小值
        for (int i = 1; i < array.length; i++) {
            max=max<array[i]?array[i]:max;
            min=array[i]<min?array[i]:min;
        }//根据最大最小值的差值构造计数数组
        int[] count=new int[max-min+1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]-min]++;
        }
        int j=0;
        //根据计数数组重新给原数组赋值
        for (int i = 0; i < count.length; i++) {
            while(count[i]!=0){
                array[j++]=min+i;
                count[i]--;
            }
        }
    }
}
