package com.company.Algorithum.searching;

public class BinarySearch {


    public static void main(String[] args) {
        // write your code here
        binarysearch obj  = new binarysearch();
        int array[] = {1,2,3,4,5,6,7,8,9,};
        int max = array.length;
        int item = 0;
        int i =  obj.binary(array,item ,max,0);
        if(i == -1){
            System.out.println("element not find");

        }
        else{
            System.out.println("element find");
        }
    }
}
class binarysearch {
    public  int binary(int array[] ,int item , int max , int min ){
        while(max > min) {
            int middle = (max + min) / 2;
            if (array[middle] == item) {
                return middle;
            }
            if (array[middle] > item) {
                max = middle - 1;
                return binary(array, item, max, min);
            }
            if (array[middle] < item) {
                min = middle + 1;
                return binary(array, item, max, min);
            }
        }
        return -1;

    }
}
