package com.company.Algorithum.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,655,7,65,45,356,77765,656,5765,65576,56545,6,1,0,6445554,43} ;
        selectionsort(arr);
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionsort(int arr[]){
        for(int i = 0; i<arr.length;i++){
            int imin = i;
            for(int j = i; j<arr.length;j++){
                if (arr[imin] >= arr[j]){
                    imin = j;
                }

            }
            int temp = arr[i];
            arr[i]= arr[imin];
            arr[imin] = temp;

        }
    }

}
