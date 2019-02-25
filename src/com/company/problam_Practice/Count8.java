package com.company.problam_Practice;

public class Count8 {
    public static int Count(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 8) {
            if ((n / 10) % 10 == 8) {
                return Count(n / 10) + 2;
            } else {
                return Count(n / 10) + 1;
            }
        } else {
            return Count(n / 10);
        }
    }
    public static void main(String [] args){
        System.out.println(Count(881188));
    }
}
