package com.company.data_Structure;

public class BuildMaxHeap {
    public static void main(String args[]){
        int arr[] = {12,123,10,133,16,14,25};
        heaparrangement(arr);
        for(int i =0 ; i <arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    //function that call heapify that are used by all operation
    public static void  max_heapify(int arr[],int index ){
        int leftchild = 2*index;
        int rightchild = 2*index+1;
        int larger = 0;

        if(leftchild < arr.length && arr[leftchild]>arr[index]){
            larger = leftchild;
        }
        else{
            larger = index;

        }
        if(rightchild < arr.length && arr[larger]<arr[rightchild]){
            larger = rightchild;
        }
        if(larger != index){
            int temp = arr[larger];
            arr[larger] = arr[index];
            arr[index]  = temp;
            max_heapify(arr,larger);
        }
        else {
            return;
        }
    }
    public static void heaparrangement(int arr[]){
        int length = arr.length;
        for(int i = length/2-1; i>=0;i--){
            max_heapify(arr,i);
        }

    }
}
