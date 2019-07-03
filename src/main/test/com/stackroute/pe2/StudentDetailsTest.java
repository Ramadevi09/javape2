package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

public class StudentDetailsTest {
    StudentDetails studentDetails;
    @Before
    public  void setUp(){
        studentDetails=new StudentDetails();
    }
    @After
    public void tearDown(){
        studentDetails=null;
    }
    @Test

    public void calculateAvgMaxMinOfStudentgrades(){
        double  avarage=StudentDetails.avarage(new int[] {45,78,90,25});
        assertEquals(59.5,avarage,59.5);
        int maximum=StudentDetails.max(new int[] {45,78,90,25});
        assertEquals(90,maximum);
        int minimum=StudentDetails.min(new int[] {45,78,90,25});
        assertEquals(25,minimum);

    }
    @Test

    public void returnZeroIfArrayLengthIsLessthan2(){
        int max=StudentDetails.max(new int[] {1});
        assertEquals(0,max);
        int min=StudentDetails.min(new int[] {1});
        assertEquals(0,min);
        double average=StudentDetails.avarage(new int[] {1});
        assertEquals(0,average,0);


    }



}