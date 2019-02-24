package com.company.problam_Practice;

 class Main {
     public static  int traingle(int n)
     {
         if(n<1){
             return 0;
         }

         else {
             return  traingle(n-1) + n;
         }
     }

     public static void main(String [] args){
         System.out.println(traingle(4));
     }
}
