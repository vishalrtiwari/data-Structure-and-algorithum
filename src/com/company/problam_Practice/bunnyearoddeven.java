package com.company.problam_Practice;

 class bunnyearoddeven{

        public static int Bunnyear(int n) {
            if (n < 1) {
                return -1;
            }
            if(n == 1){
                return 1;

            }
           if(n%2 == 0){
                return Bunnyear(n-1) + 2;
            }
            else{
                return Bunnyear(n-1) +1;
           }
        }
        public static void main(String [] args){

            System.out.println(  Bunnyear(6));
        }
    }


