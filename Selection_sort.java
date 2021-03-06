package com.SelectionSort;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
          int[] arr={3,-2,1,5,8};
          Selection_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection_Sort(int[] arr)
    {
        for(int i=0;i< arr.length; i++)
        {
            //find the maximum item in the remaining array and swap with correct index
            int last=arr.length - i -1;
            int maxIndex= getMaxindex(arr,0,last);
            swap(arr,maxIndex,last);

        }
    }

    private static int getMaxindex(int[] arr, int start, int end) {
        int max=start;

        for (int i=0;i <= end; i++){
            if(arr[max] < arr[i])
            {
                max=i;
            }
        }
        return max;
    }

    static  void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }
}
