package com.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BElimination {

    public static void main(String[] args) throws IOException {
        int count=0;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        int[] res = new int[testCases];
        String line;
        while(count<testCases && (line=br.readLine())!=null){
            if(count == 1){

            }
            int arr[] = parseLine(line);
            res[count] = findMinVal(arr);
            count++;
        }
        for(int element: res){
            System.out.println(element);
        }
    }
    public static int[] parseLine(String line){
        String arr[] = line.split(" ");
        int arrInt[] = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            arrInt[i] = Integer.parseInt(arr[i]);

        }
        return arrInt;
    }

    public static int findMinVal(int[] arr) {
        if(arr[0]+arr[1]>arr[2]+arr[3]){
            return arr[0]+arr[1];
        }
        else{
            return (arr[2]+arr[3]);
        }
    }
}
