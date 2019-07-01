package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;
    @Before
    public  void setUp(){
        System.out.println("Before");
        factorial=new Factorial();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        factorial=null;
    }
    @Test
    public void factorialLongCheck(){
        String result=Factorial.findFactorialLong(12);
        assertEquals("factorial is 479001600",result);
    }
    @Test
    public void LongfactorialCheckPrintOutOfRangeErr(){
        String result=Factorial.findFactorialLong(21);
        assertEquals("factorial is out of range",result);
    }
    @Test
    public void factrorialIntCheck(){
        String result=Factorial.findFactorialInt(6);
        assertEquals("factorial is 720",result);
    }
    @Test
    public void factrorialIntCheckAndPrintOutOfRangeErr(){
        String result=Factorial.findFactorialInt(17);
        assertEquals("factorial is out of range",result);
    }



}