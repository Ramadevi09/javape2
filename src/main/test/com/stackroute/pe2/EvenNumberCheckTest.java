package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCheckTest
{
    EvenNumberCheck evenNumberCheck;

        @Before
        public  void setUp(){
            System.out.println("Before");
            evenNumberCheck=new EvenNumberCheck();
        }
        @After
        public void tearDown(){
            System.out.println("After");
            evenNumberCheck=null;
        }

        @Test
        public void givenInputIsEvenAndPrintTrue(){
            Boolean result=EvenNumberCheck.isEven(24);
            assertEquals(true,result);
        }
    @Test
    public void givenInputIsOddAndPrintFlase(){
        Boolean result=EvenNumberCheck.isEven(23);
        assertEquals(false,result);
    }
    @Test
    public void givenInputIsNullAndPrintErrorMsg(){
        Boolean result=EvenNumberCheck.isEven(-1);
        assertEquals(false,result);
    }


}