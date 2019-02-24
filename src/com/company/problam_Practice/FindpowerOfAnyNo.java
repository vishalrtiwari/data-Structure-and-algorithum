package com.company.problam_Practice;

public class FindpowerOfAnyNo {
    public static int powerN(int base,int n) {
        if (n == 0) {
            return 1;
        } else {
            return powerN(base, n - 1) * base;

        }
    }
    public static void main(String [] args){
        System.out.println(powerN(3,3));
    }
}
