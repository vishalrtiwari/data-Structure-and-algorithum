package com.company.problam_Practice;

class ChangeXY {
    public static String countX(String str) {


        if (str.isEmpty() == true) {
            return "";
        }

        if (str.charAt(0) == 'x') {

            return 'y' + countX(str.substring(1));
        } else


            return str.charAt(0) + countX(str.substring(1));


    }

    public static void main(String[] args) {
        count obj = new count();
        System.out.println(obj.countX("xxcode"));


    }
}