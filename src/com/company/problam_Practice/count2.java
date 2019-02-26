package com.company.problam_Practice;

public class count2 {
    public int countHi(String str) {


        if(str.isEmpty() == true){
            return 0;
        }

        if (str.length() > 1) {
            if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {


                return countHi(str.substring(1)) + 1;
            }
        }


        return countHi(str.substring(1)) + 0;




    }
    public static void main(String[]args)
    {
        count2 obj =new count2();
        System.out.println(obj.countHi("hihihihihihihihihihihh"));
    }

}
