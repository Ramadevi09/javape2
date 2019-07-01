package com.stackroute.pe2;

import java.util.Scanner;

public class StudentDetails {
    static int sum=0,i=0;
    static double avg;
//given input marks average
    public static double avarage(int number[]) {
        if (number.length - 1 < 1) {
            return 0;
        } else {
            for (i = 0; i <= number.length - 1; i++) {
                sum = sum + number[i];
            }

            avg = sum / number.length - 1;

            return avg;
        }
    }



//check max marks in given input
    public static int max(int number[]) {
        int max = number[0];
        if (number.length - 1 < 1) {
            return 0;
        } else {
            for (i = 0; i <= number.length - 1; i++) {
                if (number[i] > max) {
                    max = number[i];
                }
            }
            return max;
        }
    }
//check min marks in given input
    public static int min(int number[]) {
        int min = number[0];
        if (number.length - 1 < 1) {
            return 0;
        } else {

            for (i = 0; i <= number.length - 1; i++) {
                if (number[i] < min) {
                    min = number[i];
                }
            }
            return min;
        }
    }

}

