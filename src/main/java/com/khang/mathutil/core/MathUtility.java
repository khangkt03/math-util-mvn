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

   
    // 5! = 1,2,3,4  5
    // 5! =  4! X 5 = 5 X 4!
       
     public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be 0 ");
        

        if (n == 0 || n == 1) 
            return 1;
        return n * getFactorial(n - 1);
        
       //Tối ưu code, thay ruột của cái hàm để code chạy ngon hơn
       //nhanh hơn, hoặc code viết đẹp hơn
       //hoặc fix bug thì phải sửa code
       //Dù bạn sửa code vì lí do gì , thì code phải dc test lại
       //Và test lại để đảm bảo bằng nó vẫn xanh như lần trước
       //Nếu ta viết code code đi kèm test script thì việc test lại cái
       //Hàm sẽ cực nhanh, ko cần dùng dể mắt để dò từng dòng lệnh đúng sai
       //Mà chỉ nhìn màu xanh là đủ -> Vì Hàm trả về như expected
       //Test lại những gì từng test -> Regressions Test
       //Kiểm thử lại hàm lúc này cực nhanh, vì GitHub lo hết
    }

    
    
    
    
    
// public static final double PI = 3.14;
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid n. n must be 0 ");
//        
//
//        if (n == 0 || n == 1) 
//            return 1; //nếu n đặc biệt, ta return sớm luôn
//        
//
//        long result = 1; //sống sót dến lệnh này , sure n =2 ..20
//
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        
//
//        return result;
//    }

}
