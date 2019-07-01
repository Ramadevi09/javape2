package com.stackroute.pe2;

public class Palindrome {
    //find the reverse of given number
    public static String reverse(int num){
        int rem=0,sum=0;
        int temp=num;
        String result="";

            while (num != 0) {
                rem = num % 10;
                sum = sum * 10 + rem;
                num = num / 10;


            }


//check given number is palindrom or not
        if(temp==sum){
            result +="palindrom";
        }
        else{
            result +="not palindrom";

        }

return result.trim();
    }
}
