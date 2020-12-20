package com.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        for(int gap=arr.length/2; gap > 0 ; gap/=2 ){
            for(int i = gap ; i<arr.length ; i++){
                int key = arr[i];
                int j = i;
                while( j>=gap && key < arr[j-gap]){
                        arr[j] = arr[j-gap];
                        j=j-gap;
                }
                arr[j] = key;

            }
        }
        for(int e: arr) System.out.println(e);

    }
}
