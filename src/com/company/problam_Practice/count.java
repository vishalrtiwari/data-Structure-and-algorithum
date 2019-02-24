package com.company.problam_Practice;

public class count {
    public static int count7(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return count7(n / 10) + 1;
        } else {
            return count7(n / 10) + 0;
        }
    }
    public static void main(String [] args){
        System.out.println(count7(7117));
    }
}
