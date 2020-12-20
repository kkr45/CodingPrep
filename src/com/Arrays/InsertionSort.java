package com.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {20,35,35,7,55,1,-22};
        int res[] = insertionSort(arr);
        for(int e: res){
            System.out.println(e);
        }
    }
    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            int key = arr[i+1];
            int j = i+1;
            while( j != 0 && key < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
        return arr;
    }
}
