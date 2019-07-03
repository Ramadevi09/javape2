package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthpowerTest {
    Nthpower nthpower;
    @Before
    public  void setUp(){
        nthpower=new Nthpower();
    }
    @After
    public void tearDown(){
        nthpower=null;
    }
    @Test
    public void checkGivenInputIsPowerOf4(){
        String result=Nthpower.isPowerOfFour(64);
        assertEquals("num is power of 4",result);
    }
    @Test
    public void checkGivenInputIsNotPowerOf4PrintErrorMsg(){
        String result=Nthpower.isPowerOfFour(65);
        assertEquals("not power of 4",result);
    }
    @Test
    public void checkGivenInputIsZeroPrintErrMsg(){
        String result=Nthpower.isPowerOfFour(0);
        assertEquals("number should not be zero",result);
    }


}