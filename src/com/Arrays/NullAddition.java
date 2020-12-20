package com.Arrays;

public class NullAddition {
    public static void main(String[] args) {
        //arrays are not dynamic. they are static.
        // we cannot increase or decrease its size
        int[] intArray = new int[3];
        intArray[0] = 20;
        intArray[1]  = 35;
        intArray[2] = 15;
        for(int i=0;i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        //arrays are contiguous block of memory
        //all items are stored as contiguous block
        //every element in int array occupies same memory
        //if array starts at x and size of each element is y bytes
        //then we can calculate the address ot ith element
        //using x+i*y
    }
}
