package com.company;

/**
 * Created by zeeshanhanif-pc on 5/7/2017.
 */
public class MyArray {
    private int[] arr;
    private int count;
    public MyArray()
    {
        this.arr = new int[5];
    }

    public void add(int item){
        if(arr.length == count){
            int newArr[] = new int[arr.length*2];
            for(int i=0;i<arr.length;i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[count]= item;
        count++;
    }
}
