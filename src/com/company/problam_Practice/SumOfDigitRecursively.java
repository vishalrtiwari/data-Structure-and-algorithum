package com.company.problam_Practice;

public class SumOfDigitRecursively {
    public static int Sunofdigit(int n) {
        if (n == 0) {
            return 0;
        } else {
            return Sunofdigit(n / 10) + n % 10;
        }
    }
    public static void main(String [] args){
        System.out.println(Sunofdigit(129));
    }


}



//only function of sum of digit