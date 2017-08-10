package com.javacodegeeks.example;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator calculator;

    @Before
    public void init() {
        calculator = new StringCalculator();
    }

    @Test
    public void testDefaultDelimiters() {
        String input = "1\n2,3";
        assertEquals(6, calculator.add(input));
    }

    @Test
    public void testMultiDelimiters() {
        String input = "//[***][%]\n1***2%3";
        assertEquals(6, calculator.add(input));
    }

    @Test
    public void testNumbersMoreThan1000() {
        String input = "//[***][%]\n1***2%3,2000";
        assertEquals(6, calculator.add(input));
    }

//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//
//    @Test
//    public void add() throws Exception {
//    }

}