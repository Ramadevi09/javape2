package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public  void setUp(){
        System.out.println("Before");
        palindrome=new Palindrome();

    }
    @After
    public void tearDown(){
        System.out.println("After");
        palindrome=null;
    }
    @Test
    public void CheckgivenIntegerisPalindromAndShouldReturnPalindrom(){
        String result= Palindrome.reverse(121);
        assertEquals("palindrom",result);
    }
    @Test
    public void CheckgivenIntegerisNotPalindromAndShouldReturnMessage(){
        String result= Palindrome.reverse(123);
        assertEquals("not palindrom",result);
    }
    /*@Test
    public void reverseOfNum(){
        String result=Palindrome.reverse(123);
        assertEquals("321",result);
    }*/




}