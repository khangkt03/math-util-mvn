/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.khang.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author khang
 */
public class MathUtilityTest {
    
    //TEST CASE  TEMPLATE//STRUCTURE
    // ID | DESC | STEP/PROCEDURES | EXPECTED VALUE | STATUS (PASSED/FAILED)
    
    //Test case #1: Verify the getFactorial() function  with n =0
    //Steps/Procedures "
    //              1. Given n =0
    //              2. Call/Invoke = getFactorial(int n)
    //Expected Result
    //               The method getFactorial(n = 0) must return 1 
    //                    as the result of 0! ==1
    // Status : PASSED | FAILED đoán xem khi chạy APP/HÀM/METHOD
    
    //Test case #1.... n =0
    @Test //dính dáng đén thuật ngữ framework
    public void verifyFactorialGienRightArgument0ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //Test case #2 .... n =1
     @Test //dính dáng đén thuật ngữ framework
    public void verifyFactorialGienRightArgument1ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    
    //Test case #3 .... n =6
     @Test //dính dáng đén thuật ngữ framework
    public void verifyFactorialGienRightArgument6ReturnOk(){
        assertEquals(720, MathUtility.getFactorial(6));
    }
}
