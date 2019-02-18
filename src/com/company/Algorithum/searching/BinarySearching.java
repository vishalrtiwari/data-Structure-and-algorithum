package com.company.Algorithum.searching;

public class BinarySearching {
    public static void main(String[] args) {
        int arr[] = {34,55,1,121,5,67,9};
        quicksort(arr,0,6);
        for(int i =0; i < arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        // write your code here
    }


    public  static int partition(int[] arr , int low , int high ){
        int pivot = arr[high];
        int slow = low-1;

        for(int j = low ;j < high; j++ ){
            if (arr[j] <= pivot){
                slow++;
                int temp =arr[j];
                arr[j] = arr[slow];
                arr[slow]= temp;
            }
        }
        int  temp = arr[slow+1];
        arr[slow+1] = arr[high];
        arr[high] = temp;

        return slow+1;
    }
    public static void quicksort(int a[], int l,int h){
        if(l<h) {
            int pi = partition( a,l, h);
            quicksort(a , l,pi-1);
            quicksort(a,pi+1,h);
        }
    }
}
