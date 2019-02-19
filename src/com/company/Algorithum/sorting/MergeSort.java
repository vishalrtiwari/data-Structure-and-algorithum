package com.company.Algorithum.sorting;

class Main {
    public static void main(String[] args) {

        int arr[] = {9,8,7,6,5,4,3,2,1};
        divide(arr,0,arr.length-1);
        for(int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void divide(int arr[],int low ,int heightofArray) {
        if (low < heightofArray) {
            int mid = (low + heightofArray) / 2;
            divide(arr, low, mid);
            divide(arr, mid + 1, heightofArray);
            merge(arr, low, mid, heightofArray);
        }
    }
    public static void merge(int[] arr,int low ,int mid ,int heightofarray) {
        int n1 = mid - low + 1;
        int n2 = heightofarray - mid;
        int L[] = new int [n1];
        int R[] = new int [n2];
        for (int i=0; i<n1; ++i){
            L[i] = arr[low + i];
        }
        for (int j=0; j<n2; ++j){
            R[j] = arr[mid + 1+ j];
        }
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
