package com.stackroute.pe2;

import com.stackroute.EmployeeDetails;

public class RetrivingDetails {
        public static String details(){

            EmployeeDetails d=new EmployeeDetails();
            String result=d.name+""+d.age+""+d.sal;
            return result;


        }
    }

