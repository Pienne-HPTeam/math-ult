/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.test;

import com.fu.mathultil.MathUtility;
import static com.fu.mathultil.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.lang.IllegalArgumentException;

/**
 *
 * @author atbgl
 */
public class MathUltTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult() throws IllegalAccessException{
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        
        //mình test tiếp các trường hợp khác , đúng đầu vào , đúng đầu ra
        //khỏi cần biến trung gian , chơi luôn trong lệnh
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        
        
        
        
    }
    //điều gì xảy ra nếu ta đưa vào tham số cà chớn , số âm hoặc > 20
    //theo thiết kế của hàm , đưa vào cà chớn sẽ ném ra ngoại lệ
    //và ta cần test xem ngoại lệ có được ném ra không nếu ta cà chớn
    //tức là nếu xuất hiện ngoại lệ nếu cà chỡn đưa vào thì code chạy được
    //THẤY NGOẠI LỆ KHI CÓ CÀ CHỚN THÌ MÌNH LẠI MỪNG VÌ MÌNH ĐÃ ĐÚNG
    //có đúng là khi chạy hàm này thì ném ra ngoại lệ tên là IllegalArgument
    //nếu đúng thì sẽ ném ra ngoại lệ cùng tên , code đúng rồi , thì ra màu 
    @Test(expected = IllegalArgumentException)
        public void testFactorialWrongArgumentThrowsException() throws IllegalAccessException{
            //mình test tình huống hàm ném ra ngoại lệ nếu tham số cà chớn
            //ngoại lệ là thứ không phải là value để so sánh
            //không dùng assertEquals() được
            //TA PHẢI DÙNG CHIÊU KHÁC
            //JUnit4 khác 5 ở chỗ bắt ngoại lệ
            //Kì 5 đi dự thính SWE301 đi dự thính lớp thầy Hoàng: DI , LambdaExpression
            //liên quan đến Dependency Injection, SOLID
            getFactorial(-5);
        }
    
}
