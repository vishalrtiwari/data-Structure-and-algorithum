package com.company.Algorithum.searching;

public class FindOneDPeekElement {
    public static void main(String[] args) {

    }
    public static int findPeakElement(int[] nums) {
        int peak = peak(nums,0,nums.length-1,nums.length);
        return peak;
    }
    public  static int peak(int arr[], int low, int high, int n)
    {
        int mid =  (high + low)/2;

        if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 ||
                arr[mid+1] <= arr[mid]))
            return mid;

        else if (mid > 0 && arr[mid-1] > arr[mid])

            return peak(arr, low, (mid -1), n);

        else return peak(arr, (mid + 1), high, n);
    }
}
