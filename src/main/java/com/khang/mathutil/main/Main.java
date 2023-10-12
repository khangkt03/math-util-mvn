/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.khang.mathutil.main;

import com.khang.mathutil.core.MathUtility;

/**
 *
 * @author khang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //TEST case #1 -Xem chi tiết mô tả ô dưới (case n = 0 | 0!)
        int n = 0; // tính huống kiểm tra 0!
        long expected = 1; //0! hy vọng là 1; ko cần lập trình cx ra kq này
        long actual = MathUtility.getFactorial(n); //0! thực tế là mấy, gọi là hàm và run là biết ngay

        // so sánh giữa expected == actual hay ko ??
        System.out.println("0! -> expected = " + expected
                              + " | actual = " + actual);
        
        //Cách 1 : kiểm thử = sức người : mắt nhìn, não nghỉ
        
        
        //Test case #2 - mô tả ô dưới
        n = 1;
        expected = 1 ;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! -> expected = " + expected
                              + " | actual = " + actual);
        
       // test case #3 - mô tả ở dưới, dùng n =5 
        
       System.out.println("5! -> expected = " + expected
                              + " | actual = " + MathUtility.getFactorial(5));
    }

}

// Test case #2: Chech getFactorial(With n = 5)
//STEPS/PROCEDURES:
//          1. given  n = 5;
//          2. call/invoke getFactorial(n = 5)

//EXPECTED RESULT
//                the method return 1 (standing for 5! = 120)
//STATUS: PASSED? OR FAILED? - to be update later, when finshing TEST RUN



// Test case #2: Chech getFactorial(With n = 1)
//STEPS/PROCEDURES:
//          1. given n = 1;
//          2. call/invoke getFactorial(n = 1)

//EXPECTED RESULT
//                the method return 1 (standing for 1! = 1)

//STATUS: PASSED? OR FAILED? - to be update later, when finshing TEST RUN

//  Dev phải test code của mình , có 3 cách
//Cách 1: In kết quả xử lí của hàm ra màn hình
// nhắc lại : công viêc của QC bao gồm
// Thiết kế test case, run test case, ghi lại bug(Logbug) nếu có 
//           TEST CASE  TEST RUN              LOG BUG > Jira, bugZilla
//  Test case :nói ra bạn sẽ test app như thế nào
//  bằng cách đưa vào data, giá trị kì vọng, cách dùng app vs
//  bộ data đó như thế nào
//Test Run : lát rồi  thử app xem sao
//ĐỀ THI PE THIẾT KẾ TEST CASE 
//TA THIẾT KẾ TEST CASE ĐỂ TEST TÍNH GIAI THỪA TA VỪA VIẾT 
// TEST CODE THÌ ĐƯỢC GỌI LÀ UNIT TEST
//TEST CASE CHO UNIT TEST THÌ DC GỌI LÀ  "UNIT TEST" TEST CASSE
//TEST CASE #1: Check getFactorial() with n =0
//STEPS / PROCEDURES:
//                   1. Given n = 0
//                   2. Invoke/call getFactorial(n = 0)
//EXPECTED RESULT: the method return 1 stands for 0! = 1 
//STATUS         : PASSED? or FAILED? => Lúc chạy mới biết được kết quả gọi là TEST RUN
                                               // Và có thể Test nhìu  lần
