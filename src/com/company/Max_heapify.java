package com.company;

public class Max_heapify {

    public static void main(String[] args) {

    }
    //function that call heapify that are used by all operation
    public static void max_heapify(int arr[],int index ){
        int leftchild = 2*index;
        int rightchild = 2*index+1;
        int larger = 0;
        if(leftchild <= arr.length && arr[leftchild]>arr[index]){
            larger = leftchild;
        }
        else{
            larger = index;

        }
        if(rightchild <= arr.length && arr[larger]<arr[rightchild]){
            larger = rightchild;
        }
        if(larger != index){
            int temp = arr[larger];
            arr[larger] = arr[index];
            arr[index]  = temp;
        }
        max_heapify(arr,larger);
    }
}
