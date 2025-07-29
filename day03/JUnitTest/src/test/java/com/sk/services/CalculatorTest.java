package com.sk.services;

import org.junit.jupiter.api.*;

@DisplayName("Calculator Class Test")
public class CalculatorTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All Tests");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before Each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All Tests");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After Each");
    }

    @Test
    @Tag("Calculator")
    public void addTwoNumbersTest(){
        System.out.println("Test 1");
        int actualResult = Calculator.addTwoNumbers(12, 13);
        int expectedResult = 25;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addAllNumbersTest(){
        System.out.println("Test 2");
        int actualResult = Calculator.addAllNumbers(2,4,6,8);
        int expectedResult = 20;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
