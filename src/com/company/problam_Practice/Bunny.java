package com.company.problam_Practice;

public class Bunny {
    public static int Bunnyear(int n) {
        if (n < 1) {
            return -1;
        }
        if(n == 1){
            return 2;

        }
        else{
            return Bunnyear(n-1) + 2;
        }
    }
    public static void main(String [] args){
        Bunny obj = new Bunny();
        System.out.println( obj . Bunnyear(6));
    }
}
