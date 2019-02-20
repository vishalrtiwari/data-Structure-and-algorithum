package com.company.data_Structure;

public class HeapSort {
    public static void main(String args[]){
        int arr[] = {4,10,3,5,1};
        heaparrangement(arr);
        for(int i =0 ; i <arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    //function that call heapify that are used by all operation
    public static void  max_heapify(int arr[],int length,int index ){
        int leftchild = 2*index+1;
        int rightchild = 2*index+2;
        int large= 0;
        if(leftchild < length && arr[leftchild]>arr[index]){
            large = leftchild;
        }
        else{
            large= index;

        }
        if(rightchild < length &&  arr[rightchild] >arr[large]){
            large = rightchild;
        }
        if(large != index){
            int temp = arr[large];
            arr[large] = arr[index];
            arr[index]  = temp;
            max_heapify(arr,length,large);
        }
        else {
            return;
        }
    }
    public static void heaparrangement(int arr[]){
        int length = arr.length;
        for(int i = length/2-1; i>=0;i--){
            max_heapify(arr,length,i);
        }
        for (int i=length-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            max_heapify(arr, i, 0);
        }


    }

}
