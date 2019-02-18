package com.company.Algorithum.searching;

public class LinearSearch {
    public void  linersearch(int array[] , int item){
        int flag = 0;
        int n = array.length;
        while(flag == 0 && n > 0){
            if(array[n-1] == item){
                flag = 1;
                System.out.println("element find");

            }
            System.out.println(array[n-1]);
            n--;
        }
        if(flag == 0){
            System.out.println("element not find");
        }
    }

}
