
import com.khang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khang
 */
public class MathUtilityDDTTest {
    
    //ta tách riêng bộ data kiểm thử ra khỏi câu lệnh so sánh
    //kĩ thuật này gọi là DDT - Data Driven Testing
    //Kiểm thử hàm, app mà tách riêng bộ data ra 1 chỗ để kiẻm
    //Soát sự thiếu đủ của các test case, các test data
    //data test 
    
    
//    0! -> 1
//    1! -> 1
//    2! -> 2 
//    3! -> 6
//    4! -> 24
//    5! -> 120
    // thấy mùi của mảng 2 chiều
    
    public static Object[][] initData() {
        //int [] a =  {phần tử của mảng 1 chiều cách nhau}
        Object[][] testData = {{0, 1}, 
                               {1, 1}, 
                               {2, 2},
                               {4, 24},
                               {5, 120}
                              //n expected
        };
        return  testData;
    }
    
    @ParameterizedTest
    @MethodSource("initData") // lấy gốc data
    public void verifyFactorialGivenRightArgumentReturnsOk(int n , long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
