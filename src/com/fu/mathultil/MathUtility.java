/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathultil;

/**
 *
 * @author atbgl
 */
public class MathUtility {
    public static final double PI = 3.1415;
    // 0! = 1! = 1 
    public static long getFactorial(int n) throws IllegalAccessException{
        if (n<0 || n>20)
            throw new IllegalAccessException("Invalid argument, "
                    + "must be between 0..20");
        
        if (n == 0 || n ==1)
            return 1;
        
        long result = 2;
        for (int i = 2; i <= n ; i++)
            result *= i;
        //n! = 1.2.3.4.5.......n
        return result;
    }
}

//Viết xong code thì phải test code
//Test ngay từng hàm, từng class trước khi ráp vào toàn bộ app
//test ngay khi xong hàm, xong class được gọi là test mức độ 1, được gọi là UnitTest(JUnit) test mức độ code.
//Làm sao để test , có nhiều cách
//1. Cách 1: sout(gọi hàm()) để in ra kết quả xử lí của hàm
//2. Cách 2: JOptionPane để popup lên kết quả
//3. Cách 3: Ghi ra LOG File, hoặc là ra trang web
//Cả 3 cách này đều phải dùng mắt để xem kết quả và kết luận đúng sai
//đúng: tức là hàm chạy ra 1 giá trị - ACTUAL ACTIVE và ta thấy ACTUAL ACTIVE khớp, gọi là ỄPCTED VALUE
// trị mà ta mong muốn, ta tính trước = tay và trả về như ta mong đợi
// hàm chạy đúng 5!
//sai: tui test 6 giai thừa test 6! , expected = 720 , chạy ra actual = 120
// hàm xử lí sai