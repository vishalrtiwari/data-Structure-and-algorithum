package com.company.Algorithum.sorting;

public class Insertionsort {
    public static void main(String[] args) {

        int arr [] ={2,4,12,1,45,5,67,8,65,9};
        insertionsort(arr,0,arr.length);
        for(int i =0 ; i<arr.length; i++){
            System.out.println(arr[i] );

        }
    }


    public static void insertionsort(int arr[] , int low ,int high ){
        for(int i = 0; i <=  arr.length-1; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = key;

        }


    }
}
