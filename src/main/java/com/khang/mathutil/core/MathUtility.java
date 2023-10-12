/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khang.mathutil.core;

/**
 *
 * @author khang
 */
public class MathUtility {
    //class này chưa các hàm statci dùng chung cho mọi nơi 
    //khi nào dùng static : khi ta làm các hàm mà chỉ xử lí xong rồi return
    //ko cần lưu trữ lại thông tin vào instance variable - đặc tính của object

    public static final double PI = 3.14;

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be 0 ");
        

        if (n == 0 || n == 1) 
            return 1; //nếu n đặc biệt, ta return sớm luôn
        

        long result = 1; //sống sót dến lệnh này , sure n =2 ..20

        for (int i = 2; i <= n; i++) 
            result *= i;
        

        return result;
    }

}
