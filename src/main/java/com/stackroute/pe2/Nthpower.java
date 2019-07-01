package com.stackroute.pe2;

public class Nthpower {
    //check the given input number is power of 4 or not
    public static String isPowerOfFour(int n)
    {
        String result="";
        //check given number  is 0
        if(n == 0) {
result +="number should not be zero";
            return result;
        }
        while(n != 1)
        {
            if(n % 4 != 0){
                result +="not power of 4";
                return result;
            }

            n = n / 4;
        }
        result +="num is power of 4";
        return result;
    }






}
