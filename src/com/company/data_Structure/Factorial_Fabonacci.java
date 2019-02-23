package com.company.data_Structure;

 class Factorial_Fabonacci {
     public int factorial(int n){
         if(n == 1 ){
             return 1;
         }
         else{
             return    factorial(n-1)*n;
         }
     }
     public int fab(int n){
         if(n<1){
             return -1;

         }
         if(n == 1 || n == 2){
             return 1;
         }
         else {
             return    fab(n-1) + fab(n-2);
         }
     }

}
 class Main{
    public static void main(String []args){
        Factorial_Fabonacci obj = new Factorial_Fabonacci();
        System.out.println(obj.factorial(5));
       System.out.println( obj.fab(4));
    }
}
//it runing time for 10 input for factorial is 1.168sec
//and  larger input value is not runing beacause it output value is larger than INTERGER.MAX