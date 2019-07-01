package com.stackroute.pe2;

public class Factorial {
//factorial of given long number
   public static String  findFactorialLong( long number) {
       String result;
       long fact = 1;
       for (int i = 1; i <= number; i++) {

           fact = fact * i;

       }

       if(fact < 0)
       {
           return "factorial is out of range";
       }

       result = "factorial is " + fact;

       return result;
   }
   //factorial of integer number
    public static String findFactorialInt( int number1) {
        String result;
        int fact = 1;
        for (int i = 1; i <= number1; i++) {

            fact = fact * i;

        }

        if(fact < 0)
        {
            return "factorial is out of range";
        }

        result = "factorial is " + fact;

        return result;
    }


}


