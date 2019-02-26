package com.company.problam_Practice;


class count {
    public int countX(String str) {


        if (str == str.substring(0, 0)) {
            return 0;
        } else {
            int n = str.length();

            if (str.charAt(n-1) == 'x') {

                str = str.substring(0,n - 1);

                return countX(str) + 1;
            } else {
                str = str.substring(0,n - 1);

                return countX(str) ;
            }
        }
    }
    public static  void  main(String[] args){
        count obj = new count();
        System.out.println(obj.countX("iiixxxxxxxxxiii"));
    }

}



